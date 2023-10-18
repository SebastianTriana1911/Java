/*

Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. 
Utiliza el bucle que desees.

*/

package com.mycompany.ejercicio_12;

public class Ejercicio_12 {

    public static void main(String[] args) {
     
        // Bucle for que itera una variable que va aumentado su valor una
        // unidad hasta que esta sea menor o igual a 100
        for (int contador = 1; contador <= 100; contador = contador + 1){

            // Se crea las condicionales if, else if y else para validar cuando
            // la variable iterada sea divisible de 2 para que lo imprima por 
            // consola, sea divisible de 3 para que lo imprima por consola y que
            // cuando ninguna de estas dos condiciones se cumpla muestre dicho
            // numero pero sin ningun mensaje
            if (contador % 2 == 0 ){
                System.out.println(contador+" es divisible de 2");
            }else if (contador % 3 == 0){
                System.out.println(contador+" es divisible de 3");
            }else {
                System.out.println(contador);
            }
        }
    }
}
