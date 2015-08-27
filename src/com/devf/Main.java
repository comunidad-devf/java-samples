package com.devf;


public class Main {

    public enum STATES {
        OPEN,
        CLOSE
    }

    public static void main(String[] args) {

        Libro harryPotter = new Libro("La piedra filosofal", 300);
        Autor jkRowlling = new Autor("JK Rowlling", 'f');

        harryPotter.addAutor(new Autor("JK Rowlling", 'f'));
        harryPotter.addAutor(new Autor("JD Johnson", 'm'));

        harryPotter.printAutor();
    }
}
