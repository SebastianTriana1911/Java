/*

Declara 2 variables numÃ©ricas (con el valor que desees), he indica cual es mayor
de los dos. Si son iguales indicarlo tambiÃ©n. Ves cambiando los valores para 
comprobar que funciona.

*/

package com.mycompany.ejercicio_2;

public class Ejercicio_2 {

    public static void main(String[] args) {
        // Declaracion de variables
        int numero1 = 10;
        int numero2 = 10;
        
        // Se hacen las condicionales if else if y else para validar que variable
        // de las dos que se declaro es mayor menor o igual
        if (numero1 > numero2){
            System.out.println("El numero "+numero1+" Es mayor a numero "+numero2);
        }else if (numero1 < numero2){
            System.out.println("El numero "+numero1+" Es mayor a numero "+numero2);
        }else {
            System.out.println("Los dos numeros son iguales");
        }
    }
    
}
