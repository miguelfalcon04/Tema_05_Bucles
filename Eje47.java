/* Ejercicio 47
Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int alt = sc.nextInt();

        if(alt%2==0 ||alt<5 ){
            System.out.print("La altura introducida no es correcta");
        }else{

            for(int i=1; i<=alt;i++){

                System.out.print("M");

                for(int k=0; k<4; k++){

                    if(i==1 || i==alt || i==(alt/2)+1){
                        System.out.print("M");
                    }else{
                        System.out.print(" ");
                    }

                }

                System.out.println("M");

            }
        }

        sc.close();
    }
}
