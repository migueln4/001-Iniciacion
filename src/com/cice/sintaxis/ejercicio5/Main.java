package com.cice.sintaxis.ejercicio5;

/*

Hacer un programa que, dado un array de números enteros, calcule la suma de todos los números contenidos en el mismo y la muestre por pantalla.
*
* */

public class Main {

    public static void main(String[] args) {

        int[] arrayEnteros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int suma = 0;
        for (int a : arrayEnteros) {
            suma += a;
        }
        System.out.println("La suma del array es = " + suma);

    }
}
