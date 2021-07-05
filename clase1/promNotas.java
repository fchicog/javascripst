package clase1;
/**2.Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales.
 */
import java.util.*;
public class promNotas {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Ingrese un nombre del estudiante: ");
        var nom = sc.nextLine();
        System.out.print("Ingrese nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.print("Ingrese nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.print("Ingrese nota 3: ");
        float nota3 = sc.nextFloat();
        float prom=(nota1+nota2+nota3)/3;
        System.out.println("Promedio de "+nom+" es: "+prom); 
        if (prom >=3){
            System.out.println("Aprovado"); 
        }else{
            System.out.println("Reprovado");  
        }        
        sc.close();
    } 
}
