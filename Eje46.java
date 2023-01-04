/* Ejercicio 46
Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la anchura: ");
        int anch = sc.nextInt();

        System.out.print("Introduzca la altura: ");
        int alt = sc.nextInt();

        if(alt>=2 && anch>=2){

            for(int i=1; i<=alt; i++){

                if(i==1 || i==alt){

                    for(int k=1; k<anch; k++){
                        System.out.print("* ");
                    }

                }else{
                    System.out.print("*");
                    for(int j=2; j<=anch; j++){
                        if(j==anch){
                        System.out.print(" ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                }

                System.out.println("*");

            }

        }else{
            System.out.print("Introduzca los datos correctamente");
        }

        sc.close();
    }
}
