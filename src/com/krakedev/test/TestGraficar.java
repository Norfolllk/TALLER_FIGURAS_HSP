package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestGraficar {
    public static void main(String[] args) {
        Graficador graficador = new Graficador();

        Figura figura = new Figura("Figura", "Blanco");
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo");
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Verde");

        graficador.graficar(figura);
        graficador.graficar(cuadrado);
        graficador.graficar(rectangulo);
    }
}
