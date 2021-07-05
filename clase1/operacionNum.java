package clase1;

/**1.Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.*/

import java.util.*;
public class operacionNum {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Ingrese un numero 1: ");
        var num1 = sc.nextInt();
        System.out.print("Ingrese un numero 2: ");
        var num2 = sc.nextInt();
        System.out.println("La suma de "+num1+" y "+num2+" es igual a "+(num1+num2));
        System.out.println("La resta de "+num1+" y "+num2+" es igual a "+(num1-num2));
        System.out.println("La multiplicación de "+num1+" y "+num2+" es igual a "+(num1*num2));
        sc.close();
    } 
}
