/* Ejercicio 9
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();

        int vuelta=0;

        int cont=0;

        do{

            vuelta=n%10;
            n=n/10;
            cont++;

        }while(n>0);

        System.out.print("Tiene "+cont+" digitos");

        sc.close();
    }
}
