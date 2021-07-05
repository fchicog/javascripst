package clase1;
/**9. Pide por teclado el nombre, edad y salario y muestra el salario
○ Si es menor de 16 no tiene edad para trabajar
○ Entre 19 y 50 años el salario es un 5 por ciento más
○ Entre 51 y 60 años el salario es un 10 por ciento más
○ Si es mayor de 60 el salario es un 15 por ciento más
 * 
 */
import java.util.*;
public class nomSalario {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Dijite su nombre: ");
        String nom=sc.nextLine();
        System.out.print("Dijite su edad: ");
        int edad=sc.nextInt();        
        System.out.print("Dijite su salario: ");
        double sal=sc.nextInt();
        if (edad<16){
            System.out.print("No tiene edad para trabajar");        
        }else if(edad>=19 && edad<=50){
            sal=sal+(sal*0.05);
        }else if(edad>=51 && edad<=60){
            sal=sal+(sal*0.10);
        }else if(edad>60){
            sal=sal+(sal*0.15);
        }System.out.print("El salario de "+nom+" es: $"+sal);
    }
    
}
