package com.testAutomationCoach.aAbstraccion;

public class EjemploCancion {

    public static void main(String[] args) {

        Cancion tusa = new Cancion("tusa", "Karol G");
        tusa.grabar("Pero si le pone la canción",60,2020);
        tusa.editar("Pero si le pone la canción le da una sensacion");
        tusa.reproducir();
        Cancion Unacancion = new Cancion("Una cancion","Los de adentro");
        Unacancion.grabar("Una cancion para ti, para mi", 120,2007);
        Unacancion.editar("Una canción para mi, para ti, turururu");
        Unacancion.reproducir();
    }
}