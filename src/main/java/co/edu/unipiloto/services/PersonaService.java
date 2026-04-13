/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.services;

import co.edu.unipiloto.model.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdgal
 */
public class PersonaService {

    private static List<Persona> personas = new ArrayList<>();

    static {
        personas.add(new Persona("Juan", 20));
        personas.add(new Persona("Ana", 25));
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void addPersona(Persona p) {
        personas.add(p);
    }

    public double getSumaSalarios() {
        return personas.stream().mapToDouble(Persona::getSalario).sum();
    }

    public double getPromedioSalarios() {
        return getSumaSalarios() / personas.size();
    }
}