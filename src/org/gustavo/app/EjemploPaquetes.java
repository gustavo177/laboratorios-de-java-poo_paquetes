package org.gustavo.app;
import  org.gustavo.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Gustavo";
        System.out.println(p.nombre);

        Gato g = new Gato();
        g.nombre = "michi";
        System.out.println(g.nombre);
    }
}
