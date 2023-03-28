package figuras;

public class Circulo extends Figura {            
    //Atributos
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;        
    }

    //Metodo de la sub clase
    public void calcularArea() {
        // Pi = 3.1416
        // area = pi * radio        
        System.out.println("Tras hacer los calculos, hemos dado con el area del circulo.");
        System.out.println("Recordemos que: area = radio * pi");
        Double area = 3.1416 * radio;
        System.out.println("El area del circulo es: "+area);
    }

}
