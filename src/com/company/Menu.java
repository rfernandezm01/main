package com.company;


public class Menu {
    String seleccion (String[] opciones) {
        boolean seguirpedir = true;
        String seleccion = "";
        while (seguirpedir) {
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + "." + opciones[i]);
            }
            System.out.println("\nSelecciona");

            seleccion = Main.scanner.next();

            if (Integer.valueOf(seleccion) > opciones.length) {
            } else {
                seguirpedir = false;
            }

        }
        return seleccion;
    }
}
