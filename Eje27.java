/* Ejercicio 27
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Se mostrarán los múltiplos de 3 desde 1 hasta: ");
        int n = sc.nextInt();

        for(int i=1; i<n; i++){

            if(i%3==0){
                System.out.print(i+" ");
            }

        }

        sc.close();
    }
}
