/* Ejercicio 49
Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");

        boolean esprimo;
        int max=0;
        int min=999999999;
        int cont=0;
        int sum=0;

        do{

            int n = sc.nextInt();

            esprimo=true;

            for(int i=2; i<n/2+1; i++){

                if(n%i==0){
                    esprimo=false;
                }

            }

            if(!esprimo){

                cont++;

                sum=sum+n;

                if(n>max){
                    max=n;
                }

                if(n<min){
                    min=n;
                }
            }

        }while(!esprimo);

        System.out.println("Ha introducido "+cont+" números no primos.");
        System.out.println("Máximo: "+max);
        System.out.println("Mínimo: "+min);
        System.out.println("Media: "+((float)sum/cont));

        sc.close();
    }
}
