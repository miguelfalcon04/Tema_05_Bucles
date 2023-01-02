/* Ejercicio 30
Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer día: ");
        String dia1 = sc.next();
        System.out.print("Introduzca la hora: ");
        int h1 = sc.nextInt();

        System.out.print("Introduzca el segundo día: ");
        String dia2 = sc.next();
        System.out.print("Introduzca la hora: ");
        int h2 = sc.nextInt();

        int nd1=0;
        switch (dia1){
            case "lunes":
            nd1=1;
            break;

            case "martes":
            nd1=2;
            break;

            case "miercoles":
            nd1=3;
            break;

            case "jueves":
            nd1=4;
            break;

            case "viernes":
            nd1=5;
            break;

            case "sabado":
            nd1=6;
            break;

            case "domingo":
            nd1=7;
            break;

        }

        int nd2=0;
        switch (dia2){
            case "lunes":
            nd2=1;
            break;

            case "martes":
            nd2=2;
            break;

            case "miercoles":
            nd2=3;
            break;

            case "jueves":
            nd2=4;
            break;

            case "viernes":
            nd2=5;
            break;

            case "sabado":
            nd2=6;
            break;

            case "domingo":
            nd2=7;
            break;

        }

        int difh=0;

        if(h1>h2){
            difh=h1-h2;
        }else{
            difh=h2-h1;
        }

        if(nd1<nd2){
            System.out.print("Entre el "+dia1+ "a las "+h1+ " y el "+ dia2+" a las " +h2+ " hay "+ (((nd2-nd1)*24)+difh) + " horas de diferencia");
        }else{
            System.out.print("Introduce bien los datos");
        }

        sc.close();
    }
}
