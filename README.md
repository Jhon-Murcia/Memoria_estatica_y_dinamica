# Memoria_estatica_y_dinamica

GESTION DE EMPLEADOS

INTEGRANTES
JHON SEBASTIAN MURCIA ROMERO
ANGIE KATHERINE ROBAYO ANGEL

DESCRIPCION DEL PROYECTO:

Este proyecto gestiona empleados utilizando memoria estática y dinámica en Java, permitiendo funciones como: registrara empleados, listar los empleados, actualizar el salario de un empleado, eliminar empleados y salir del programa. Para su desarrollo se hizo uso de memoria estatica (contador) y memoria dinamina (arraylist).

PASOS PARA SU FUNCIONAMIENTO

CLASE LIBRO

1. Se declaran las variables privadas para id, nombre y salario, además de una variable estática contadorEmpleados para asignar un ID único a cada empleado.
2. Se define un constructor que reciba nombre y salario, y asigne automáticamente un ID único incrementando contadorEmpleados.
3. Se implementan los métodos getId(), getNombre() y getSalario() para obtener los valores de los atributos.
4. Se crea el método setSalario(double salario) para actualizar el salario del empleado.
5. Se implementa el método toString() para devolver una representación en texto del empleado con id, nombre y salario.

CLASE GESTIONEMPLEADOS

CLASE MAIN

1. Se agregan las clases import java.util.Scanner; y import java.util.ArrayList; para manejar entradas de usuario y listas de empleados.
2. Se define Scanner entrada = new Scanner(System.in); para capturar la entrada del usuario.
3. Se crea un objeto de la clase GestionEmpleados para gestionar empleados.
4. Se implementa un do-while con System.out.println() para imprimir opciones como agregar, actualizar, eliminar empleados, mostrar la lista y salir.
