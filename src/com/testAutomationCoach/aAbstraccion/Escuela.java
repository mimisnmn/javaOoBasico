package com.testAutomationCoach.aAbstraccion;

public class Escuela {
    //edificios, salones, personas: directivo, maestro, aseistente, alumnos, materias, mobiliario
    Edificio[] edificios;
    Persona[] personal;
}

class Edificion  {
    int numEdif;
    double areaEdificio;
    Salonn[] salones;
}

class Salonn {
    String id;
    int capacidad;
    Inmobiliarion[] muebles;
    //Butacas[] butaca;
}

class Inmobiliarion {
    String idInventario;
    String tipo;
}

class Personan {
    String nombre;
    char sex;
    String cargo;
}






