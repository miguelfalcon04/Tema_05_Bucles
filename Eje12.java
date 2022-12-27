/* Ejercicio 12
Escribe un programa que muestre los n primeros términos de la serie de
sucenacci. El primer término de la serie de sucenacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numeros de la sucesión que desea: ");
        int n = sc.nextInt();

        int suce1= 0;
        int suce2= 1;
        int suce3=0;
        System.out.print("0 ");
        for(int i= 1;i<=n;i++){
            suce3=suce2;
            System.out.print(suce2+" ");
            suce2=suce2+suce1;
            suce1=suce3;
        }

        sc.close();
    }
}
