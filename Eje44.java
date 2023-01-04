/* Ejercicio 44
Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int pos = sc.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        int dig = sc.nextInt();

        int volteado=0;
        int cont=1;

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

        System.out.print("El número resultante es "+volteado2+dig+volteado3);

        sc.close();
    }
}
