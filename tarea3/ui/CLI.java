package edu.diego.arzate.torres.Modulo1.tarea3.ui;

import java.util.Scanner;

import static edu.diego.arzate.torres.Modulo1.tarea3.process.process.evaluate;
import static edu.diego.arzate.torres.Modulo1.tarea3.process.process.process;
/**
 * La clase CLI proporciona una interfaz de línea de comandos para convertir una expresión matemática en notación infija a notación postfija y evaluarla.
 */
public class CLI {
    /**
     * Ejecuta la interfaz de línea de comandos.
     */
    public static void CLI() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una expresión en notación infija: ");
        String expression = scanner.nextLine();
        String postfix = process(expression);
        System.out.println("La expresión en notación postfija es: " + postfix);
        int result = evaluate(postfix);
        System.out.println("El resultado de la evaluación es: " + result);
    }
}