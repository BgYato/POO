package juego;

import java.util.Scanner;

public class ejecucion {
    public static void main(String[] args) {
        //Creación de las variables.
        int des;

        //Creación de los objetos
        Scanner input = new Scanner(System.in);
        juego_1 juego1 = new juego_1();
        juego_2 juego2 = new juego_2();

        //Consulta de datos
        System.out.println("Bienvenido a la zona de juegos.");
        System.out.println("¿Cuál juego quieres jugar?: \n1. Piedra papel o tijera.\n2. Cara o sello.");
        des = input.nextInt();
        switch (des) {
            case 1:
                juego1.iniciar();
                juego1.jugar();
                juego1.finalizar();
                break;
            case 2:
            juego2.iniciar();
            juego2.jugar();
            juego2.finalizar();
                break;
            default:
                break;
        }

        input.close();
        
    }   
}
