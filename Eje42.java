/* Ejercicio 42
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();

        boolean primo;

        for(int i=1; i<=5; i++){

            primo=true;

            for(int j=2; j<n-1 &&primo; j++){

                if(n%j==0){
                    primo=false;
                }else{
                    primo=true;
                }

            }

            if(primo){
                System.out.println(n+" es primo");
            }else{
                System.out.println(n+" no es primo");
            }

            n++;

        }

        sc.close();
    }
}
