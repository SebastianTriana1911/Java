/*

 Modifica la aplicaciÃ³n anterior, para que nos pida el nombre que queremos 
introducir (recuerda usar JOptionPane).

 */

package com.mycompany.ejercicio_4;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static void main(String[] args) {
        // Declaracion de variable
        String nombre = "Sebas";
        
        // A la variable que se declaro se le pasa la funcion JOption para 
        // renombrar el dato que contiene la variable por medio de una cajita
        // de texto
        nombre = JOptionPane.showInputDialog("Ingrese su nuevo nombre: ");
        
        // Por medio de una cajita de texto mostraremos un mensaje el cual va a
        // ser el nuevo dato que contiene la variable declarada. Gracias al 
        // metodo showMenssageDialog que se le asigna a la funcion JOptionPage
        JOptionPane.showMessageDialog(null,"Bienvenido "+nombre);
    }
}
