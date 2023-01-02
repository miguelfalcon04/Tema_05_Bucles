/* Ejercicio 24
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿De que altura quieres la piramide de numeros?: ");
        int altura = sc.nextInt();
        int n=1;

        for(int i=1 ; i<=altura ; i++){

            for(int j=i ; j<altura ; j++){
                System.out.print(" ");
            }
            n=1;
            for(int k=1 ; k<i*2 ; k++){
                if(k<=i){
                System.out.print(k);
                }else{
                    System.out.print(k-n*2);
                    n++;
                }
            }
            System.out.println("");
        }

		sc.close();
    }
}
