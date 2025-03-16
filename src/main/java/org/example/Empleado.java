package org.example;

import java.util.ArrayList;

public class Empleado {

    private static int contadorEmpleados = 0; // Memoria estática
    private int id;
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.id = ++contadorEmpleados; // Asigna un ID único al empleado
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Salario: " + salario;
    }

}
