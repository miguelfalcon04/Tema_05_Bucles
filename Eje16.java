/* Ejercicio 16
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        boolean esprimo=true;

        int i=1;

        do{

            i++;

            if(n%i==0){
                esprimo=false;
            }else{
                esprimo=true;
            }

        }while(esprimo && i<n-1);

        if(esprimo){
            System.out.print("Es primo");
        }else{
            System.out.print("No es primo");
        }

        sc.close();
    }
}
