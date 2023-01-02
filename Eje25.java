/* Ejercicio 25
Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero a voltear: ");
        int n = sc.nextInt();

        int volteado=0;

        do{

            volteado=volteado*10+(n%10);

            n=n/10;

        }while(n>0);

        System.out.print("El numero volteado es: "+volteado);

        sc.close();
    }
}
