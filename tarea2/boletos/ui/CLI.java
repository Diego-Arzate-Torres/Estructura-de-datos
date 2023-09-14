package edu.diego.arzate.torres.Modulo1.tarea2.boletos.ui;

import edu.diego.arzate.torres.Modulo1.tarea2.boletos.process.boletos;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * La clase CLI proporciona una interfaz de línea de comandos para interactuar con una instancia de la clase boletos.
 */
public class CLI {
    public boletos boletos;
    private Scanner scanner;

    /**
     * Constructor de la clase CLI.
     *
     * @param boletos Una instancia de la clase boletos con la que interactuar.
     */
    public CLI(edu.diego.arzate.torres.Modulo1.tarea2.boletos.process.boletos boletos) {
        this.boletos = boletos;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Muestra un menú al usuario y permite realizar operaciones sobre la instancia de la clase boletos.
     */
    public void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Agregar pasajero");
            System.out.println("2. Eliminar pasajero");
            System.out.println("3. Visualizar pasajero");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = 0;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero.");
                scanner.nextLine(); // descarta la entrada inválida
                continue;
            }
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del pasajero: ");
                    String pasajero = scanner.nextLine();
                    boletos.agregarPasajero(pasajero);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del pasajero: ");
                    pasajero = scanner.nextLine();
                    boletos.eliminarPasajero(pasajero);
                    break;
                case 3:
                    System.out.print("Ingrese el índice del pasajero: ");
                    int index = 0;
                    try {
                        index = scanner.nextInt();
                        System.out.println(boletos.visualizarPasajero(index));
                    } catch (InputMismatchException e) {
                        System.out.println("Error: debe ingresar un número entero.");
                        scanner.nextLine(); // descarta la entrada inválida
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
