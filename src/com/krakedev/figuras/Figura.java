package com.krakedev.figuras;

public class Figura {

    private String nombre;
    private String color;
    
    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public class Graficador {
        public void graficar(Figura figura) {
            System.out.println("Graficando " + figura.getNombre().toUpperCase()
                    + " de color " + figura.getColor().toUpperCase());
        }
    }

    @Override
    public String toString() {
        return "Figura [nombre=" + nombre + ", color=" + color + "]";
    }
    
}
