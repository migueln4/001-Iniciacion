package com.cice.sintaxis;

public class InstruccionesControl {
    public static void main(String[] args) {

        //Estructura de control IF/ELSE

        boolean condicion = true;

        if(condicion) {
            //si se cumple la condición, se ejecuta este bloque de código
            System.out.println("Condición cumplida.");
        } else {
            //Si no se cumple, ejecutamos este otro bloque de código
            System.out.println("No se ha cumplido la función.");
        }

        //IF/ELSE anidados

        if(condicion) {
            //si se cumple la condición, se ejecuta este bloque de código
            System.out.println("Condición cumplida.");

            if(condicion) {
                System.out.println("Cumplida por dos.");
            } else {
                System.out.println("El segundo else");
            }

        } else {
            //Si no se cumple, ejecutamos este otro bloque de código
            System.out.println("No se ha cumplido la función.");
        }

        //El ELSE IF también se puede usar

        if(condicion) {
            //si se cumple la condición, se ejecuta este bloque de código
            System.out.println("Condición cumplida.");
        } else if (!condicion) {
            System.out.println("La condición deja de cumplirse.");
        } else {
            //Si no se cumple, ejecutamos este otro bloque de código
            System.out.println("No se ha cumplido la función.");
        }

    }
}
