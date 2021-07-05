package clase1;
/**7.Pedir un número, comprobar si es primo y preguntar si quiere introducir más
(S/N) y volver a pensar. */
import java.util.*;
public class primoNum {
    public static void main(String[] args) {
        boolean seguir=true;
        var sc = new Scanner(System.in); 

        while (seguir){     
            System.out.print("Ingrese número: ");
            int numA = sc.nextInt();  
            int contador=2;
            boolean primo=true;
            while((primo)&&(contador!=numA)){
                if (numA % contador == 0)
                    primo = false;
                contador++;
            }
            if(primo){
                System.out.print(numA+" Es Primo\n");

            }else if(primo==false){
                System.out.print(numA+" No es Primo\n"); 
            
            }System.out.print("quiere introducir más (S/N):");  
                var rs = new Scanner(System.in);  
                var num = rs.nextLine();  
                if(num.equals("N")){
                    seguir=false;
            }
                else if(num.equals("S")){
                continue;
            
            }   else{
                System.out.print("Caracter (S/N) Errado");  
                break;
            }                
        }        
    }   
}

                
                