/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_ramonnolasco;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ramon
 */
public class Lab9P1_RamonNolasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ConversionesDecimales conversion = new ConversionesDecimales();
        BusquedaBinaria busqueda = new BusquedaBinaria();
        
        int opcion;
        
        do {
            System.out.println("---------- MENU -----------");
            System.out.println("");
            System.out.println("1 - Conversiones Decimales");
            System.out.println("2 - Busqueda Binaria");
            System.out.println("3 - Es palindromo ?");
            System.out.println("4 - ( Salir )");
            System.out.println("");
            System.out.println("Ingrese una opcion: ");
            
            opcion = input.nextInt();
            
            switch ( opcion ) {
                
                case 1:
                    
                    System.out.println("----- Conversiones Decimales -----");
                    System.out.println("Ingrese un numero: ");
                    int numero = input.nextInt();
                    
                    System.out.println("    Numero decimal = " + numero);
                    System.out.println("    Numero binario = " + conversion.aBinario(numero));
                    System.out.println("    Numero octal = " + conversion.aOctal(numero));
                    System.out.println("    Numero hexadecimal = " + conversion.aHexadecimal(numero));
                    System.out.println("");
                    
                    break;
                    
                case 2:
                    
                    System.out.println("----- Busqueda Binaria -----");
                    System.out.println("Ingrese el tamanio del arreglo: ");
                    int tamaño = input.nextInt();
                    int[] arreglo = busqueda.crearArreglo(tamaño);
                    
                    System.out.println("Arreglo de Busqueda Desordenado:");
                    busqueda.imprimirArreglo(arreglo);                   
                    busqueda.ordenarArreglo(arreglo);
                    System.out.println("");
                    System.out.println("Arreglo de Busqueda Ordenado:");
                    busqueda.imprimirArreglo(arreglo);
                    System.out.println("");
                    System.out.println("Ingrese numero a buscar: ");
                    numero = input.nextInt();
                    
                    int index = busqueda.busquedaBinaria(arreglo, numero);
                    if (index == -1){
                        System.out.println("No se encontro el elemento " + numero + " en el arreglo.");
                    } else {
                        System.out.println("El elemento " + numero + " se encontro en la posicion:4"
                                + " " + index);                      
                    }
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Hola mundo");
                    
                    break;
                    
                case 4:
                    
                    System.out.println("Saliendo...");
                    
                    break;
                    
            }
            
                       
        } while ( opcion != 4);
        
             
    }
    
}
