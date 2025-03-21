/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_ramonnolasco;

import java.util.Random;

/**
 *
 * @author ramon
 */
public class BusquedaBinaria {
      
    public static int[] crearArreglo ( int tamaño ) {
        
        Random rand = new Random();
        int[] arreglo = new int [tamaño];
        
        for ( int i = 0 ; i < arreglo.length ; i++){
            arreglo[i] = rand.nextInt(100);
        
        }    
        return arreglo;
    }
    
    public static void imprimirArreglo ( int[] arreglo ) {
        
        for ( int i = 0 ; i < arreglo.length ; i++){
            System.out.print(" [" + arreglo[i] + "] ");
        }
        
    }
       
    public static void ordenarArreglo(int[] arreglo) {
        
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    intercambio = true;
                }
            }
        } while ( intercambio );
    }

    public static int busquedaBinaria ( int[] arreglo, int numero ) {
        return buscarRecursivo(arreglo, numero, 0, arreglo.length - 1);
    }

    private static int buscarRecursivo ( int[] arreglo, int numero, int izquierda, int derecha) {
        
        if (izquierda > derecha) {
            return -1;
        }

        int medio = izquierda + ( derecha - izquierda )/ 2;
        if (arreglo[medio] == numero) {
            return medio;
        } else if (arreglo[medio] > numero) {
            return buscarRecursivo(arreglo, numero, izquierda, medio - 1);
        } else {
            return buscarRecursivo(arreglo, numero, medio + 1, derecha);
        }
    }
    
}
