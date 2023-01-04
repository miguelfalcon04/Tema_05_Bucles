/* Ejercicio 50
Una empresa de cartelería nos ha encargado un programa para realizar uno de
sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
durante el 2018, han recibido muchos pedidos del cartel que muestra el número
155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios
que habrá entre los números. La altura mínima es 5. La anchura de los números
siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Con este programa dibujaremos el 155 con asteriscos y nos diras la altura y los espacios ");
        System.out.println("Diga la altura, minimo 5");
        int altura=sc.nextInt();
        System.out.println("Diga los espacios, minimo 1");
        int espacios=sc.nextInt();

        for(int i=1;i<=altura;i++){
            if(i<=3){
                System.out.print("*");
                for(int j=1;j<=espacios;j++){
                    System.out.print(" ");
                }
                if(i==1 || i==3 || i==altura){
                    System.out.print("****");
                }else{
                    System.out.print("*");
                }
                if(i==1 || i==3 || i==altura){
                    for(int j=1;j<=espacios;j++){
                        System.out.print(" ");
                    }
                }else{
                    for(int j=1;j<=espacios;j++){
                        System.out.print(" ");
                    }
                    System.out.print("   ");
                }    
                if(i==1 || i==3 || i==altura){
                    System.out.print("****");
                }else{
                    System.out.print("*");
                }
                System.out.println("");
            }else{
                System.out.print("*");
                for(int j=1;j<=espacios;j++){
                    System.out.print(" ");
                }
                if(i==altura){
                    System.out.print("***");
                }else{
                    System.out.print("   ");
                }
                System.out.print("*");
                for(int j=1;j<=espacios;j++){
                    System.out.print(" ");
                }
                if(i==altura){
                    System.out.print("***");
                }else{
                    System.out.print("   ");
                }
                System.out.print("*");
                System.out.println("");
            }    

        }
        sc.close();
    }
}
