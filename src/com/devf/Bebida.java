package com.devf;

public abstract class Bebida implements Droga{


    public void evaporar (){
        System.out.println("Evaporandome");
    }

    public abstract void refrescar();
    public abstract void digestion();

    @Override
    public void intoxicacion() {

    }

    @Override
    public void adiccion() {

    }
}
