/* Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        System.out.print("Introduzca el dígito que busca: ");
        int dig = sc.nextInt();

        int volteado=0;
        int volteado2=0;
        int cont=1;

        do{

            volteado=volteado*10+(n%10);

            n=n/10;

        }while(n>0);

        do{

            volteado2=volteado2*10+(volteado%10);

            volteado=volteado/10;

            cont++;

            if(dig==volteado%10){
                System.out.println("El dígito "+dig+ " se encuentra en: "+cont);
            }

        }while(volteado>0);

        sc.close();
    }
}
