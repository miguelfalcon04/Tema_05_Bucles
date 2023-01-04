/* Ejercicio 48
Realiza un programa que diga los dígitos que aparecen y los que no aparecen
en un número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        long n = sc.nextLong();

        long volteado=0;

        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        int seis=0;
        int siete=0;
        int ocho=0;
        int nueve=0;
        int cero=0;

        do{

            int dig = (int)n%10;

            switch (dig){

                case 0:
                cero=1;
                break;

                case 1:
                uno=1;
                break;

                case 2:
                dos=1;
                break;

                case 3:
                tres=1;
                break;

                case 4:
                cuatro=1;
                break;

                case 5:
                cinco=1;
                break;

                case 6:
                seis=1;
                break;

                case 7:
                siete=1;
                break;

                case 8:
                ocho=1;
                break;

                case 9:
                nueve=1;
                break;

            }

            volteado=volteado*10+(dig);
            n=n/10;

        }while(n>0);

        System.out.print("Dígitos que aparecen en el número: ");

        if(cero==1){
            System.out.print("0 ");
        }

        if(uno==1){
            System.out.print("1 ");
        }

        if(dos==1){
            System.out.print("2 ");
        }

        if(tres==1){
            System.out.print("3 ");
        }

        if(cuatro==1){
            System.out.print("4 ");
        }

        if(cinco==1){
            System.out.print("5 ");
        }

        if(seis==1){
            System.out.print("6 ");
        }

        if(siete==1){
            System.out.print("7 ");
        }

        if(ocho==1){
            System.out.print("8 ");
        }

        if(nueve==1){
            System.out.print("9 ");
        }

        System.out.println(" ");

        System.out.print("Dígitos que no aparecen en el número: ");

        if(cero==0){
            System.out.print("0 ");
        }

        if(uno==0){
            System.out.print("1 ");
        }

        if(dos==0){
            System.out.print("2 ");
        }

        if(tres==0){
            System.out.print("3 ");
        }

        if(cuatro==0){
            System.out.print("4 ");
        }

        if(cinco==0){
            System.out.print("5 ");
        }

        if(seis==0){
            System.out.print("6 ");
        }

        if(siete==0){
            System.out.print("7 ");
        }

        if(ocho==0){
            System.out.print("8 ");
        }

        if(nueve==0){
            System.out.print("9 ");
        }

        sc.close();
    }
}
