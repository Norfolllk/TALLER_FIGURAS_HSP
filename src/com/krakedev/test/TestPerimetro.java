package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestPerimetro {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 5);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Azul", 4, 6);

        System.out.println("Perímetro cuadrado: " + cuadrado.calcularPerimetro());
        System.out.println("Perímetro rectángulo: " + rectangulo.calcularPerimetro());
    }
}
