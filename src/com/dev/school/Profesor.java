package com.dev.school;

import java.util.ArrayList;

public class Profesor {

    private String nombre;
    private String  profesion;
    private ArrayList<String>  lenguajes;



    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
