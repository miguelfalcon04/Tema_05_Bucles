/* Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

@author miguelfalcon
*/

public class Eje22 {
    public static void main(String[] args) {

        boolean primo;

        for(int i=2; i<=100; i++){

            primo=true;

            for(int j=2;j<i;j++){

                if(i%j==0){
                    primo=false;
                }

            }

        if(primo){
            System.out.print(i+" ");
        }

        }
    }
}
