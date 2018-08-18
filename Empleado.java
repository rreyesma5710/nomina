import java.util.Scanner;

/**
 *
 * @author mekar
 */
public class Empleado {

    private String nombre;
    private String cedula;
    private double basico;
    private double salud;
    private double pension;
    private double transporte;
    private double neto;

    
    public void imprimir(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Cedula:"+cedula);
        System.out.println("Salario Basico:"+basico);
        System.out.println("Salud:"+salud);
        System.out.println("Prension:"+pension);
        System.out.println("Transporte:"+transporte);
        System.out.println("Salario Neto:"+neto);
        
    }
    
    public void leer(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        nombre=scan.nextLine();
        System.out.println("Ingrese Cedula: ");
        cedula=scan.nextLine();
        System.out.println("Salario Basico: ");
        basico=new Double( scan.nextLine());
        
        if(basico<781242*2 ){
            transporte=88211;
        }else{
            transporte=0;
        }
        salud=0.04*basico;
        pension=0.04*basico;        
        neto=basico-salud-pension+transporte;
    }
    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public double getTransporte() {
        return transporte;
    }

    public void setTransporte(double transporte) {
        this.transporte = transporte;
    }
    
    
    
}
