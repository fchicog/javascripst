package clase1;
/**3.Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000. */
import java.util.*;
public class calcularSueldo {
    public static void main(String[] args) {
        int vlrH=30000;
        var sc = new Scanner(System.in);
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int numH = sc.nextInt();        
        System.out.println("Sueldo de un trabajador: "+(numH*vlrH));              
        sc.close();
    } 
    
}
