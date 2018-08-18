import java.util.ArrayList;
import java.util.Scanner;

public class Nomina {

       public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de empleados");
        
        int n=scan.nextInt();
        ArrayList<Empleado> empleados=new ArrayList<Empleado>();
        
        
        for (int i = 0; i < n; i++) {
            empleados.add(new Empleado());
            empleados.get(i).leer();
        }
        double total=0;
        for (Empleado empleado : empleados) {
            empleado.imprimir();
            total+=empleado.getNeto();
        }
        
        System.out.println("El total de la nomina es: "+total);
        
        
        
    }
    
}