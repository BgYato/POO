package figuras;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        //Creando las variables
        int eleccion, des = 0;
        float base, altura, largo, ancho;
        double radio;

        //Instanciando clases y creando los objetos de los métodos de las subclases
        Scanner input = new Scanner(System.in);
        Triangulo triangulo;
        Rectangulo rectangulo;
        Circulo circulo;


        System.out.println("Bienvenido al calculador de areas.");

        while (des == 0) {
            System.out.println("Digite una de las opciones de las figuras que desea conocer su area:");
            System.out.println("1. Circulo.\n2. Triangulo.\n3. Rectangulo.");
            eleccion = input.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Digite el radio del cuadrado del circulo.");
                    radio = input.nextDouble();

                    circulo = new Circulo(radio);
                    circulo.calcularArea();
                    break;
                case 2:
                    System.out.println("Digite la base del triangulo.");
                    base = input.nextFloat();
                    System.out.println("Digite la altura del triangulo.");
                    altura = input.nextFloat();
    
                    triangulo = new Triangulo(base, altura);
                    triangulo.calcularArea();
                    break;
                case 3:
                    System.out.println("Digite el largo del rectangulo.");
                    largo = input.nextFloat();
                    System.out.println("Digite el ancho del rectangulo.");
                    ancho = input.nextFloat();

                    rectangulo = new Rectangulo(largo, ancho);
                    rectangulo.calcularArea();
                    break;
                default:
                    System.out.println("Has digitado un número erroneo.");                    
                    break;                
            }   
            System.out.println("¿Deseas intentarlo de nuevo? \n0) SI.\n1) NO.");
            des = input.nextInt();
        }        
        
        input.close();
    }
}
