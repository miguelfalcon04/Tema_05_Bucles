/* Ejercicio 10
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número neg.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int media=0;
        int cont=0;
        boolean neg=false;

        do{

            neg=false;

            System.out.print("Introduzca su nota: ");
            n = sc.nextInt();

            if(n>0){
                cont++;
                media= media+n;
            }else{
                neg=true;
            }

        }while(neg==false);

        System.out.print("La media es de: "+(media/cont));

        sc.close();
    }
}
