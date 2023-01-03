/* Ejercicio 41
Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();
        int save=n;

        int volteado=0;
        int par=0;
        int impar=0;

        do{

            int dig=n%10;

            volteado=volteado*10+(dig);
            n=n/10;

            if(dig%2==0){
                par++;
            }else{
                impar++;
            }

        }while(n>0);

        System.out.print("El "+save+" contiene "+par+" dígitos pares y "+impar+" dígitos impares");

        sc.close();
    }
}
