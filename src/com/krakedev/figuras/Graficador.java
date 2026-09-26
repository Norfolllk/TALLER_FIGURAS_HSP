package com.krakedev.figuras;

public class Graficador {
    public void graficar(Figura figura) {
        System.out.println("Graficando " + figura.getNombre().toUpperCase()
                + " de color " + figura.getColor().toUpperCase());

        figura.calcularPerimetro(); // ERROR: Figura no declara este método todavía
    }
}
