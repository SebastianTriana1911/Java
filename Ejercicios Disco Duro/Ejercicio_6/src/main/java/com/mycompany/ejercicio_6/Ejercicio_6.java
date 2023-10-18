/*

Lee un nÃºmero por teclado e indica si es divisible entre 2 (resto = 0). Si no
lo es, tambiÃ©n debemos indicarlo.

 */

package com.mycompany.ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        // Declaracion de variables
        int numero = 0;
        
        // Se importa la funcion Scanner para la entrada de datos
        Scanner divisible = new Scanner (System.in);
        System.out.print("Ingrese un numero para determinar si es divisible: ");
        
        // A la variable numero se le pasa la informacion que contiene el Scanner
        // mas el metodo nextInt para que lo lea en formato entero
        numero = divisible.nextInt();
        
        // Se valida si el numero que se ingreso modulo de dos es igual a 0, si
        // esto es True el numero que se ingreso es divisible de lo contrario no
        if (numero % 2 == 0){
            System.out.println("El numero "+numero+ " es divisible de 2");
        } else {
            System.out.println("El numero "+numero+ " no es divisible entre 2");
        }
    }
}