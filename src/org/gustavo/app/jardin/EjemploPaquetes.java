package org.gustavo.app.jardin;

import org.gustavo.app.hogar.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Gustavo");
        System.out.println(p.getNombre());

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        try {
            p.setFecha(formatter.parse("10-05-22"));
            System.out.println("Fecha de nacimiento: " + p.getFecha() );
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Perro perro = new Perro();
        perro.nombre = "Tobias";
        perro.raza = "Golden";
        perro.anioNacimiento = 2022;

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        System.out.println("perro.nombre = " + perro.nombre);
        System.out.println("perro.raza = " + perro.raza);
        System.out.println("perro.anioNacimiento = " + perro.anioNacimiento);

    }
}
