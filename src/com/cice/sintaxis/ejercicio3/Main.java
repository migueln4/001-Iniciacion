package com.cice.sintaxis.ejercicio3;

import java.util.Scanner;

/*

Realizar un programa que, a partir de un número almacenado en una determinada variable entera (que representa la hora
        del día y está comprendido entre 1 y 24), nos dé los buenos días, las buenas tardes o las buenas noches.

El programa debe comprobar que, efectivamente, el número está en ese rango y, en caso de que no sea así, dé un error.

*/

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un número:   ");
        int hora = leer.nextInt();

        switch (hora) {
            case 0:
                System.out.println("¡Buenas noches!");
                break;
            case 1:
                System.out.println("¡Buenas noches!");
                break;
            case 2:
                System.out.println("¡Buenas noches!");
                break;
            case 3:
                System.out.println("¡Buenas noches!");
                break;
            case 4:
                System.out.println("¡Buenas noches!");
                break;
            case 5:
                System.out.println("¡Buenas noches!");
                break;
            case 6:
                System.out.println("¡Buenos días!");
                break;
            case 7:
                System.out.println("¡Buenos días!");
                break;
            case 8:
                System.out.println("¡Buenos días!");
                break;
            case 9:
                System.out.println("¡Buenos días!");
                break;
            case 10:
                System.out.println("¡Buenos días!");
                break;
            case 11:
                System.out.println("¡Buenos días!");
                break;
            case 12:
                System.out.println("¡Buenos días!");
                break;
            case 13:
                System.out.println("¡Buenos días!");
                break;
            case 14:
                System.out.println("¡Buenas tardes!");
                break;
            case 15:
                System.out.println("¡Buenas tardes!");
                break;
            case 16:
                System.out.println("¡Buenas tardes!");
                break;
            case 17:
                System.out.println("¡Buenas tardes!");
                break;
            case 18:
                System.out.println("¡Buenas tardes!");
                break;
            case 19:
                System.out.println("¡Buenas tardes!");
                break;
            case 20:
                System.out.println("¡Buenas tardes!");
                break;
            case 21:
                System.out.println("¡Buenas noches!");
                break;
            case 22:
                System.out.println("¡Buenas noches!");
                break;
            case 23:
                System.out.println("¡Buenas noches!");
                break;
            default:
                System.out.println("ERROR. El dato introducido no es válido. Debe estar entre 0 y 23.");
                break;
        }

        /*-------ESTA FORMA ES MUCHO MÁS EFICIENTE--------*/

        switch (hora) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 21:
            case 22:
            case 23:
                System.out.println("¡Buenas noches!");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                System.out.println("¡Buenos días!");
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("¡Buenas tardes!");
            default:
                System.out.println("ERROR. El dato introducido no es válido. Debe estar entre 0 y 23.");
                break;
        } //Aquí, lo que se ha hecho es 'falsear' una expresión regular. Como no encuentra el BREAK, continúa
        // ejecutándose hasta que lo ve. Por eso, se 'agrupan' las posibilidades.

        if ((hora >= 0 && hora <= 5) || (hora >= 21 && hora <= 23)) {
            System.out.println("¡Buenas noches!");
        } else if (hora >= 6 && hora <= 13) {
            System.out.println("¡Buenos días!");
        } else if (hora >= 14 && hora <= 20) {
            System.out.println("¡Buenas tardes!");
        } else {
            System.out.println("ERROR. El dato introducido no es válido. Debe estar entre 0 y 23.");
        }
    }
}
