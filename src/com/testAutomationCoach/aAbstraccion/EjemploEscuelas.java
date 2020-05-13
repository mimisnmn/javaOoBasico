package com.testAutomationCoach.aAbstraccion;

class EjemploEscuela {
    public static void main(String[] args) {

        Personan dire = new Personan();
        dire.nombre = "Elizabeth Warren";
        dire.sex = 'F';
        dire.cargo = "Directora";

        Personan prof= new Personan();
        prof.nombre = "Elizabeth Lopez";
        prof.sex = 'F';
        prof.cargo = "Profesor";

        Personan estudiante = new Personan();
        estudiante.nombre="Noemi Mejia";
        estudiante.sex='F';
        estudiante.cargo="estudiante";

        Inmobiliarion pizarron = new Inmobiliarion();
        pizarron.idInventario="3";
        pizarron.tipo="pizarron";

        Inmobiliarion borrador = new Inmobiliarion();
        pizarron.idInventario="4";
        pizarron.tipo="borrador";

        Inmobiliarion mesa = new Inmobiliarion();
        mesa.idInventario="1";
        mesa.tipo="mesa";

        Inmobiliarion silla = new Inmobiliarion();
        silla.idInventario="2";
        silla.tipo="silla";

        Salonn primeroA = new Salonn();
        primeroA.id = "1A";
        primeroA.capacidad = 45;

        Salonn terceroB = new Salonn();
        terceroB.id="3B";
        terceroB.capacidad=25;

        Inmobiliarion[] mueblesPrimeroA = new Inmobiliarion[100];
        mueblesPrimeroA[0] = mesa;
        mueblesPrimeroA[1] = silla;
        primeroA.muebles = mueblesPrimeroA;

        Inmobiliarion[] mueblesTerceroB = new Inmobiliarion[10];
        mueblesTerceroB[0] = pizarron;
        mueblesTerceroB[10]= borrador;


        Edificion primaria = new Edificion();
        primaria.numEdif = 1;
        primaria.areaEdificio = 1000.0;
        primaria.salones = new Salonn[12];
        primaria.salones[0] = primeroA;

        Escuela morelos = new Escuela();
        morelos.edificios = new Edificio[3];
        morelos.personal = new Persona[200];

      /*  morelos.edificios[0] = primaria;
        morelos.personal[0] = dire;
        morelos.personal[1] = prof;*/



    }
}