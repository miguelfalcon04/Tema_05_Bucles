/* Ejercicio 37
Realiza un conversor del sistema decimal al sistema de “palotes”.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();

        int volteado=0;

        do{

            volteado=volteado*10+(n%10);
            n=n/10;

        }while(n>0);

        int volteado2=0;

        System.out.print("El " +n+ " en decimal es el ");

        do{

            int dig = volteado%10;

            volteado2=volteado2*10+(dig);
            volteado= volteado/10;

            for(int i=0; i<=dig; i++){
                if(i==dig){
                    System.out.print("-");
                }else{
                    System.out.print("|");
                }
            }

        }while(volteado>0);

        System.out.print(" en el sistema de palotes.");


        sc.close();
    }
}
