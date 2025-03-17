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

CLASE GESTIÓN EMPLEADOS

La clase Gestión Empleados se encarga de administrar una lista de empleados, permitiendo agregarlos, listarlos, buscar por ID, actualizar su salario y eliminarlos.

PASOS PARA SU FUNCIONAMIENTO

1. Se define la clase GestionEmpleados, que maneja una lista de empleados utilizando un ArrayList. Esto permite almacenar múltiples empleados dinámicamente.
2. Se implementa el método agregarEmpleado(nombre, salario), que crea un objeto Empleadoy lo añade a la lista. Esto facilita la gestión de nuevos empleados.
3. Se incluye listarEmpleados(), que recorre la lista y muestra a los empleados registrados en la consola, asegurando que el usuario pueda visualizar los datos almacenados.
4. Se agrega buscarEmpleado(id), que recorre la lista y retorna el empleado cuyo ID coincide con el proporcionado. Esto permite acceder a un empleado específico.
5. Se implementa actualizarSalario(id, nuevoSalario), que usa buscarEmpleado(id)para localizar al empleado y modificar su salario si existe. Así, se mantiene la información actualizada.
6. Se añade eliminarEmpleado(id), que busca al empleado en la lista y lo elimina si existe. Esto permite la gestión eficiente del personal.
7. Se añade eliminarEmpleado(id), que busca al empleado en la lista y lo elimina si existe. Esto permite la gestión eficiente del personal.


CLASE MAIN

1. Se agregan las clases import java.util.Scanner; y import java.util.ArrayList; para manejar entradas de usuario y listas de empleados.
2. Se define Scanner entrada = new Scanner(System.in); para capturar la entrada del usuario.
3. Se crea un objeto de la clase GestionEmpleados para gestionar empleados.
4. Se implementa un do-while con System.out.println() para imprimir opciones como agregar, actualizar, eliminar empleados, mostrar la lista y salir.
5. Se imprime el menú en la consola con las opciones disponibles: agregar, listar, actualizar salario, eliminar empleados o salir.
6. Se lee la opción ingresada por el usuario y se evalúa con un switch:
   Opción 1 : Solicita nombre y salario del empleado, luego lo agrega a la lista mediante agregarEmpleado(nombre, salario).
   Opción 2 : Llama a listarEmpleados()para mostrar a los empleados registrados.
   Opción 3 : Solicita el ID y el nuevo salario, luego actualiza el salario con actualizarSalario(id, nuevoSalario).
   Opción 4 : Solicita el ID y elimina al empleado con eliminarEmpleado(id).
   Opción 5 : Muestra un mensaje de salida y termina el programa.
   Opción inválida : Muestra un mensaje indicando que la opción no es válida.
7. El bucle se ejecuta hasta que el usuario elija la opción 5 (Salir) .
8. Finalmente, se cierra el Scannercon entrada.close()para liberar recursos.
