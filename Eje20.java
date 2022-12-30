/* Ejercicio 20
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("De que altura quieres la piramide: ");
        int altura = sc.nextInt();

        System.out.print("Introduzca el caracter de la pirámide: ");
        String caract = sc.next();

        for (int i = 1; i <= altura-1; i++) {
            for (int j = i; j <altura ; j++){
                System.out.print(" "); 
            }
            if(i!=1){
            System.out.print(caract);
            }
            for (int k = 1; k < (i-1)*2 ; k++){
                System.out.print(" "); 
            }
            System.out.print(caract);
            System.out.println("");
        }

        for(int i=1;i<=altura*2-1;i++){
            System.out.print(caract);
        }

        sc.close();
    }
}
