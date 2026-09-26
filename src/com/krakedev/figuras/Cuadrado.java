package com.krakedev.figuras;

public class Cuadrado extends Figura {
	private double lado;

    public Cuadrado(String nombre, String color, double lado) {
        super(nombre, color);
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
