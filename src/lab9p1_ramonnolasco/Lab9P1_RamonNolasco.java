/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_ramonnolasco;

import java.util.Scanner;

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
                    
                    break;
                    
                case 2:
                    
                    
                    
                    break;
                    
                case 3:
                    
                    
                    
                    
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;
                    
            }
            
                       
        } while ( opcion != 4);
        
        
        
        
        
    }
    
}
