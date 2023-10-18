/*

 Lee un número por teclado que pida el precio de un producto (puede tener 
decimales) y calcule el precio final con IVA. El IVA sera una constante que 
sera del 21%.

*/

package com.mycompany.ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        // Declaracion de variables
        double iva = 1.21;
        
        // Se importa la funcion Scanner para resivir datos por pantalla
        Scanner s_producto = new Scanner (System.in);
        System.out.print("Esciba el precio del producto: ");
        
        // A una variable se le asigna el valor que contenga el Scanner con el
        // nextDouble para que lea el string que retorna el Scaner en un numero
        // decimal
        double producto = s_producto.nextDouble();
        
        // Divicion del producto por el iva para hayar el 21%
        double precio = producto / iva;
        System.out.println("Su producto con el 21% del iva queda en: "+precio);
    }
}
