package com.company;

import java.io.File;
import java.util.Scanner;

public class PantallaMenu {

    boolean mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("BLOC DE NOTAS");    // // titulo = "BLOC DE NOTAS"

        Menu menu = new Menu();
        String[] opciones = {"Crear", "Listar", "Salir"};
        String opcion = menu.seleccion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("2".equals(opcion)){
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if("3".equals(opcion)){
            return false;
        }
        return true;
    }
}
