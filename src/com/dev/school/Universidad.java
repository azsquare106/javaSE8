package com.dev.school;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Universidad {

    private ArrayList<Materia> materias;
    private ArrayList<Estudiante> estudiantes;

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    //Mostrar estudiantes en la Universidad
    public void mostrarEstudiantes(ArrayList<Estudiante> estudiantes){

        for (Estudiante estudiante: estudiantes
             ) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getEdad());
        }
    }

    //Mostrar materias para todos los estudiantes de la Universidad

    public void mostrarMateriasPorEstudiante(ArrayList<Estudiante> estudiantes){

        for (Estudiante estudiante:estudiantes
             ) {
            ArrayList<Materia> materiasPorEstudiante = estudiante.getMaterias();
            for (Materia materia: materiasPorEstudiante
                 ) {
                //Imprimir materias por Estudiante
                    System.out.println(materia.getNombre());
            }
        }
    }


}
