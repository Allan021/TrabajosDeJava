

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("----Programa para calcular las letras en una cadena----\n");

        //le pasare un objeto de tipo scanner para lograr sacar las palabras
        pedirDatos(entrada);

    }

    public static void pedirDatos(Scanner entrada){
        String cadena;
        String palabras[];
        System.out.println("Ingrese una lista de palabras separadas por comas: ");
        cadena = entrada.nextLine();
        palabras = cadena.split(",");



        sacarletra(palabras,entrada);

    }

    public static void sacarletra(String[] palabra,Scanner entrada){
        char letra;
        int contadores[] = new int[palabra.length];//SOLO ES PARA IMPRIMIRLO CUANTAS letras tiene cada uno
        int contador=0,x=0;

        System.out.print("\nIngrese la letra que quiere buscar en las palabras: ");
        letra = entrada.nextLine().charAt(0);

        for(int i=0;i<palabra.length;i++){
            contador=0;
            for(int j=0;j< palabra[i].length();j++){//aca recorro cada una de las palabras

                if(letra == palabra[i].charAt(j)){
                  contador++;

                }
              contadores[i]= contador;

            }

        }

        System.out.println("La cantidad de letras "+letra+" en los nombres es: ");
        for (int i=0;i<palabra.length;i++){
            System.out.println(palabra[i] + " = "+contadores[i] +" letras " + letra);
        }

    }

}
