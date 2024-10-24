import java.util.Scanner;
public class Main {


    public static void main (String[] args){
        Scanner S1=new Scanner(System.in);
        Empleado E1=new Empleado("juanito",24,600.00);
        E1.imprimir();

        Empleado E2=new Empleado();
            System.out.println("ingrese el nombre de nuevo empleado: ");
            E2.setNombre(S1.nextLine());
            System.out.println("ingrese la edad : ");
            E2.setEdad(S1.nextInt());
            S1.nextLine();
            System.out.println("ingrese el salario : ");
            E2.setSalario(S1.nextDouble());


        System.out.println("el nombre del segundo empleado2: "+E2.getNombre()+
                "---su edad: "+E2.getEdad()+
                "---su salario es : "+E2.getSalario());

    }


}