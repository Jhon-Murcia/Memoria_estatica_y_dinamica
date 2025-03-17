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
           System.out.println("4. Eliminar empleado");
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
                   break;

               case 3: //Actualizar el salario de un trabajador
                   System.out.print("Ingrese ID del empleado: "); //Se solicita el ID del trabajador
                   int idActualizar = entrada.nextInt(); //Captura el ID ingresado por el usuario
                   System.out.print("Ingrese nuevo salario: "); //Se solicita el nuevo salario para el trabajador
                   double nuevoSalario = entrada.nextDouble(); //Se captura el nuevo salario ingresado por el usuario
                   gestion.actualizarSalario(idActualizar, nuevoSalario); // Llama al metodo actualizarSalario de la clase gestion para modificar el salario del empleado con el ID ingresado
                   break; //Se rompe la ejecucion del codigo para evitar que se ejecuten los demas casos

               case 4: //Eliminar un empleado
                   System.out.print("Ingrese ID del empleado a eliminar: "); //Solicita el ID del empleado
                   int idEliminar = entrada.nextInt(); //Captura el ID ingresado por el usuario
                   gestion.eliminarEmpleado(idEliminar); // Llama al metodo eliminarEmpleado de la clase gestion para eliminar el empleado correspondiente al ID ingresado
                   break;

               case 5: //Salir
                   System.out.println("Saliendo del sistema..."); //Se muestra un mensaje que indica que el codigo se dejara de ejecutar
                   break;

               default:
                   System.out.println("Opción no válida."); //En caso de que se ingrese una opcion no valida se mostrara este mensaje
           }
       } while (opcion !=5);// El bucle continúa hasta que el usuario elija salir

        //  se cierra el scanner
        entrada.close();

    }
}