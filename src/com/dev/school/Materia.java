package com.dev.school;

public class Materia {

    private String nombre;
    private int numeroCreditos;
    private Profesor profesor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }


    //Imprimir el nombre de una Materia en Mayusculas
    public void imprimirEnMayusculaLaMateria(){

        String materiaMayuscula = nombre.toUpperCase();
        System.out.println(materiaMayuscula);
    }
}
