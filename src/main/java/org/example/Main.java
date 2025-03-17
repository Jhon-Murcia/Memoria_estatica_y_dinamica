package org.example;
import java.util.Scanner;// Importa la clase Scanner para recibir entrada del usuario


public class Main {
    public static void main(String[] args) {
        // Instancia de la clase que gestiona los empleados
       GestionEmpleados  gestion = new GestionEmpleados();
       Scanner entrada = new Scanner(System.in);// Objeto Scanner para leer la entrada del usuario
       int opcion;// Variable para almacenar la opción seleccionada por el usuario
        // Bucle para mostrar el menú hasta que el usuario elija la opción 5 de salir
       do {
           //imprime el menú en la consola
           System.out.println("\n Menú de Gestión de Empleados");
           System.out.println("1. Agregar empleado");
           System.out.println("2. Listar empleados");
           System.out.println("3. Actualizar salario");
           System.out.println("4. Elimminar empleado");
           System.out.println("5. Salir");
           System.out.println("Seleccione una opción:");

           opcion = entrada.nextInt(); // Captura la opción ingresada por el usuario
           // Captura la opción ingresada por el usuario
           switch (opcion) {
               case 1: //Agregar un nuevo empleado
                   System.out.println("Ingrese el nombre del empleado:"); //pide al usuario que ingrese el nombre del empleado
                   String nombre = entrada.next();// Captura el nombre del empleado
                   System.out.println("Ingrese el salario del empleado"); //pide al usuario que ingrese el salario del empleado
                   double salario = entrada.nextDouble();// Captura el salario del empleado
                   gestion.agregarEmpleado(nombre, salario);// Llama al metodo para agregar empleado
                   break;

               case 2: // listar todos los empleados
                   gestion.listarEmpleados();// Llama al metodo para listar empleados
           }
       } while (opcion !=5);// El bucle continúa hasta que el usuario elija salir

        //  se cierra el scanner
        entrada.close();

    }
}