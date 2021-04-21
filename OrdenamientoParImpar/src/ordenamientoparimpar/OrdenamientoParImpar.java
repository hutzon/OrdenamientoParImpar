package ordenamientoparimpar;

import java.util.Scanner;

public class OrdenamientoParImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int [10];
        int conteo_par=0, conteo_impar=10;
        
        System.out.println("Ingrese el listado de numeros: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
            
            if(arreglo[i]%2==0){
                conteo_par++;
            }else{
                conteo_impar++;
            }
        }
        
        int[] par= new int[conteo_par];
        int[] impar=new int[conteo_impar];
        
        conteo_par=0;
        conteo_impar=0;
        
        for (int i = 0; i < 10; i++) {
            if(arreglo[i]%2==0){
                par[conteo_par]=arreglo[i];
                conteo_par++;        
            }else{
                impar[conteo_impar]=arreglo[i];
                conteo_impar++;
            }
        }
        
        System.out.print("Arreglo Pares: ");
        for (int i = 0; i < conteo_par; i++) {
            System.out.print(par[i]+" ");
        }
        
        System.out.println(" ");
        
        System.out.print("Arreglo Impares: ");
        for (int i = 0; i < conteo_impar; i++) {
            System.out.print(impar[i]+" ");
        }
        
        System.out.println(" ");


    }
    
}
