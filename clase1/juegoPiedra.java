package clase1;
/**8. Realizar un programa que permita controlar el juego de piedra, papel, tijera
introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
de cada ronda preguntar si desea volver a jugar.
 */
import java.util.*;
public class juegoPiedra {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        boolean salir = true;
        while(salir){
            System.out.print("Jugador 1- dijite P para piedra, L para papel y T para tijera: ");
            String jug1=sc.nextLine();
            System.out.print("Jugador 2- dijite P para piedra, L para papel y T para tijera: ");
            String jug2=sc.nextLine();            
            if (jug1.equals(jug2)){
                System.out.println("Es un empate!!");                
            }else if(jug1.equals("P")&&jug2.equals("T")){
                System.out.println("Gana!! Jugador 1");
            }else if(jug1.equals("T")&&jug2.equals("L")){
                System.out.println("Gana!! Jugador 1");             
            }else if(jug1.equals("L")&&jug2.equals("P")){
                System.out.println("Gana!! Jugador 1");             
            }else{
                System.out.println("Gana!! Jugador 2");             
            }
            System.out.print("Desea volver a jugar (S|N)?: ");
            var opcion=sc.nextLine();
            if (opcion.equals("N")){
                salir=false;
            }


        }
    }
    
}
