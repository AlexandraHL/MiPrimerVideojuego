/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PiedraPapelTijeraBrain;

import java.util.Scanner;


/**
 *
 * @author ale
 */

/**
 * Clase que implementa el juego de Piedra, Papel, Tijera entre un jugador y la computadora.
 */
public class MiPrimerVideojuego {
    
    /**
     * Método principal que inicia el juego.
     * @param args Argumentos de línea de comandos (no utilizado).
     */
    public static void main(String[] args) {
        // Variables para llevar el conteo de los puntos del jugador
        int chiquipuntos = 0;
        // Objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Variables para almacenar las opciones elegidas por el jugador y la computadora
        String opcionJugador = "";
        String opcionBot = "";
        // Variable para almacenar el éxito o fracaso en el propósito de la computadora
        int exitoEnProposito = 1;
        // Tiempo de inicio del juego
        long inicio = System.currentTimeMillis();
        // Se repite el juego por 5 rondas
        for (int i = 0; i < 5; i++) {
            // Genera un número aleatorio para determinar el propósito de la computadora
            int proposito = (int) Math.floor(Math.random() * 2 + 1);
            // Imprime el propósito de la computadora
            if (proposito == 1) {
                System.out.println("\n\tIntenta ganar");
            }
            if (proposito == 2) {
                System.out.println("\n\tIntenta perder");
            }
            
            // Genera un número aleatorio para la elección de la computadora (piedra, papel o tijera)
            int j = (int) Math.floor(Math.random() * 3 + 1);
            // Asigna la opción elegida por la computadora y la muestra en pantalla
            if (j == 1) {
                opcionBot = "tijera";
                System.out.println(opcionBot);
                tijera();
            }
            
            if (j == 2) {
                opcionBot = "papel";
                System.out.println(opcionBot);
                papel();
            }
            
            if (j == 3) {
                opcionBot = "piedra";
                System.out.println(opcionBot);
                piedra();
            }
            
            // Solicita al usuario que ingrese su jugada
            do {
                System.out.println("Introduce tu jugada");
                opcionJugador = sc.nextLine();
                // Comprueba si la jugada del jugador es igual a la de la computadora
                if (opcionBot.equals(opcionJugador)) {
                    System.out.println("No tiene sentido que intentes empatar");
                }
                
            } while (opcionBot == opcionJugador);
            
            // Determina el resultado de la ronda
            if (opcionJugador.equals("tijera") && (opcionBot.equals("papel"))) {
                exitoEnProposito = 1;
            }
            
            if (opcionJugador.equals("papel") && (opcionBot.equals("tijera"))) {
                exitoEnProposito = -1;
            }
            
            if (opcionJugador.equals("tijera") && (opcionBot.equals("piedra"))) {
                exitoEnProposito = -1;
            }
            
            if (opcionJugador.equals("piedra") && (opcionBot.equals("tijera"))) {
                exitoEnProposito = 1;
            }
            
            if (opcionJugador.equals("piedra") && (opcionBot.equals("papel"))) {
                exitoEnProposito = -1;
            }
            
            if (opcionJugador.equals("papel") && (opcionBot.equals("piedra"))) {
                exitoEnProposito = 1;
            }
            
            // Si el propósito de la computadora es perder, se invierte el resultado
            if (proposito == 2) {
                exitoEnProposito *= -1;
            }
            
            // Si el jugador tuvo éxito, se incrementa su puntaje
            if (exitoEnProposito == 1) {
                chiquipuntos++;
            }
        }
        
        // Calcula el tiempo total del juego
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio) / 1000);
        System.out.println("Has realizado el ejercicio en " + tiempo + " segundos");
        
        // Calcula la penalización por fallos
        int nFallos = 5 - chiquipuntos;
        System.out.println("Penalización: " + nFallos + " x 5s = " + nFallos * 5);
        
        // Calcula el tiempo final del jugador, considerando la penalización
        double tiempoFinal = tiempo + nFallos * 5;
        System.out.println("Tu tiempo final es de " + tiempoFinal + " segundos");
        //Mensajes tras finalizar el juego
        System.out.println("Vuelve a jugar con nosotros");
        System.out.println("Es muy divertido!");
    }
    
     /**
     * Método para mostrar la representación de tijera.
     */
    
    public static void tijera() {
        System.out.println("'''\n"
                + "    _______\n"
                + "---'   ____)____\n"
                + "          ______)\n"
                + "       __________)\n"
                + "      (____)\n"
                + "---.__(___)\n"
                + "'''");
    }
    
    /**
     * Método para mostrar la representación de papel.
     */
    
    public static void papel() {
        System.out.println("'''\n"
                + "     _______\n"
                + "---'    ____)____\n"
                + "           ______)\n"
                + "          _______)\n"
                + "          _______)\n"
                + "---.__________)");
    }
    
    /**
     * Método para mostrar la representación de piedra.
     */
    
    public static void piedra() {
        System.out.println("'''\n"
                + "    _______\n"
                + "---'   ____)\n"
                + "      (_____)\n"
                + "      (_____)\n"
                + "      (____)\n"
                + "---.__(___)\n"
                + "'''");
    }
}

