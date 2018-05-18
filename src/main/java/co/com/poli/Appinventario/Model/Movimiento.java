/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.Model;

/**
 *
 * @author ISABEL MEDINA
 */
public class Movimiento {
    
    private String id_movimiento;
    private Producto producto;
    private Double cantidad;
    private String tipo;
    private Double precio;

    public Movimiento(String id_movimiento, Producto producto, Double cantidad, String tipo, Double precio) {
        this.id_movimiento = id_movimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(String id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    

    
    
}
