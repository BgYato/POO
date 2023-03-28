package figuras;

public class Rectangulo extends Figura{
    //Atributos
    private float largo, ancho;

    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    //Metodo de la sub clase
    public void calcularArea() {
        // Para calcular el area de un rectangulo la formula es:
        // area = largo * ancho        
        System.out.println("Tras hacer los calculos, hemos dado con el area del rectangulo.");
        System.out.println("Recordemos que: area = largo * ancho");
        float area = (largo * ancho);
        System.out.println("El area del rectangulo es: "+area);
    }
}
