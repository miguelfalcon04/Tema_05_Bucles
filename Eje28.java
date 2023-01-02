/* Ejercicio 28
Escribe un programa que calcule el factorial de un número entero leído por
teclado.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero entero: ");
        int n = sc.nextInt();

        int factorial=1;

        for(int i=n; i>=1; i--){

            factorial=factorial*i;

        }

        System.out.print(n+"! = "+factorial);

        sc.close();
    }
}
