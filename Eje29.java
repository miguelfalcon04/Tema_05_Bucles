/* Ejercicio 29
Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Introduzca su segundo número: ");
        int n2 = sc.nextInt();

        for(int i=1; i<n1; i++){

            if(i%n2!=0){
                System.out.print(i+" ");
            }

        }

        sc.close();
    }
}
