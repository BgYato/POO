package juego;

import java.util.Scanner;

public class juego_2 implements Juego{
    //Declarando variables
    String nombreJugador;
    //la variable "numeroGanador" sacara un numero aleatoriamente en un rango de 1 a 3
    int numeroMaquina = (int)(Math.random()*2+1), eleccionJugador, ganador; 


    //Creación de objetos | Instanciar clases
    Scanner input = new Scanner(System.in);    

    public void iniciar() {
        System.out.println("Bienvenido al juego de cara o sello.");
        System.out.print("Por favor, digite su nombre completo: ");
        nombreJugador = input.next();     
    }

    public void jugar() {
        System.out.println("Ya puedes jugar, elige alguna de las opciones: \n1. Cara. \n2. Sello.");
        eleccionJugador = input.nextInt();

        if (eleccionJugador > 0 && eleccionJugador < 3) {
            if (numeroMaquina == 1) {
                System.out.println("La moneda da giros y cae del lado de la cara.");
                if (eleccionJugador == numeroMaquina) {                    
                    ganador = 0;
                } else {
                    ganador = 1;
                }
            } else if (numeroMaquina == 2) {
                System.out.println("La moneda da giros y cae del lado del sello.");
                if (eleccionJugador == numeroMaquina) {
                    ganador = 0;
                } else {
                    ganador = 1;
                }
            }
        } else {
            System.out.println("El número elegido ha sido mayor a 2 o menor a 1, no se realizará el juego.");
        }
    }

    public void finalizar() {
        if (ganador == 1) {
            System.out.println("HAS PERDIDO CONTRA LA MÁQUINA.");
        } else {
            System.out.println("LE HAS GANADO A LA MÁQUINA.");
        }

        System.out.println("El programa ha finalizado.");
    }
}
