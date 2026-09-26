package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestPerimetro {
    public static void main(String[] args) {
        Graficador graficador = new Graficador();

        Figura cuadrado = new Cuadrado("Cuadrado", "Rojo", 5);
        Figura rectangulo = new Rectangulo("Rectangulo", "Azul", 4, 6);
        Figura triangulo = new Triangulo("Triangulo", "Verde", 4, 3, 3, 4, 5);
        Figura hexagono = new Hexagono("Hexagono", "Morado", 3);
        Figura trianguloRectangulo = new TrianguloRectangulo("TrianguloRectangulo", "Amarillo", 3, 4);

        graficador.graficar(cuadrado);
        graficador.graficar(rectangulo);
        graficador.graficar(triangulo);
        graficador.graficar(hexagono);
        graficador.graficar(trianguloRectangulo);
    }
}
