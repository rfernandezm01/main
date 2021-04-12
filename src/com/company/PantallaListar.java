package com.company;

public class PantallaListar {
    void  mostrar () {
        Titulo titulo =  new Titulo ();
        titulo . mostrar ( " NOTAS GUARDADAS " );

        for(Libreta libreta: Main.libreta.libretas){
            System.out.println(libreta.libretas);
        }
    }
}
