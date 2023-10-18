/*

Haz el mismo ejercicio anterior con un bucle for.

*/

package com.mycompany.ejercicio_11;

public class Ejercicio_11 {

    public static void main(String[] args) {
        
        // Bucle for: El primer parametro que resive el bucle for es la declaracion
        // de la variable que va ser afectada, el segundo parametro sera la 
        // condicion que debera cumplir para que dicho bucle continue y como
        // tercer parametro sera el como se comportara la variable que pasamos
        // como primer parametro despues de cada vuelta
        for (int contador = 1; contador <= 100; contador = contador +1){
            System.out.println(contador);
        }
    }
}
