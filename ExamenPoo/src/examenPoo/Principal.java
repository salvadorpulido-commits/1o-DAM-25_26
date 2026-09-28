package examenPoo;

import java.util.Scanner;

public class Principal {



    public static void main(String[] args) {
    	
    	
    	// Abrimos Scanner

        Scanner sc = new Scanner(System.in);

        
        // iniciamos las variables 
        int opcion;
        String dni;
        String nombre;
        double salario;
        double bonificacion;
        int horas;

        ListadoEmpleados lista = new ListadoEmpleados();

        // Mensaje de bienvenida
        
        System.out.println("Bienvenido al sitsema de empleados");

        // menu de opciones
        
        do {
        	
            System.out.println("\n1. Añadir empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Buscar por DNI");
            System.out.println("4. Modificar horas extra");
            System.out.println("5. Modificar bonificacion");
            System.out.println("6. Modificar precio hora extra");
            System.out.println("7. Eliminar empleado ");
            System.out.println("8. Ver estadisticas");
            System.out.println("9. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            // procesamos las opciones
            
            switch (opcion) {

             case 1:
                    System.out.print("DNI: ");
                    dni = sc.nextLine();

                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();

                    System.out.print("Salario base: ");
                    salario = sc.nextDouble();

                    System.out.print("Bonificacion (%): ");
                    bonificacion = sc.nextDouble();

                    Empleado e = new Empleado(dni, nombre, salario, bonificacion);

                    if (lista.añadirEmpleado(e)) {
                        System.out.println("Empleado añadido");
                    } else {
                        System.out.println("Error, ya existe el empleqado");
                    }
                    break;
                    
                    // listamos todos

                case 2:
                    lista.listarTodos();
                    break;
                    
                    // buscamos por dni

                case 3:
                    System.out.print("DNI: ");
                    dni = sc.nextLine();

                    Empleado encontrado = lista.buscarPorDni(dni);

                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No encontrado");
                    }
                    break;

                    // modificamos las horas extra
                    
                case 4:
                    System.out.print("DNI: ");
                    dni = sc.nextLine();

                    System.out.print("Horas: ");
                    horas = sc.nextInt();

                    if (lista.modificarHorasExtra(dni, horas)) {
                        System.out.println("Modificado");
                    } else {
                        System.out.println("Error");
                    }
                    break;
					
					 // modificamosd la bonificacion	
                case 5:
                    System.out.print("DNI: ");
                    dni = sc.nextLine();

                    System.out.print("Nuevo porcentaje: ");
                    bonificacion = sc.nextDouble();

                    if (lista.modificarBonificacion(dni, bonificacion)) {
                        System.out.println("Modificado");
                    } else {
                        System.out.println("Error");
                    }
                    break;

                    // modificar precio hora extra (variable estatica)
                case 6:
                    System.out.print("Nuevo precio hora extra: ");
                    Empleado.precioHoraExtra = sc.nextDouble();
                    System.out.println("Actualizado");
                    break;

                    // eliminar por dni
                    
                case 7:
                    System.out.print("DNI: ");
                    dni = sc.nextLine();

                    if (lista.eliminarPorDni(dni)) {
                        System.out.println("Eliminado");
                    } else {
                    System.out.println("No existe");
                    }
                    break;
                    // estadisticas: gasto total en bonificaciones y empleados alto desempeño
                case 8:
                    System.out.println("Gasto total bonificaciones: " + lista.calcularGastoBonificaciones());
                    System.out.println("Empleados alto desempeño:");
                    lista.listarEmpleadosAltoDesempeño();
                    break;
                    // salir	
                case 9:
                    System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    break;
            }

            
            // pausa para ver el resultado
            
        } while (opcion != 9);
        // cerramos scanner
        sc.close();
    }
}




