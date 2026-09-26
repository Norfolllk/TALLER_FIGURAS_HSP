package com.krakedev.figuras;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
