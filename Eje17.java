/* Ejercicio 17
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu número: ");
        int n = sc.nextInt();

        int next=0;
        int sucesion=n;

        if(n>0){

            for(int i=0; i<100;i++){

                sucesion=sucesion+next;
                n++;
                next=n;

            }
        }else{
            System.out.print("Introduce un número positivo");
        }

        System.out.print("La suma de los siguientes 10 numeros es: "+sucesion);

        sc.close();
    }
}
