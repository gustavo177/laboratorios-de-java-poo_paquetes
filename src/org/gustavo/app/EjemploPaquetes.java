package org.gustavo.app;
import  org.gustavo.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Gustavo";
        System.out.println(p.nombre);

        Perro perro = new Perro();

        perro.nombre = "Tobias";
        perro.raza = "Golden";

        System.out.println("perro.nombre = " + perro.nombre);
        System.out.println("perro.raza = " + perro.raza);
    }
}
