package com.dev.tienda;

import java.util.ArrayList;

public class Ejecutadora {

    public static void main(String[] args) {

       Precio p1 = new Precio ();
       p1.setPrecio(1000);

       Precio p2 =  new Precio ();
       p2.setPrecio(500);

        ArrayList<Precio> arrayP = new ArrayList<>();
        arrayP.add(p1);
        arrayP.add(p2);

        Color c1 = new Color ();
        c1.setColor("Negro");

        Color c2 = new Color ();
        c2.setColor("Azul");

        Color c3 = new Color ();
        c3.setColor("Blanco");

        ArrayList<Color> arrayC = new ArrayList<>();
        arrayC.add(c1);
        arrayC.add(c2);
        arrayC.add(c3);

        Talla t1 = new Talla ();
        t1.setTalla("Chica");

        Talla t2 = new Talla ();
        t2.setTalla("Mediana");

        Talla t3 = new Talla();
        t3.setTalla("Grande");

        ArrayList<Talla> arrayT = new ArrayList<>();
        arrayT.add(t1);
        arrayT.add(t2);
        arrayT.add(t3);

        Vestido v1 = new Vestido();
        v1.setColor("Negro");
        v1.setPrecio(1000);
        v1.setTalla("Chica");

        Vestido v2 = new Vestido();
        v2.setColor("Blanco");
        v2.setPrecio(800);
        v2.setTalla("Chica");

        ArrayList<Vestido> arrayV = new ArrayList<>();
        arrayV.add(v1);
        arrayV.add(v2);

        Pantalon pt1 = new Pantalon();
        pt1.setTalla("Mediana");
        pt1.setPrecio(1200);
        pt1.setColor("Azul");

        ArrayList<Pantalon> arrayPt = new ArrayList<>();
        arrayPt.add(pt1);

        Ropa r1 = new Ropa();
        r1.setDresses(arrayV);
        r1.setJeans(arrayPt);

        System.out.println(r1.getDresses().get(1).getPrecio());
        System.out.println("El vestido de color "+r1.getDresses().get(0).getColor()+ " cuesta "+r1.getDresses().get(0).getPrecio());






    }
}
