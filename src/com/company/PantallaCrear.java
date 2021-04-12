package com.company;

public class PantallaCrear {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Crear Datos");

        Nota nota = new Nota();

        Texto campoDeTexto = new Texto();

        nota.titulo = campoDeTexto.pedir("Nombre de Contacto", true);
        nota.contenido = campoDeTexto.pedir("Apellido", false);
        nota.edad = campoDeTexto.pedir("Introduce tu edad", true);

        Main.libreta.libretas.equals(nota);
    }
}
