package org.gustavo.app.jardin;

import org.gustavo.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;
    protected int anioNacimiento;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

}
