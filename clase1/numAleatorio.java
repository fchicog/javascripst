package clase1;
/**5.Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio. */
import java.util.*;
public class numAleatorio {
    public static void main(String[] args) {
        Random r=new Random();
        int numRan=r.nextInt(100)+1;
        var sc = new Scanner(System.in);        
        boolean seguir = true;
        while (seguir){               
            System.out.print("Ingrese número: ");
            int numA = sc.nextInt();         
            if (numA>numRan){
                System.out.print("El número que busca es Menor\n");
            }else if(numA<numRan){
                System.out.print("El número que busca es Mayor\n");                
            }else{
                System.out.print("Felicidades!! encontraste el número Aleatorio.");
                seguir=false;
            }            
        }       
    sc.close();     
    }
}
