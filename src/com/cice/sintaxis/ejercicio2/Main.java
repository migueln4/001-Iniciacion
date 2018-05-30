package com.cice.sintaxis.ejercicio2;

/*
    Realizar un programa que, dado un determinado número entero almacenado en una variable nos muestre un mensaje en
    la consola indicando si el número es par o impar.

    Hay que hacerlo en el método main.
 */

public class Main {
    public static void main(String[] args) {
        int n = 0;

        if (n%2 == 0) {
            System.out.println("El número "+n+" es par.");
        } else {
            System.out.println("El número "+n+" es impar.");
        }
    }
}
