/* Ejercicio 21
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cont=0;
        int impar=0;
        int contimp=0;
        int maxpar=0;

        do{

            System.out.print("Introduzca un número: ");
            n = sc.nextInt();

            if(n>0){

                cont++;

                if(n%2==0 && n>maxpar){
                    maxpar=n;
                }else{
                    contimp++;
                    impar=impar+n;
                }

            }

        }while(n>0);

        System.out.println("Se han introducido "+ cont +" números");
        System.out.println("La media de los impares es de: "+(float)(impar/contimp));
        System.out.println("El mayor de los pares es: "+maxpar);

        sc.close();
    }
}
