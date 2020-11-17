import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("---Progama que crea tablas de multiplicar-----");

        int empiezo;
        int end;
        int numero;
        int mult =0,i=0;

        System.out.print("\nIngrese el numero de la tabla de multiplicar: ");
        numero = entrada.nextInt();

        System.out.print("\nIngrese el inicio de la tabla del "+numero+" : ");
        empiezo = entrada.nextInt();


        System.out.print("\nIngrese el final de la tabla del "+numero+ " :");
        end = entrada.nextInt();

        i = empiezo;//aca guardo el inicio de la abla en el ierador

        if (empiezo <= end){
            System.out.println("Su tabla del " + numero+ " es: \n");
            while (i <= end){
                mult = numero*i;
                System.out.println(numero + " x " + i +" = "+mult);
                i++;
            }
        }

        else {
            System.out.println("No se le puede mostrar la tabla en ese orden");
        }



    }
}
