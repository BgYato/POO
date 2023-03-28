package juego;

import java.util.Scanner;

public class juego_1 implements Juego{
    //Declarando atributos
    String nombreJugador;
    //la variable "numeroGanador" sacara un numero aleatoriamente en un rango de 1 a 2
    int eleccionMaquina = (int)(Math.random()*2+1), eleccionJugador, ganador; 


    //Creación de objetos | Instanciar clases
    Scanner input = new Scanner(System.in);


    public void iniciar() {
        System.out.println("Bienvenido al juego de piedra, papel o tijera.");
        System.out.print("Por favor, digite su nombre completo: ");
        nombreJugador = input.next();        
    }

    public void jugar() {
        System.out.println("Ya puedes jugar, elige alguna de las opciones: \n1. Piedra. \n2. Papel. \n3. Tijera.");
            eleccionJugador = input.nextInt();

            switch (eleccionJugador) {
                case 1:
                    if (eleccionMaquina == 1) {
                        System.out.println("Has elegido Piedra, la máquina ha elegido; Piedra.");
                        ganador = 1;
                    } else if (eleccionMaquina == 2) {
                        System.out.println("Has elegido Piedra, la máquina ha elegido; Papel.");
                        ganador = 1;
                    } else if (eleccionMaquina == 3) {
                        System.out.println("Has elegido Piedra, la máquina ha elegido; Tijera.");
                        ganador = 0;
                    }
                    break;
                case 2:
                    if (eleccionMaquina == 1) {
                        System.out.println("Has elegido Papel, la máquina ha elegido; Piedra.");
                        ganador = 0;
                    } else if (eleccionMaquina == 2) {
                        System.out.println("Has elegido Papel, la máquina ha elegido; Papel.");
                        ganador = 1;
                    } else if (eleccionMaquina == 3) {
                        System.out.println("Has elegido Papel, la máquina ha elegido; Tijera.");
                        ganador = 1;
                    }
                    break;
                case 3:
                    if (eleccionMaquina == 1) {
                        System.out.println("Has elegido Tijera, la máquina ha elegido; Piedra.");
                        ganador = 1;
                    } else if (eleccionMaquina == 2) {
                        System.out.println("Has elegido Tijera, la máquina ha elegido; Papel.");
                        ganador = 0;
                    } else if (eleccionMaquina == 3) {
                        System.out.println("Has elegido Tijera, la máquina ha elegido; Tijera.");
                        ganador = 1;
                    }
                    break;
            
                default:
                    System.out.println("Has elegido un número mayor o menos al permitido, vuelve a intentarlo, siguiendo las instrucciones.");
                    break;
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
