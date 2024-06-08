package org.gustavo.app.jardin;

import org.gustavo.app.hogar.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import static org.gustavo.app.hogar.Persona.saludar;
import static org.gustavo.app.hogar.Persona.GENERO_FEMENINO;
import static org.gustavo.app.hogar.Persona.GENERO_MASCULINO;
import static org.gustavo.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Gustavo");
        p.setApellido("Bautista");
        p.setColorPelo(CASTANIO);

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
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

    }
}
