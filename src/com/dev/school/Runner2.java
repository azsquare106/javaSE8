package com.dev.school;

import java.util.ArrayList;

public class Runner2 {

    public static void main(String[] args) {

        Basquetbolista b1 = new Basquetbolista();
        b1.setNombre("kObe");
        b1.setEquipo("Lakers");

        Basquetbolista b2 = new Basquetbolista();
        b2.setNombre("Lebron");
        b2.setEquipo("Orlando");

        ArrayList<Basquetbolista> arrayList = new ArrayList<>();
        arrayList.add(b1);
        arrayList.add(b2);

        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i).getNombre());
        }


    }
}
