
import java.lang.Math;
/* Este programa calcula el perimetro de una circunferencia */
public class circulo{
    public static void main(String[] args) {
        int a=100;
        int b=5;
        int suma =a+b;
        int div =a/b;
        System.out.println("suma de "+a+" + "+b+" : "+suma);
        System.out.println("div de "+a+" / "+b+" : "+div);
        double radio=25.0;
        double pi=Math.PI;      
        double perimetro=2.0*radio*pi;
        double resultado=Math.pow(radio*pi, 2);
        System.out.println("resultado :"+perimetro);
        System.out.println("resultado :"+resultado);

        
    }


}