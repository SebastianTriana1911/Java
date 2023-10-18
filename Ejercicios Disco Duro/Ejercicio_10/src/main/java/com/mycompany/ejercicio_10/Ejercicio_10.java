/*

Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

*/

package com.mycompany.ejercicio_10;

public class Ejercicio_10 {

    public static void main(String[] args) {
        // Declaracion de variables, contador funcionara como la variable que
        // por cada vuelta que haga el bucle aumente su valor en 1
        int contador = 0;
        
        // Al bucle while resivira como parametros una condicion que sea 
        // verdadera, y hasta que dicha condicion sea falsa se detendra, el 
        // bucle terminara cuando la variable contador sea mayor a 100 de lo
        // contrario siempre se ejecutara
        while (contador < 100){
            
            // Por cada vuelta que de el bucle la variable aumentara su valor 
            // en 1
            contador = contador + 1;
            
            // Se imprimira lo que vale contador en el momento en el que vaya
            // el bucle
            System.out.println("Numero -> "+contador);
        }
    }
}
