
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("---Progama que crea tablas de multiplicar-----");

       int empiezo;
        int end;
        int numero;
        int mult =0;

        System.out.print("\nIngrese el numero de la tabla de multiplicar: ");
        numero = entrada.nextInt();

        System.out.print("\nIngrese el inicio de la tabla del "+numero+" : ");
        empiezo = entrada.nextInt();


        System.out.print("\nIngrese el final de la tabla del "+numero+ " :");
        end = entrada.nextInt();

        if (empiezo <= end){
            System.out.println("Su tabla del " + numero+ " es: \n");
            for (int i = empiezo; i <= end ;i++ ){
                mult = numero*i;
                System.out.println(numero + " x " + i +" = "+mult);
            }
        }

        else {
            System.out.println("No se le puede mostrar la tabla en ese orden");
        }



    }
}
