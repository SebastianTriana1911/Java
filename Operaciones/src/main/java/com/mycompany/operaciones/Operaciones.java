package com.mycompany.operaciones;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        /* 
        System.out.print -> nos ayudara a mostrar una imprecion por pantalla
        System.out.println -> nos ayudara a mostrar una imprecion por pantalla 
        pero con un salto de linea
        */
        
        // Programa de suma
        
        // Declaracion de variables
        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;
        int resta = 0;
        int mult = 0;
        int div = 0;
        
        // Se importa la funcion scanner para recibir datos por teclado
        Scanner teclado = new Scanner (System.in);
        System.out.print("Ingrese el primer numero: ");
        /* 
        La variable numero1 sera igual a lo que se reciba por taclado 
        convertido en un enterO por eso el nexInt, si se deseara recibir algo
        de tipo texto seria unicamente nex.
        El metodo nex nos permitira convertir lo que se reciba por teclado
        en un tipo de dato en especial
        */
        numero1 = teclado.nextInt();

        // Segundo numero
        System.out.print("Ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
        
        // Suma
        suma = numero1 + numero2;
        System.out.println("La suma es de: "+suma);
        
        // Resta
        resta = numero1 - numero2;
        System.out.println("La resta es: "+resta);
        
        // Multiplicacion
        mult = numero1 * numero2;
        System.out.println("La multiplicacion es de: "+mult);
        
        // Division
        div = numero1 / numero2;
        System.out.println("La division es de: "+div);
    
    }
}