package com.cice.sintaxis.ejercicio2;

import java.util.Scanner;

/*
    Realizar un programa que, dado un determinado número entero almacenado en una variable nos muestre un mensaje en
    la consola indicando si el número es par o impar.

    Hay que hacerlo en el método main.
 */

public class Main {
    public static void main(String[] args) {

        int n = 3;
        int entradaTeclado;

        //Lo que hay que hacer para leer desde consola lo que se introduce con el teclado. OJO, no olvidar el IMPORT
        // de arriba.

        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Por favor, introduce un número:  ");
        entradaTeclado = leerConsola.nextInt();

        if (entradaTeclado % 2 == 0) {
            System.out.println("El número " + entradaTeclado + " es par.");
        } else {
            System.out.println("El número " + entradaTeclado + " es impar.");
        }
    }
}