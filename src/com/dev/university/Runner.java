package com.dev.university;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        Materia m1 = new Materia();
        m1.setNombre("Calculo");
        Materia m2 = new Materia();
        m2.setNombre("Redes");
        Materia m3 = new Materia();
        m3.setNombre("Telefonia");

        ArrayList<Materia> materias = new ArrayList<>();
        materias.add(m1);
        materias.add(m2);
        materias.add(m3);

        Estudiante e1  = new Estudiante();
        e1.setNombre("Carlos");
        e1.setMatricula(123);
        e1.setMaterias(materias);



        Estudiante e2 = new Estudiante();
        e2.setNombre("Patricia");
        e2.setMatricula(567);



        Universidad universidad = new Universidad();
        universidad.setNombreUniversidad("UANL");

        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(e1);
        estudiantes.add(e2);

        universidad.setEstudiantes(estudiantes);
        universidad.printEstudiantes();



        ArrayList<Estudiante> x = universidad.getEstudiantes();
        Estudiante est1=x.get(0);
        ArrayList<Materia> z=est1.getMaterias();
        for(int xx=0; xx<z.size(); xx++){
            System.out.println(z.get(xx).getNombre());
        }







    }
}
