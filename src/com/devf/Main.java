package com.devf;


public class Main {

    public enum STATES {
        OPEN,
        CLOSE
    }

    public static void main(String[] args) {

        Cerveza bohemia = new Cerveza("Bohemia obscura", 3.5);

        bohemia.refrescar();
        bohemia.digestion();
        bohemia.evaporar();
    }
}
