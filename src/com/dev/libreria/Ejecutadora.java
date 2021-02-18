package com.dev.libreria;

import java.util.ArrayList;

public class Ejecutadora {

    public static void main(String[]args){


        Autor a1 = new Autor();
        a1.setNombre("Albert");
        a1.setApellido("Camus");

        Autor a2 = new Autor();
        a2.setNombre("Aldous");
        a2.setApellido("Huxley");

        Autor a3 = new Autor ();
        a3.setNombre("Gustave");
        a3.setApellido("Flaubert");

        Autor a4 = new Autor();
        a4.setNombre("J.R.R.");
        a4.setApellido("Tolkien");



        Libros libro1 = new Libros ();
        libro1.setNombre("El extranjero");
        libro1.setAutorlibro(a1);

        Libros libro2 = new Libros();
        libro2.setNombre("El Hobbit");
        libro2.setAutorlibro(a4);

        Libros libro3 = new Libros();
        libro3.setNombre("Un mundo feliz");
        libro3.setAutorlibro(a2);

        Libros libro4 = new Libros();
        libro4.setNombre("Madame Bovary");
        libro4.setAutorlibro(a3);


        ArrayList<Libros> arrayL = new ArrayList<>();

        arrayL.add(libro2);
        arrayL.add(libro4);

        ArrayList<Libros> arrayF = new ArrayList<>();
        arrayF.add(libro1);
        arrayF.add(libro3);

    Seccion s1 = new Seccion();
    s1.setSeccion("Filosofía");
    s1.setBooks(arrayF);

    Seccion s2 = new Seccion();
    s2.setSeccion("Literatura Universal");
    s2.setBooks(arrayL);

    Seccion s3 = new Seccion();
    s3.setSeccion("Política");

    Seccion s4 = new Seccion();
    s4.setSeccion("Psicología");

    Seccion s5 = new Seccion();
    s5.setSeccion("Ciencia Ficción");

    ArrayList<Seccion> arrayS = new ArrayList<>();
    arrayS.add(s1);
    arrayS.add(s2);
    arrayS.add(s3);
    arrayS.add(s4);
    arrayS.add(s5);



    Libreria l1 = new Libreria();
    l1.setNombre("La librería");
    l1.setSecciones(arrayS);


    //Imprimir un mundo feliz de Aldous Huxley

            ArrayList<Seccion> x = l1.getSecciones();
            Seccion y =x.get(0);
            ArrayList<Libros> z = s1.getBooks();
            Libros a = z.get(1);
            Autor b = a.getAutorlibro();


            System.out.println(a.getNombre()+ " " +b.getNombre()+ " " +b.getApellido());



        }



}
