package principal;
import salud.*;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        //void  = no tiene valor de retorno
        
        //Creando variables.
        String resultado = "", cargo;
        double valor, horastrabajadas;

        //Creando un objeto -> instanciando clases de otro paquete
        Persona datos = new Persona();
        Scanner input = new Scanner(System.in);        
        
        //Invocando métodos del objeto persona.
        datos.pedirDatos();
        Empleado empleado;
        datos.mostrarPersona();
        /* EL CODIGO COMENTADO ABAJO HACE REFERENCIA AL RETO UNO */
        /* datos.calcularImc(); */

        /* EL CÓDIGO DE LA LÍNEA 19 A LA LÍNEA 26 HACE REFERENCIA AL RETO DOS */        
        resultado = datos.calcularImc(resultado);
        if (resultado == "PESOBAJO") {
            System.out.println("Los resultados del ICM dicen que usted posee un peso por debajo del ideal.");
        } else if (resultado == "PESOIDEAL") {
            System.out.println("Los resultados del ICM dicen que usted posee un peso ideal.");
        } else if (resultado == "SOBREPESO") {
            System.out.println("Los resultados del ICM dicen que usted posee sobre peso.");
        }        

        datos.mayorEdad();        

        System.out.println("Digite por favor su cargo: ");
        cargo = input.next();                
        System.out.println("Digite su valor por hora:");
        valor = input.nextDouble();  
        System.out.println("Digite sus horas trabajadas: ");
        horastrabajadas = input.nextDouble(); 

        empleado = new Empleado(datos.getTipoDoc(), datos.getNombre(), datos.getApellido(), datos.getSexo(), datos.getPesoTipo(), datos.getEdad(), datos.getDocumento(), datos.getPeso(), datos.getEstatura(), datos.getPesoActual(), cargo, valor, horastrabajadas);

        empleado.calcularHonorarios();        
    }    
}
