package com.alejo.finanzas.modelo;

import java.math.BigDecimal;

public class CuentaContable {

  private static enum Naturaleza {
    DEBITO, CREDITO;
  }

  public static enum Clasificacion {

    ACTIVO('A', Naturaleza.DEBITO), PASIVO('D', Naturaleza.CREDITO), PATRIMONIO('P', Naturaleza.CREDITO),

    INGRESO('I', Naturaleza.CREDITO), EGRESO('E', Naturaleza.DEBITO);

    private char tipo;
    private Naturaleza naturaleza;

    private Clasificacion(char tipo, Naturaleza naturaleza) {
      setTipo(tipo);
      setNaturaleza(naturaleza);
    }

    public char getTipo() {
      return tipo;
    }

    private void setTipo(char tipo) {
      this.tipo = tipo;
    }

    private Naturaleza getNaturaleza() {
      return naturaleza;
    }

    private void setNaturaleza(Naturaleza naturaleza) {
      this.naturaleza = naturaleza;
    }
  }

  private long codigo;
  private String nombre;
  private Clasificacion clasificacion;
  private BigDecimal saldo;

  public CuentaContable() {}

  public long getCodigo() {
    return codigo;
  }

  public void setCodigo(long codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Clasificacion getClasificacion() {
    return clasificacion;
  }

  public void setClasificacion(Clasificacion clasificacion) {
    this.clasificacion = clasificacion;
  }

  public BigDecimal getSaldo() {
    return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }

  public boolean isNaturalezaDebito() {
    return clasificacion.getNaturaleza().equals(Naturaleza.DEBITO);
  }

  public boolean isNaturalezaCredito() {
    return clasificacion.getNaturaleza().equals(Naturaleza.CREDITO);
  }

  public boolean isActivo() {
    return clasificacion.equals(Clasificacion.ACTIVO);
  }

  public boolean isPasivo() {
    return clasificacion.equals(Clasificacion.PASIVO);
  }

  public boolean isPatrimonio() {
    return clasificacion.equals(Clasificacion.PATRIMONIO);
  }

  public boolean isEgreso() {
    return clasificacion.equals(Clasificacion.EGRESO);
  }

  public boolean isIngreso() {
    return clasificacion.equals(Clasificacion.INGRESO);
  }
}
