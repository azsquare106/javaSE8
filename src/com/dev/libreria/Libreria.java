package com.dev.libreria;

import java.util.ArrayList;

public class Libreria {

    private String nombre;
    private ArrayList<Seccion> secciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(ArrayList<Seccion> secciones) {
        this.secciones = secciones;
    }
}
