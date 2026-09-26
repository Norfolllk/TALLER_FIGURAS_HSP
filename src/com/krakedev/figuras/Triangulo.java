package com.krakedev.figuras;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double ladoA, ladoB, ladoC;

    public Triangulo(String nombre, String color, double base, double altura,
                      double ladoA, double ladoB, double ladoC) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
