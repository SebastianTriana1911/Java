/*

Declara dos variables numÃ©ricas (con el valor que desees), muestra por consola 
la suma, resta, multiplicaciÃ³n, divisiÃ³n y mÃ³dulo (resto de la divisiÃ³n).

*/

package com.mycompany.ejercicio_1;

public class Ejercicio_1 {

    public static void main(String[] args) {
        // Declaracion de variables
        int numero1 = 14;
        int numero2 = 3;
        int resultado = 0;
        
        // Suma
        resultado = numero1 + numero2;
        System.out.println("La suma es: "+resultado);
        
        // Resta
        resultado = numero1 - numero2;
        System.out.println("La resta es: "+resultado);
        
        // Multiplicacion
        resultado = numero1 * numero2;
        System.out.println("La multiplicacion es: "+resultado);
        
        // Division
        resultado = numero1 / numero2;
        System.out.println("La division es: "+resultado);
    }
}
