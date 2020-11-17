
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int mult =0;
        int f=0;

        System.out.println("---Progama que crea tablas de multiplicar-----");

        do {


            System.out.print("\nIngrese el numero de la tabla de multiplicar (0 al 12): ");
            numero = entrada.nextInt();
            if (numero>0 && numero < 13 ) {
                System.out.println("Su tabla del " + numero + " es: \n");
                f++;
            }

            if (numero>0 && numero < 13 ) {
                for (int i=0;i <= 10;i++) {
                    mult = numero * i;
                    System.out.println(numero + " x " + i + " = " + mult);

                }

            }


        }while (numero>0 && numero < 13);

        System.out.println("Usted imprimio "+ f +" tablas de multiplicar");

    }
}
