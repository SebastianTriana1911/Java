package com.mycompany.salario.mensual;

import java.util.Scanner;

public class SalarioMensual {

    public static void main(String[] args) {
        // Declaracion de varibles
        String nombre = "";
        int dias_trabajados = 0;
        int salario_meses = 0;
        int salario_dia = 0;
        
        // Se importa la clase escaner para poner resivir informacion por panta
        Scanner nombre_persona = new Scanner (System.in);
        System.out.print("Ingrese su nombre: ");
        // La variable nombre sera igual al Scanner que contiene la informacion
        // que se ingreso por pantalla con el metodo next para leer cadenas de
        // texto
        nombre = nombre_persona.next();
        // Se imprime bienvenido seguido de la informacion que contiene la 
        // variable nombre
        System.out.println("Bienvenido "+nombre);
        
        // Se hace el mismo proceso pero ahora para recibir otro dato.
        // Se crea otro escaner y una variable sera igual a ese escaner con el
        // metodo nextInt para convertir lo que se paso por pantalla a un entero
        Scanner d_trabajo = new Scanner (System.in);
        System.out.print("Ingrese el numero de dias que trabaja al mes: ");
        dias_trabajados = d_trabajo.nextInt();
        
        // Se realiza el mismo proceso que el anterior
        Scanner s_mensual = new Scanner (System.in);
        System.out.print("Ingrese el sueldo que gana al mes: ");
        salario_meses = s_mensual.nextInt();
        
        // Se hace la operacion necesaria para hayar a cuanto le pagan el dia a
        // un trabajador dependiendo de la cantidad de dias que trabaja y el 
        // sueldo que gana al mes
        salario_dia = salario_meses / dias_trabajados;
        // Se imprime el mensaje concatenandolo con la variable que contiene el
        // sueldo que se paga en un dia
        System.out.println(nombre+" el dia de trabajo se lo pagan a "
        +salario_dia+" mil pesos");
    }
}