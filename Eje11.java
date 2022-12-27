/* Ejercicio 11
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
    
        System.out.println("   n  |    n²   |    n³");
        System.out.println("---------------------------");
        for (int i = num; i < num + 5; i++) {
          System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
        }

        sc.close();
    }
}
