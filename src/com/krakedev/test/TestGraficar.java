package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestGraficar {
    public static void main(String[] args) {
        Graficador graficador = new Graficador();

        Figura figura = new Rectangulo("Rectangulo generico", "Blanco", 2, 2);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 4);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Verde", 4, 6);
        Triangulo triangulo = new Triangulo("Triangulo", "Naranja", 4, 3, 3, 4, 5);
        TrianguloRectangulo trianguloRectangulo =
                new TrianguloRectangulo("TrianguloRectangulo", "Amarillo", 3, 4);

        graficador.graficar(figura);
        graficador.graficar(cuadrado);
        graficador.graficar(rectangulo);
        graficador.graficar(triangulo);
        graficador.graficar(trianguloRectangulo);
    }
}