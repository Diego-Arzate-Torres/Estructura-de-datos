package edu.diego.arzate.torres.Modulo1.tarea2.boletos;

import edu.diego.arzate.torres.Modulo1.tarea2.boletos.process.boletos;
import edu.diego.arzate.torres.Modulo1.tarea2.boletos.ui.CLI;

/**
 * La clase Main contiene el método principal para ejecutar el programa.
 */
public class Main {
    /**
     * Método principal del programa.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        boletos boletos = new boletos();
        CLI cli = new CLI(boletos);
        cli.mostrarMenu();
    }
}

