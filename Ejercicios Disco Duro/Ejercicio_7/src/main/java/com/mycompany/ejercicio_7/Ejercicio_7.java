/*

Lee un nÃºmero por teclado y muestra por consola, el carÃ¡cter al que pertenece
en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.

 */

package com.mycompany.ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        // Declaracion de variables
        int numero = 0;
        
        // Se importa la funcion Scanner para resivir datos por consola
        Scanner num_ascci = new Scanner (System.in);
        System.out.print("Ingrese un numero superior al 65: ");
        // A una variable se le asigna el Scanner seguido del metodo nextInt()
        // para leer lo que retorna el Scanner a un entero
        numero = num_ascci.nextInt();
        
        // Se valida si lo que hay en la variable es un numero entero mayor a 65
        if (numero > 65){
            
            // A unva variable de tipo char se le asigna el numero pero 
            // convertida a un tipo de dato char
            char letra = (char)numero;
            
            // Se imprime por pantalla la letra que le corresponde segun el 
            // numero que se inserto en el Scanner
            System.out.println("La letra es: "+letra);
        }else {
            System.out.println("No se encuentra letra con ese numero");
        }
    }
}
