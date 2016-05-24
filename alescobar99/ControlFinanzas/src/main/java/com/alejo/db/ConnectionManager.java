package com.alejo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionManager {
  
  public static void crearBaseDeDatos() {
    Connection conexion = null;
    PreparedStatement preparedStatement = null;
    
    try {
      Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
      conexion = DriverManager.getConnection("jdbc:derby:./Data/finanzas.bd;create=true");  
      
      String tablaConceptos = "CREATE TABLE CONCEPTOS(CODIGO INTEGER, NOMBRE VARCHAR(15))";
      String tablaCuentas = "CREATE TABLE CUENTAS(CODIGO INTEGER, NOMBRE VARCHAR(50), CLASIFICACION VARCHAR(15))";
      String tablaTransacciones = " CREATE TABLE TRANSACCIONES(FECHA DATE, CODIGO_CUENTA INTEGER, CODIGO_CONCEPTO INTEGER)";
      
      preparedStatement = conexion.prepareStatement(tablaCuentas);
      preparedStatement.executeUpdate();
      preparedStatement.close();
      
      preparedStatement = conexion.prepareStatement(tablaTransacciones);
      preparedStatement.executeUpdate();
      preparedStatement.close();
      
      System.out.println("Funca");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        conexion.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
  
  public static void main(String[] args) {
    crearBaseDeDatos();
  }
}
