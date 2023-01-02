/* Ejercicio 36
Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long volteado=0;

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long n = sc.nextInt();
        long save = n;

        do{

            volteado=volteado*10+(n%10);
            n=n/10;

        }while(n>0);

        if(volteado==save){
            System.out.print("El "+save+" es capicúa");
        }else{
            System.out.print("El "+save+" no es capicúa");
        }

        sc.close();
    }
}
