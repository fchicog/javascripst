package clase1;
/**4. Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos.
*/
import java.util.*;
public class tablaMult {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int numH = sc.nextInt();  
        for (int i = 0;i<=10;i++){
            System.out.println(numH+"x"+i+": "+(numH*i));

        } 
    sc.close();     
    }
        
}

