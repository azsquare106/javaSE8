package com.dev.university;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Universidad {

     private String nombreUniversidad;
     private ArrayList<Estudiante> estudiantes;

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /*
      Imprimir los Estudiantes.
     */
    public void printEstudiantes(){

        for (int i=0; i< estudiantes.size(); i++){
            System.out.println(estudiantes.get(i).getNombre() + " *** "+estudiantes.get(i).getMatricula());
        }
    }
}
