/* Ejercicio 51
El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero (mayor que cero): ");
        int n = sc.nextInt();

        int volteado=0;

        do{

            int dig=(n%10);

            if(dig==0 || dig==8){
                n=n/10;
            }else{
                volteado=volteado*10+(dig);
                n=n/10;
            }

        }while(n>0);

        int volteado2=0;

        do{

            volteado2=volteado2*10+(volteado%10);
            volteado=volteado/10;

        }while(volteado>0);

        System.out.print("Después de haber sido comido por el gusano numérico se queda en "+volteado2);

        sc.close();
    }
}
