/*

Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un 
carácter (char) y muestre su código en la tabla ASCII.

*/

package com.mycompany.ejercicio_8;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner s_caracter = new Scanner(System.in);
        System.out.print ("Introdusca un caracter de la tabla ASCII: ");
        char caracter = s_caracter.next().charAt(0);
 
        //Pasamos el caracter a codigo
        int codigo = (int) caracter;
 
        System.out.println(codigo);
    }
}
