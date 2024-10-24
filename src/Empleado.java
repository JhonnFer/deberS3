public class Empleado {
    private String nombre;
    private  int  edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(){

    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre ){
        this.nombre=nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }

    public void imprimir (){
        System.out.println("El nombre es: "+nombre+
                "--su edad : "+edad+
                "---su salario: "+salario);
    }

}
