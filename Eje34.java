/* Ejercicio 34
Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        long n1 = sc.nextLong();

        System.out.print("Introduzca el segundo número: ");
        long n2 = sc.nextLong();

        long volteado1=0;
        long volteado3=0;
        long volteado2=0;
        long volteado4=0;
        long numpar=0;
        long numimp=0;
        long dig1=0;
        long dig2=0;

        do{

            volteado1=volteado1*10+(n1%10);
            n1=n1/10;

            volteado2=volteado2*10+(n2%10);
            n2=n2/10;

        }while(n1>0 || n2>0);

        do{

            dig1=volteado1%10;
            volteado3=volteado3*10+(dig1);
            volteado1=volteado1/10;

            if(dig1%2==0){
                numpar=numpar*10+(dig1);
            }else{
                numimp=numimp*10+(dig1);
            }

            dig2=volteado2%10;
            volteado4=volteado4*10+(dig2);
            volteado2=volteado2/10;

            if(dig2%2==0){
                numpar=numpar*10+(dig2);
            }else{
                numimp=numimp*10+(dig2);
            }

        }while(volteado1>0 || volteado2>0);

        System.out.println("El número formado por los dígitos pares es "+numpar);
        System.out.println("El número formado por los dígitos  impares es "+numimp);

        sc.close();
    }
}
