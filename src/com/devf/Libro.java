package com.devf;

import java.util.ArrayList;

/**
 * Created by Silmood on 26/08/15.
 */
public class Libro {

    private String nombre;
    private int numAutores;
    private double precio;
    private int cantidadStock;
    private ArrayList<Autor> autores;

    public Libro (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = 0;
        this.numAutores = 0;
        this.autores = new ArrayList<>();
    }

    public Libro(String nombre, int cantidadStock, double precio) {
        this.nombre = nombre;
        this.cantidadStock = cantidadStock;
        this.precio = precio;
        this.numAutores = 0;
        this.autores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumAutores() {
        return numAutores;
    }

    public void setNumAutores(int numAutores) {
        this.numAutores = numAutores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public void addAutor (Autor autor){
        autores.add(autor);
    }

    public void printAutor(){
        for(Autor autor : this.autores){
            System.out.println(autor.toString());
        }
    }
}
