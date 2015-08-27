package com.devf;

/**
 * Created by Silmood on 26/08/15.
 */
public class Autor {

    private String nombre;
    private String email;
    private char genero;

    public Autor(String nombre, char genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", genero=" + genero +
                '}';
    }
}
