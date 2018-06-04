package com.cice.sintaxis;

public class InstruccionesIteracion {

    public static void main(String[] args) {

    /*BUCLE FOR
    for (inicialización ; condición ; incremento)
    */

        for (int i = 0; i < 10; i++) {
            System.out.println("Esta es la vuelta " + (i + 1) + " porque i tiene un valor de " + i);
        }

/*

Esto es un bucle infinito, pero compila.

for (;;) {
        }

        */

        int i = 3;
        for (; i > 0; ) {
            System.out.println("Hola, chato.");
            i--;
        }
    }
}
