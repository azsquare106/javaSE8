package com.dev.university;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

       Lenguaje o1 = new Lenguaje ();
       o1.setNombre("Español");

       Lenguaje o2 = new Lenguaje ();
       o2.setNombre("Inglés");

       Profesor p1 = new Profesor ();
       p1.setNombre("Antonio");
       p1.setIdioma(o1);

       Profesor p2 = new Profesor ();
       p2.setNombre("Miguel");
       p2.setIdioma(o2);

       Materia m1 = new Materia ();

       m1.setNombre("Sistema de Antenas");
       m1.setMaestro(p1);

       Materia m2 = new Materia ();
       m2.setNombre("Redes");
       m2.setMaestro(p2);

       Materia m3 = new Materia ();
       m2.setNombre("Fibra Óptica");
       m2.setMaestro(p2);

       ArrayList<Materia> arrayM = new ArrayList<>();

       arrayM.add(m1);
       arrayM.add(m2);

       Estudiante e1 = new Estudiante ();
       e1.setNombre("Patricia");
       e1.setMatricula(1234);
       e1.setMaterias(arrayM);

       ArrayList<Estudiante> arrayE = new ArrayList<>();

       arrayE.add(e1);

       Aula a1 = new Aula ();
       a1.setNombre("Taller Redes");
       a1.setIdentificador(405);

       Aula a2 = new Aula ();
       a2.setNombre("Cisco");
       a2.setIdentificador(203);

       ArrayList<Aula> arrayA = new ArrayList<>();
       arrayA.add(a1);
       arrayA.add(a2);

       Universidad u1 = new Universidad ();

       u1.setNombreUniversidad("UANL");
       u1.setEstudiantes(arrayE);
       u1.setAulas(arrayA);

       // Imprimir el lenguaje de los maestros de la UANL

        ArrayList<Estudiante> x = u1.getEstudiantes();
        Estudiante y = x.get(0);
        ArrayList<Materia> z = y.getMaterias();
        Materia a = z.get(1);
        Profesor b = a.getMaestro();
        Lenguaje c = b.getIdioma();

        System.out.println(c.getNombre());
        System.out.println(b.getNombre());












    }
}
