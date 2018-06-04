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

        //FOREACH
        //SINTAXIS: for(tipodato nombre_variableauxiliar:nombreconjunto)

        int[] arrayNumeros = {1,2,3,4,5,6,7,8,9};

        for(int a:arrayNumeros) {
            //aquí dentro, la variable a va a ser del tipo entero y va a tener un valor.
            System.out.println(a);
        }


        //WHILE
        //while(condición) { sentencias }

        //DO-WHILE
        //do { sentencias} while(condición); <- Este se ejecuta siempre, al menos, una vez. Lo que aparece al final es la condición de que se repita.

        int[] arrayNumeros2 = {1,2,3,5,8,13};
        int indice=0;
        while (arrayNumeros2[indice]<10) {
            System.out.println(arrayNumeros2[indice]);
            indice++;
        }

    }
}
