/* Ejercicio 18
Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        int n1=sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int n2=sc.nextInt();

        int max=0;
        int min=0;

        if(n1==n2){
            System.out.print("Deben ser distintos.");
        }

        if(n1>n2){
            max=n1;
            min=n2;
        }else{
            max=n2;
            min=n1;
        }

        for(int i=min; i<max;i+=7){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
