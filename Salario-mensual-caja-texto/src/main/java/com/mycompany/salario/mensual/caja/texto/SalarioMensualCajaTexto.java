/*
(variable)= JOptionPane.showinputDialog(): Crea una cajita de texto la cual 
permite la entrada de datos, todo dato que se ingrese se convertira en un tipo
de dato string, para que dicha funcion funcione hay que asignarsela a una 
variable

JOptionPane.showMenssageDialog(): Se creara una cajita de texto la cual solo
mostrara un mensaje

Integer.parseInt(JOptionPane.showinputDialog()): Esta funcion permitira cambiar
el tipo de dato que devuelve la funcion JOption que son cadenas de texto (string)

*/


package com.mycompany.salario.mensual.caja.texto;

import javax.swing.JOptionPane;

public class SalarioMensualCajaTexto {

    public static void main(String[] args) {
        // Declaracion de variables
        int salario_dia = 0;
        
        // A una variable de tipo de dato String se le asigna la funcion JOption
        // Pane seguido de showInputDialog que hace referencia a que el cuadro
        // de texto que se mostrara por pantalla permina la entrada de datos.
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
  
        // Al mismo metodo JOptionPane ahora se le asigna el metodo showMenssage
        // Dialog que hace referencia a que unicamente mostrara un mensaje en la
        // caja de texto que se abrira al ejecutar el codigo
        JOptionPane.showMessageDialog(null,"Bienvenido "+nombre);
        
        // Como todos los datos que entran por la funcion JOption se convierten
        // en string hay que persear dicho string. A la hora de querer convertir
        // un tipo de dato string en un tipo de dato entero se tendra que hacer
        // con la funcion Integer.parseInt. En este caso a una variable de tipo
        // entero se le esta perseando el string que vaya a resivir como entrada
        // en la funcion JOption
        int dias_trabajados = Integer.parseInt(JOptionPane.showInputDialog
        (nombre +" ingrese el numero de dias que trabaja: "));
        
        // Se realiza el mismo procedimiento anterior perseando a entero el tipo
        // de dato string que se resive por la funcion JOption
        int salario_meses = Integer.parseInt(JOptionPane.showInputDialog
        (nombre+" ingrese el salario que gana en un mes de trabajo: "));
       
        // A una variable se le asigna el resultado de una division entre las 
        // anteriores entradas de texto por la funcion JOption
        salario_dia = salario_meses / dias_trabajados;
        
        // Se imprime un mensaje de caja de texto mostrando el resultado de la
        // operacion anterior
        JOptionPane.showMessageDialog(null,
                "El dia de trabajo le sale por "+salario_dia+" mil pesos");
    }
}
