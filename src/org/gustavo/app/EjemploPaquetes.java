package org.gustavo.app;

import org.gustavo.app.hogar.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Gustavo";
        System.out.println(p.nombre);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        try {
            p.fecha = formatter.parse("10-05-22");
            System.out.println("Fecha de nacimiento: " + p.fecha );
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Perro perro = new Perro();
        perro.nombre = "Tobias";
        perro.raza = "Golden";
        perro.anioNacimiento = 2022;

        System.out.println("perro.nombre = " + perro.nombre);
        System.out.println("perro.raza = " + perro.raza);
        System.out.println("perro.anioNacimiento = " + perro.anioNacimiento);
    }
}
