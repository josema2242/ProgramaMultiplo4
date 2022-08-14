import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(System.in);
        System.out.println("|************************|");
        System.out.println("| ¿Numero MULTIPLO 4? |");
        System.out.println("**************************");
        System.out.println();

        /* Se pide al usuario que ingrese el numero que va analizar */
        System.out.println("Ingresa el numero a comprobar:"); 

        int numero = scanner.nextInt(); /*Se guarda en la variable "NUMERO" tipo int el numero introducido */

        /* En este if primero se calcula si el numero introducido es igual o menor a 0, */
        if (numero<=0) {
            System.out.println("Ingresa un numero mayor que 0");
        }else {  /* sino es menor o igual a 0 */
            /*se caLcula por medio de otro IF si el numero es MULTIPLO O NO DE 4 */
            if (numero%4 == 0){
                System.out.println("EL numero: " + numero + ", ES MULTIPLO DE 4");
            }else {
                System.out.println("EL numero: " + numero + ", NO ES MULTIPLO DE 4");
            }
        }    

    }
}