package com.dev.university;

public class Materia {

    private String nombre;
    private Profesor maestro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getMaestro() {
        return maestro;
    }

    public void setMaestro(Profesor maestro) {
        this.maestro = maestro;
    }
}
