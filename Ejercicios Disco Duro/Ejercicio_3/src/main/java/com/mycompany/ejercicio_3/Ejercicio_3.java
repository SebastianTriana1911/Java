/*

Declara un String que contenga tu nombre, despuÃ©s muestra un mensaje de 
bienvenida por consola. Por ejemplo: si introduzco Â«FernandoÂ», me aparezca
Â«Bienvenido FernandoÂ».

 */


package com.mycompany.ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        // Declaracion de variable
        String nombre = "";
        
        // Se importa la funcion Scanner y se llama para poder resivir 
        // informacion por consola
        Scanner nombres = new Scanner (System.in);
        System.out.print("Ingrese su nombre: ");
        
        // A la variable que se declaro se le pasa la el nombre que se le asigno
        // a la funcion Scanner con el .next() para que permita leer el string 
        // que se le ingreso.
        nombre = nombres.next();
        System.out.println("Bienvenido "+nombre);
    }
}