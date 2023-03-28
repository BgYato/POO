package figuras;

public class Triangulo extends Figura {
    //Atributos
    private float base, altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodo de la sub clase
    public void calcularArea() {
        // Para calcular el area de un triangulo la formula es:
        // area = base * altura / 2            
        System.out.println("Tras hacer los calculos, hemos dado con el area del triangulo.");
        System.out.println("Recordemos que: area = base * altura / 2");
        float area = (base * altura) / 2;
        System.out.println("El area del triangulo es: "+area);
    }

}
