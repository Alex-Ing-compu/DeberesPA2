package com.uce.edu.paquete;

public class Venta {

    private String cliente;
    private String tipo;
    private double monto;
    private double descuento;
    private double total;

    public Venta(String cliente, String tipo, double monto) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.monto = monto;
    }

    //getters and setters
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    
    
}
