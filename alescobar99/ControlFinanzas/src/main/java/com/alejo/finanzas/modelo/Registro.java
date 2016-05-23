package com.alejo.finanzas.modelo;

import java.math.BigDecimal;
import java.util.Date;

public class Registro {

    private Date fecha;
    private CuentaContable cuenta;
    private BigDecimal valor;
    private String concepto;
    private String subConcepto;

    public Registro() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public CuentaContable getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaContable cuenta) {
        this.cuenta = cuenta;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getSubConcepto() {
        return subConcepto;
    }

    public void setSubConcepto(String subConcepto) {
        this.subConcepto = subConcepto;
    }
}
