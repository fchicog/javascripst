package clase1;
/**Captura de datos**/ 
import java.util.*;

public class leerDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");        
        System.out.print("Ingrese su nombre : ");
        String nom = sc.nextLine();        
        System.out.print("Ingrese su direccion : ");
        String dir = sc.nextLine();
        System.out.print("Ingrese su edad : ");
        int edad = sc.nextInt();
        System.out.println("*************\nNombre: "+nom+"\nEdad: "+edad+"\nDireccion: "+dir);
        sc.close();
    }   
}

