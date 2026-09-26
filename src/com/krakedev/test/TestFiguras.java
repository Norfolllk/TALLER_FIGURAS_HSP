package com.krakedev.test;

import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {
    public static void main(String[] args) {
        Figura figura = new Cuadrado("Cuadrado", "Azul", 5);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 4);
        Triangulo triangulo = new Triangulo("Triangulo", "Azul", 4, 3, 3, 4, 5);

        System.out.println(figura);
        System.out.println(cuadrado);
        System.out.println(triangulo);
    }
}