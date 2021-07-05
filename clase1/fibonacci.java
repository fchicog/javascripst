package clase1;
/**10.Muestra la serie de fibonacci hasta un número pedido por teclado. Por
ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
1, 2, 3, 5, 8, 13, 21, 34, 55, 89. * 
 */
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int num1=0, num2=1, suma=1;
        System.out.print("Dijite su numero: ");
        int serie=sc.nextInt();
        System.out.println(num1);
        for (int i = 1; i < serie; i++) {             
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma; 
            if (suma>=serie){
                break;
            }       
        }    
    }

}
