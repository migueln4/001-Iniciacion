package com.cice.sintaxis.ejercicio6;

/*

Realizar un programa que, dado un determinado array de númerosr enteros, realice el recorrido de este y meustre cada uno de los números hasta que se encuentre un número negativo, momento en el cual se finaliza el recorrido del array y se indica la cantidad de números recuperados.
*
* */

public class Main {

    public static void main(String[] args) {

        int[] arrayEnteros = {0, 1, 2, 3, 4, -5, 6, 7, 8, 9};
        int i = 0;
        while(i<arrayEnteros.length && arrayEnteros[i] >= 0) {
            i++;
        }
        System.out.println("Se han ejecutado "+i+" iteraciones.");

        otraForma(arrayEnteros);

        conForEach(arrayEnteros);

    }

    public static void otraForma (int[] arrayEnteros) {
        int j = 0;
        for(; j<arrayEnteros.length && arrayEnteros[j] >= 0; j++);
        System.out.println("Se han ejecutado "+j+" iteraciones.");
    }

    public static void conForEach (int[] arrayEnteros) {
        int contador=0;
        for(int a:arrayEnteros) {
            contador++;
            if (a<0) {
                break;
            }
        }
        System.out.println(contador-1);
    }
}