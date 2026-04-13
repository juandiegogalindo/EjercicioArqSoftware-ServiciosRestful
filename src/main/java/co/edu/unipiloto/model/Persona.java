/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jdgal
 */
@XmlRootElement
public class Persona {

    private String nombre;
    private int edad;
    private double salario;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = calcularSalario();
    }

    private double calcularSalario() {
        double salarioMinimo = 1300000; // puedes ajustarlo
        return (edad * salarioMinimo) / 3;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        this.salario = calcularSalario(); // recalcula automáticamente
    }

    public double getSalario() {
        return salario;
    }
}
