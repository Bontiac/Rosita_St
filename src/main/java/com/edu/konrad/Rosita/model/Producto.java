package com.edu.konrad.Rosita.model;

public class Producto {
    private String imagen;
    private String nombre;
    private double precio;
    private double stock;
    private boolean disponibilidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getDisponivilidad() {
        return disponibilidad;
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

}
