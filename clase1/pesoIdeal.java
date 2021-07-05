package clase1;
/**6.Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres = altura - 110 */
import java.util.*;
public class pesoIdeal {   
    public static void main(String[] args) {
        
        Scanner sc=  new Scanner(System.in);
        System.out.print("Ingrese el sexo (H/M): ");
        String sexo=sc.nextLine();
        System.out.print("Ingrese la altura en centimetros (CM): ");
        int cm=sc.nextInt();
        if (sexo.equals("H")){
            System.out.print("Su peso Ideal es: "+(cm-110));
        }else if(sexo.equals("M")){
            System.out.print("Su peso Ideal es: "+(cm-120));
        }
        sc.close();
    }
    
}
