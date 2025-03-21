/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_ramonnolasco;

/**
 *
 * @author ramon
 */
public class ConversionesDecimales {
    
    public static String aBinario ( int numero ) {
        if ( numero == 0 ) return "0";
        if ( numero == 1 ) return "1";
        return aBinario ( numero / 2 ) + ( numero % 2 );
    }    
    
    public static String aOctal ( int numero ) {
        if (numero < 8) return String.valueOf(numero);
        return aOctal(numero / 8) + (numero % 8);
    }

    public static String aHexadecimal ( int numero ) {
        if (numero < 16) return hexDigito(numero);
        return aHexadecimal(numero / 16) + hexDigito(numero % 16);
    }

    private static String hexDigito ( int numero ) {
        return (numero < 10) ? String.valueOf(numero) : String.valueOf((char) ('A' + (numero - 10)) );
    }
  
}
