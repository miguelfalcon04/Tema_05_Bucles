/* Ejercicio 8
Muestra la tabla de multiplicar de un número introducido por teclado.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Se le mostrará la tabla del: ");
        int tabla = sc.nextInt();

        for(int i =1; i<=10; i++){
            System.out.printf("%2d x %d = %2d\n",i,tabla,(i*tabla));
        }

        sc.close();
    }
}
