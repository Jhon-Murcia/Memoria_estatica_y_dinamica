package org.example;

import java.util.ArrayList;

public class GestionEmpleados {
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public void agregarEmpleado(String nombre, double salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, salario);
        listaEmpleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado: " + nuevoEmpleado);
    }

    public void listarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado emp : listaEmpleados) {
                System.out.println(emp);
            }
        }
    }

    public Empleado buscarEmpleado(int id) {
        for (Empleado emp : listaEmpleados) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public void actualizarSalario(int id, double nuevoSalario) {
        Empleado emp = buscarEmpleado(id);
        if (emp != null) {
            emp.setSalario(nuevoSalario);
            System.out.println("Salario actualizado: " + emp);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    public void eliminarEmpleado(int id) {
        Empleado emp = buscarEmpleado(id);
        if (emp != null) {
            listaEmpleados.remove(emp);
            System.out.println("Empleado eliminado: " + emp);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

}
