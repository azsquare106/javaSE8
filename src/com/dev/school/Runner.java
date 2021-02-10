package com.dev.school;

import javax.swing.*;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        /*
        String s1 = new String("Carlos Ivan Nieblas");
        String s2 = new String("Patricia");
        System.out.println(s1.equals(s2));
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.charAt(2));
        System.out.println(s1.substring(2));

        */

        int x =2;

        int[] z = new int[3];
        z[0] = 5;
        z[1] =10;
        z[2] = 9;


        String uno = new String("Carlos");
        String dos = new String("Patricia");

        ArrayList<String> listStrings = new ArrayList<String>();


        listStrings.add(uno);
        listStrings.add(dos);

        for ( String str: listStrings) {
            System.out.println(str.toUpperCase());
        }

        for(int i =0; i< listStrings.size(); i++){
            String temporal = listStrings.get(i);
            System.out.println((temporal.toUpperCase()));
        }












    }
}
