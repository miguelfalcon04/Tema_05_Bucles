/* Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int cont=0;

        do{

            System.out.print("Introduzca un número: ");
            int n = sc.nextInt();
            cont++;

            sum=sum+n;

        }while(sum<10000);

        System.out.println("El total es de: "+sum);
        System.out.println("El contador de número es: "+cont);
        System.out.println("La media de los número es: "+(sum/cont));

        sc.close();
    }
}
