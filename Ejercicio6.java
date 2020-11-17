

import java.util.Scanner;

public class Ejercicio6 {
    private static Scanner entrada = new Scanner(System.in);//para usar el Scanner en todas mis funciones

    public static void main(String[] args) {

        menu();
    }

    public static void menu(){
        int opcion=0;
        do {
            System.out.println("\nOpciones disponibles:");
            System.out.println("1.Convertidor de masa");
            System.out.println("2.Convertidor de Velocidad");
            System.out.println("3.Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    convertirMasa();//llamando al encargado de convertir la masa
                    break;
                case 2:
                    convertidorVelocidad();//llamando al encargado de convertir la velocidad
                    break;
                case 3:
                    System.out.println("\nGracias por usar este programa");
                    break;
                default:break;
            }

        }while (opcion != 3);
    }

    public static void  convertirMasa(){
        double libras,kilos;
        int seleccion=0;
        do {
            System.out.println("\n\tConversiones disponibles");
            System.out.println("1.Convertir de Libras a Kilogramos");
            System.out.println("2.Convertir de Kilogramos a Libras");
            System.out.print("Seleccione una opcion: ");
            seleccion = entrada.nextInt();

            if (seleccion < 1 || seleccion > 2) {
                System.out.println("\nOpcion Incorrecta, Intente de nuevo :)\n");
            }

        }while (seleccion < 1 || seleccion > 2);//por si el usuario se equivoca

        if (seleccion == 1){
            System.out.print("\nIngrese el peso en libras: ");
            libras = entrada.nextDouble();                            //esto es para redondearlo a 3 cifras
            System.out.println("El peso de "+libras+" Lbs equivale a: "+kilogramos(libras) +" kg");


        }else{
            System.out.print("\nIngrese el peso en Kilogramos: ");
            kilos = entrada.nextDouble();
            System.out.println("El peso de "+kilos+" Kg equivale a: "+libras(kilos) + " lbs");
        }


    }

    public static void convertidorVelocidad(){
        double milles,kilometer;
        int seleccion;

        do{//para que el usuario no se equivoque
        System.out.println("\n\tConversiones Disponibles");
        System.out.println("1.Convertir de Millas a Kilometros");
        System.out.println("2.Convertir de Kilometros a Millas");
        System.out.print("Seleccione una opcion: ");
        seleccion = entrada.nextInt();

        if (seleccion < 1 || seleccion > 2) {
            System.out.println("\nOpcion Incorrecta, Intente de nuevo :)\n");
        }

    }while (seleccion < 1 || seleccion > 2);//por si el usuario se equivoca



        if (seleccion == 1){
            System.out.print("\nIngrese la velocidad en millas: ");
            milles = entrada.nextDouble();
            System.out.println("La velocidad de "+milles+" millas equivale a: "+kilometros(milles)+" km");


        }else{
            System.out.print("\nIngrese la velocidad en Kilometros: ");
            kilometer= entrada.nextDouble();
            System.out.println("La velocidad de "+kilometer+" kilometros  equivale a: "+millas(kilometer)+" millas");
        }




    }


//las funciones que me lo van a convertir

    /*Funciones Convertidoras de medidas en total creé 4 funciones independientes y las llamare dependoiendo de un condicional*/


    //funcion para convertir de libras a kilos o viceversa
    public static double kilogramos(double lb){
        double kilogramos = lb/2.205;//este es el valor que voy a retornar

       return kilogramos;
    }

    //funcion para convertir de kilos a libras
    public static double libras(double kg){
        double libras = kg * 2.205;

        return libras;
    }

    public static double kilometros(double millas){
        double km = millas * 1.609;

        return km;//retornando la cantidad de km
    }

    public static double millas(double kilometros){
double millas = kilometros / 1.609;

return millas;//retornando las millas que acabo de convertir
    }


}
