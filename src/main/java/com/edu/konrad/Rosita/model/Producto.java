package com.edu.konrad.Rosita.model;

public class Producto {
    private String imagen;
    private String nombre;
    private double precio;
    private double stock;
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(double stock){
        this.stock=stock;
    }

    public double getStock(){
        return stock;
    }

    public void setImagen(String imagen){
        this.imagen=imagen;
    }

    public String getImagen(){
        return imagen;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

    public String getEstado(){
        return estado;
    }

}
