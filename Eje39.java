/* Ejercicio 39
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca a un número entero positivo: ");
        int n = sc.nextInt();

        int fact=1;

        for(int i=1; i<=n; i++){

            fact=fact*i;
            System.out.println(i+"! = "+fact);

        }

        sc.close();
    }
}
