package com.devf;


class Cerveza extends Bebida implements Droga{

    protected String nombre;
    private double gradosDeAlcohol;
    private double temperatura;

    public Cerveza(String nombre, double gradosDeAlcohol) {
        nombre = nombre;
        this.gradosDeAlcohol = gradosDeAlcohol;
        this.temperatura = 3;
    }

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGradosDeAlcohol() {
        return gradosDeAlcohol;
    }

    protected void setGradosDeAlcohol(double gradosDeAlcohol) {
        this.gradosDeAlcohol = gradosDeAlcohol;
    }

    @Override
    public void intoxicacion() {
        System.out.println("Estás borracho");
    }

    @Override
    public void adiccion() {
        System.out.println("Vamos por chelas al oxxo");
    }

    @Override
    public void refrescar() {
        if (temperatura < 5)
            System.out.println("Te refresque bastante");
        else
            System.out.println("Esta caliente");
    }

    @Override
    public void digestion() {
        this.intoxicacion();
    }
}
