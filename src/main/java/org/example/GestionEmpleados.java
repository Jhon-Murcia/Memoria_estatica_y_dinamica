package org.example;

import java.util.ArrayList;// Se  Importa la clase ArrayList para manejar la lista de empleados

//Esta clase gestiona una lista de empleados, permitiendo agregar, listar, actualizar y eliminar empleados.

public class GestionEmpleados {
    // Lista que almacena los empleados registrados
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    //Metodo para agregar un nuevo empleado a la lista
    public void agregarEmpleado(String nombre, double salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, salario); // Se crea un nuevo empleado con los datos proporcionados
        listaEmpleados.add(nuevoEmpleado); // Se agrega el empleado a la lista
        System.out.println("Empleado agregado: " + nuevoEmpleado); //  Se muestra mensaje de confirmación
    }
    //Metodo para listar todos los empleados registrados
    public void listarEmpleados() {
        if (listaEmpleados.isEmpty()) { // Verifica si la lista está vacía
            System.out.println("No hay empleados registrados.");// Mensaje si no hay empleados
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado emp : listaEmpleados) { // Recorre la lista e imprime cada empleado
                System.out.println(emp);
            }
        }
    }
    //Metodo para buscar un empleado por su ID
    public Empleado buscarEmpleado(int id) {
        for (Empleado emp : listaEmpleados) {  // Recorre la lista de empleados
            if (emp.getId() == id) { // Compara el ID del empleado con el ID buscado
                return emp; // Retorna el empleado si coincide el ID
            }
        }
        return null; // Retorna null si no se encuentra el empleado
    }
    // Metodo para actualizar el salario de un empleado
    public void actualizarSalario(int id, double nuevoSalario) {
        Empleado emp = buscarEmpleado(id);// Se busca el empleado por su ID
        if (emp != null) { // Verifica si el empleado existe
            emp.setSalario(nuevoSalario);
            System.out.println("Salario actualizado: " + emp);// Actualiza el salario del empleado
        } else {
            System.out.println("Empleado no encontrado.");  // Mensaje si no se encuentra el empleado
        }
    }
    //Metodo para eliminar un empleado de la lista
    public void eliminarEmpleado(int id) {
        Empleado emp = buscarEmpleado(id);// Se busca el empleado por su ID
        if (emp != null) {// Verifica si el empleado existe
            listaEmpleados.remove(emp);
            System.out.println("Empleado eliminado: " + emp);// Elimina el empleado de la lista
        } else {
            System.out.println("Empleado no encontrado.");// Mensaje si no se encuentra el empleado
        }
    }

}
