package salud;

import java.util.Scanner;

public class Persona {
    //Definiendo los atributos de la clase.
    //Los atributos son de visibilidad por privada.
    private String tipoDoc, nombre, apellido, sexo, pesoTipo;
    private int edad, documento;
    private Double peso, estatura, pesoActual;

        
    public Persona() {
    }

    public Persona(String tipoDoc, String nombre, String apellido, String sexo, String pesoTipo, int edad,
            int documento, Double peso, Double estatura, Double pesoActual) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.pesoTipo = pesoTipo;
        this.edad = edad;
        this.documento = documento;
        this.peso = peso;
        this.estatura = estatura;
        this.pesoActual = pesoActual;
    }    

    //Definiendo los metodos
    public void pedirDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("==== REGISTRO ====");
        System.out.print("Escriba por favor su nombre: ");
        nombre = input.next();
        System.out.print("Escriba por favor su apellido: ");
        apellido = input.next();

        System.out.print("Digite su edad (en números): ");
        edad = input.nextInt();
        System.out.print("Escriba su sexo (masculino o femenino): ");
        sexo = input.next();

        System.out.print("Escriba cual tipo de documento tiene: ");
        tipoDoc = input.next();
        System.out.print("Digite su documento sin puntos ni comas: ");
        documento = input.nextInt();

        System.out.print("Digite su peso en décimales (solo con comas, sin puntos): ");
        peso = input.nextDouble();
        System.out.print("Digite su estatura en décimales (solo con comas, sin puntos): ");
        estatura = input.nextDouble();         
    }    

    public void mostrarPersona() {
        System.out.println("==== RESULTADOS ====");
        System.out.println("Los datos ingresados son: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Tipo de documento: "+tipoDoc);
        System.out.println("Documento: "+documento);
        System.out.println("Peso: "+peso);
        System.out.println("Estatura: "+estatura);
    }

    /* EL CÓDIGO COMENTADO HACE PARTE DEL RETO NÚMERO 1 */
    /* public void calcularImc() {
        pesoActual = (peso / estatura) * 2;

        System.out.println("==== ICM ====");
        
        if (pesoActual < 20) {
            System.out.println("Su ICM dio un resultado de "+pesoActual+", es decir, por debajo del peso ideal.");
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("Su ICM dio un resultado de "+pesoActual+", es decir, está en el peso ideal.");
        } else if (pesoActual > 25) {
            System.out.println("Su ICM dio un resultado de "+pesoActual+", es decir, usted tiene sobrepeso.");
        }
    } */

    /* EL SIGUIENTE CÓDIGO SERÁ DEL RETO NÚMERO 2, CON RETORNO */
    //void = sin retorno | String 
    public String calcularImc(String resultado) {
        pesoActual = (peso / estatura) * 2;

        System.out.println("==== ICM ====");
        
        if (pesoActual < 20) {
            resultado = "PESOBAJO";            
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            resultado = "PESOIDEAL";
        } else if (pesoActual > 25) {
            resultado = "SOBREPESO";
        }
        
        return resultado;        
    }

    public void mayorEdad() {
        System.out.println("==== EDAD ====");

        if (edad >= 18 && edad < 100) {
            System.out.println("Usted es mayor de edad.");
        } else if (edad >= 1 && edad <= 17 ) {
            System.out.println("Usted es menor de edad"); 
        } else {
            System.out.println("Ha digitado una edad por encima de 100 o por debajo de 1.");
        }
    }

    //Aplicando los principios de encapsulamiento
    
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() { 
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPesoTipo() {
        return pesoTipo;
    }

    public void setPesoTipo(String pesoTipo) {
        this.pesoTipo = pesoTipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(Double pesoActual) {
        this.pesoActual = pesoActual;
    }
}
