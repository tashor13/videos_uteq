package com.example.apiropa;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    private String imagen;
    private String categoria;
    public Producto(JSONObject a) throws JSONException {
        nombre =  a.getString("title").toString();

        precio =  a.getDouble("price");
        descripcion =  a.getString("description").toString() ;
        imagen = a.getString("image").toString() ;
        categoria = a.getString("category").toString() ;
    }

    public static ArrayList<Producto> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Producto> productos = new ArrayList<>();

        for (int i = 0; i < datos.length() && i<20; i++) {
            productos.add(new Producto(datos.getJSONObject(i)));
        }
        return productos;
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
