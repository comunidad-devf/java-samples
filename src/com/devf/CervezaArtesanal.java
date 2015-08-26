package com.devf;


public class CervezaArtesanal extends Cerveza{

    private CervezaArtesanal(String nombre, double gradosDeAlcohol) {
        super(nombre, gradosDeAlcohol);

        System.out.println(this.nombre);
    }
}
