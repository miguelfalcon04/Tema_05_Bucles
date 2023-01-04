/* Ejercicio 43
Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int pos = sc.nextInt();

        int volteado=0;
        int cont=1;

        do{

            volteado=volteado*10+(n%10);
            n=n/10;

        }while(n>0);

        int volteado2=0;

        do{

            volteado2= volteado2*10+(volteado%10);
            volteado=volteado/10;
            cont++;

        }while(cont!=pos);

        int volteado3=0;

        System.out.println(volteado);
        
        do{

            volteado3=volteado3*10+(volteado%10);
            volteado=volteado/10;

        }while(volteado>0);

        System.out.print("Los números partidos son "+volteado2+ " y el "+volteado3);

        sc.close();
    }
}
