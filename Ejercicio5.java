
package Ciclos;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int arreglo[]= new int[10];
        int conteo_pares=0,conteo_impares=0;
        
        //aca estoy pidiendo los datos
        System.out.println("Llenar el arreglo: ");
        
        for(int i=0;i<10;i++){
            System.out.print(i+1+".Digite el numero:");
            arreglo[i]=entrada.nextInt();
            
            //ahora vamos a sacar la cantidad de pares e impares
            if(arreglo[i]%2 ==0){
                conteo_pares++;//esto es para sacar cuantos pares hay
            }
            else{
                conteo_impares++;//sacar la cantidad de impares
            }
        }
        
        System.out.println("El arreglo sin separar: ");
        for(int i=0;i<10;i++){
            System.out.print(arreglo[i]+" - ");
        }
        
        //creando 2 arreglos con la cantidad exacta de valores pares e impares
        int par[]= new int[conteo_pares];
        int impar[]= new int[conteo_impares];//aca tengo 2 arreglos diferentes que me guardaran los valores exactor
        
        //estos seran mis nuevos contadores e iteradores
        conteo_pares=0;
        conteo_impares=0;
        
        //Lenando los 2 arreglos
        
        for(int i=0;i<10;i++){
            //Llenando el arreglo par
            if(arreglo[i]%2==0){
                
                par[conteo_pares]=arreglo[i];//el arreglo en la posicion 0 sera igual al numero par en la posicion 0 del usuario
                conteo_pares++;
            }
            else{
                //Llenando el arreglo impar
                impar[conteo_impares]=arreglo[i];
                conteo_impares++;
            }
        }
        
        System.out.println("\nEl arreglo de pares: ");
        for(int i=0;i<conteo_pares;i++){
            System.out.print(par[i]+" - ");
        }
        
        System.out.println("\nEl arrego de impares: ");
        for(int i=0;i<conteo_impares;i++){
            System.out.print(impar[i]+" - ");
        }
        System.out.println("");
        
    }
}
