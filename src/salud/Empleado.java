package salud;

public class Empleado extends Persona {
    //Creando los atributos propios de la sub-clase
    private double valor, horastrabajadas, totalHonorarios;
    private String cargo, departamento;

    //Instanciar la clase persona
    Persona persona = new Persona();

    public Empleado(String string, String string2, String string3, String string4, String string5, int i, int j, Double double1, Double double2, Double double3, String cargo2, double valor2, double horastrabajadas2){          
    }

    public Empleado(String tipoDoc, String nombre, String apellido, String sexo, String pesoTipo, int edad,
            int documento, Double peso, Double estatura, Double pesoActual, String cargo, int valor, int horastrabajadas,
            String departamento) {
        super(tipoDoc, nombre, apellido, sexo, pesoTipo, edad, documento, peso, estatura, pesoActual);
        this.cargo = cargo;
        this.valor = valor;
        this.horastrabajadas = horastrabajadas;
        this.departamento = departamento;
        
    }

    //Creación de los métodos propios de la sub clase
    public void calcularHonorarios() {               
        //es equivalente al producto del valor por hora y la cantidad de horas trabajadas
        //menos RETEICA que se resta al valor total (0,966)
        totalHonorarios = (valor * horastrabajadas) - 0.966;        

        //Impresiones de los resultados
        System.out.println("Los datos de salida son: ");
        System.out.println("1. Tipo de documento: "+getTipoDoc()+".\n2. Documento: "+getDocumento());
        System.out.println("3. Nombre: "+getNombre()+".\n4. Apellido: "+getApellido());
        System.out.println("5. Cargo: "+cargo+".\n6. Horas trabajadas: "+horastrabajadas+".\n7. Total a pagar: "+totalHonorarios);
    }

    //Accesores

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public double getTotalHonorarios() {
        return totalHonorarios;
    }

    public void setTotalHonorarios(double totalHonorarios) {
        this.totalHonorarios = totalHonorarios;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }    
}
