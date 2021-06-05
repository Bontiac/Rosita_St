package com.edu.konrad.Rosita.dto;

public class ProductoDTO {
    private String id;
    private String imagen;
    private String nombre;
    private double precio;
    private double stock;
    private String estado;

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public String getImagen() {

        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public double getPrecio() {

        return precio;
    }

    public void setDouble(double precio) {

        this.precio = precio;
    }

    public double getStock() {

        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

}
