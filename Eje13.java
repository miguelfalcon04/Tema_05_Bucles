/* Ejercicio 13
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pos=0;
        int neg=0;

        for(int i=0; i<10;i++){
            System.out.print("Introduzca un número: ");
            int n = sc.nextInt();

            if(n>0){
                pos++;
            }else{
                neg++;
            }

        }

        System.out.print("Hay "+pos+" positivos y "+neg+" negativos");

        sc.close();
    }
}
