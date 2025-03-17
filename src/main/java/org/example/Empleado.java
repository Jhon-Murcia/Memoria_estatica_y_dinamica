package org.example;

import java.util.ArrayList; //Se importa a clase Arraylist

public class Empleado {

    private static int contadorEmpleados = 0; // Memoria estática para contar cuantos empleados se han creado
    private int id; //Identificador unico para cada empleado
    private String nombre; //Nombre del empleado
    private double salario; //Sueldo del empleado

    public Empleado(String nombre, double salario) { //Este constructor se ejecuta cada que se agrega un nuevo empleado
        this.id = ++contadorEmpleados; // Asigna un ID único al empleado
        this.nombre = nombre; //Se asigna el nombre del empleado ingresado por el usuario
        this.salario = salario; //Se asigna el salario del empleado ingresado por el usuario
    }

    public int getId() {
        return id;
    } //Metodo para obtener el ID del empleado

    public String getNombre() {
        return nombre;
    } //Metodo para obtener el nombre del empleado

    public double getSalario() {
        return salario;
    } //Metodo para obtener el salario del empleado

    public void setSalario(double salario) {
        this.salario = salario;
    } //Metodo para actualizar el salario del empleado

    @Override //Este metodo retorna un mensaje que muestra los datos del empleado
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Salario: " + salario;
    }

}
