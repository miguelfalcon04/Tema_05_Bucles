/* Ejercicio 19
Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la pirámide: ");
        int alt = sc.nextInt();

        System.out.print("Introduzca el caracter de la pirámide: ");
        String caract = sc.next();

        for(int i=1; i<alt;i++){

            for(int j=i;j<alt;j++){
                System.out.print(" ");
            }

            for(int k=1; k<i*2; k++){
                System.out.print(caract);
            }

            System.out.println("");
        }

        sc.close();
    }
}
