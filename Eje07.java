/* Ejercicio 7
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opor = 4;
        int combi = 1234;
        boolean acierto=false;

        do{

            acierto=false;
            System.out.print("Introduzca la combinación: ");
            int ti = sc.nextInt();

            if(ti==combi){

                acierto=true;
                System.out.print("La caja fuerte se ha abierto satisfactoriamente");

            }else{
                opor--;
                System.out.println("Lo siento, esa no es la combinación");
            }

        }while(opor>0 && acierto==false);

        sc.close();
    }
}
