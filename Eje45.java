/* Ejercicio 45
Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int pos = sc.nextInt();

        System.out.print("Introduzca el nuevo dígito: ");
        int dig = sc.nextInt();

        int volteado=0;
        int cont=0;

        do{

            volteado=volteado*10+(n%10);
            n=n/10;

        }while(n>0);

        int volteado2=0;

        do{

            volteado2= volteado2*10+(volteado%10);
            volteado=volteado/10;
            cont++;

        }while(cont!=pos);

        int volteado3=0;

        System.out.println(volteado);
        
        do{

            volteado3=volteado3*10+(volteado%10);
            volteado=volteado/10;

        }while(volteado>0);

        System.out.print("El número resultante es "+(volteado2/10)+dig+volteado3);

        sc.close();
    }
}
