/* Ejercicio 32
Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long n = sc.nextLong();

        long sumpar=0;
        long volteado=0;
        long volteado2=0;
        long dig=0;

        do{

            volteado=volteado*10+(n%10);

            n=n/10;

        }while(n>0);

        System.out.print("Dígitos pares: ");

        do{

            dig=volteado%10;

            volteado2=volteado2*10+(dig);

            volteado=volteado/10;

            if(dig%2==0){
                System.out.print(dig+" ");
                sumpar=sumpar+(dig);
            }

        }while(volteado>0);

        System.out.println("");
        System.out.print("Suma de los dígitos pares: "+sumpar);

        sc.close();
    }
}
