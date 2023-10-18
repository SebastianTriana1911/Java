/*

Haz una aplicaciÃ³n que calcule el Ã¡rea de un cÃ­rculo(pi*R2). El radio se pedirÃ¡
por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la
constante PI y el mÃ©todo pow de Math.

*/

package com.mycompany.ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        // Declaracion de variables
        double pi = 3.1416;
        double radio = 0;
        double area = 0;
        
        // Se importa la funcion Scanner para poder resivir informacion por tec
        Scanner radio_circulo = new Scanner (System.in);
        System.out.print("Ingrese el radio del circulo: ");
        
        // La variable radio se le asigna la informacion que contiene el Scanner
        // y se le pasa el metodo nextDouble() para que el string que le retorna
        // el Scaner lo convierta en decimal
        radio = radio_circulo.nextDouble();
        
        // El valor que contiene la variable radio se le asigna la funcion Math
        // con le metodo pow para elevar la misma variable al cuadrado
        radio = Math.pow(radio,2); 
        
        // Se realiza la operacion para hallar el area de un circulo
        area = pi * radio;
        
        // Se imprime el resultado por consola
        System.out.println("El area del cuadrado es: "+area);
        
    }
}