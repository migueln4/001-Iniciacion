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

        //SWITCH

        String palabra = "Ojete";

        switch(palabra) {
            case "Patata":
                System.out.println("Has dicho \"Patata\"");
                break;
            case "Ojete":
                System.out.println("Has dicho \"Ojete\"");
                break;
            case "Melocotón":
                System.out.println("Has dicho \"Melocotón\"");
                break;
            case "Plastidécor":
                System.out.println("Has dicho \"Plastidécor\"");
                break;
            case "Pelete":
                System.out.println("Has dicho \"Pelete\"");
                break;
            default:
                System.out.println("Mira, yo ya no sé.");
        }

    }
}
