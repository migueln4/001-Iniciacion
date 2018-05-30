package com.cice.sintaxis;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Sacos {

    static int[] numeros; //Declaración del array
    static int[] numeros2 = new int [4];//Declaración e instanciación del array
    static int[] numeros3 = {0,1,2,3};//Declaración, instanciación y se le dan valores al array

    public static void main(String[] args) {
        System.out.println(numeros3[0]);

        numeros3[0] = 100;

        System.out.println(numeros3[0]);

        int size = numeros3.length; //length no es un método, es un atributo estático de la clase Array

        System.out.println(size);

        System.out.println(numeros2[0]);

        //-------ARRAYS MULTIDIMENSIONALES-------------

        System.out.println("------ARRAY MULTIDIMENSIONALES--------");

        int[][] arrayBidimensional = new int[2][4];
        int[] arrayB2[] = new int[2][4];
        int arrayB3[][] = {{2,4,6,8},{1,3,5,7},{0,1,2,3},{9,8,7,6}}; //Al contrario que las otras dos, esta de de 4x4. Las otras dos son de 2x4.
        //La posición [3][2] es 7
        //La posición [1][0] es 1
        System.out.println(arrayB3[3][2]);
        System.out.println(arrayB3[1][0]);

        int[][][] arrayTridimensional = {{{1,2},{2,4}},{{5,4},{8,4}}}; //Los arrays tridimensionales contienen arrays
        // bidiemensionales.
        //La posición [0][1][1] es 4
        //La posición [1][0][1] es 4 también
        System.out.println(arrayTridimensional[0][1][1]);
        System.out.println(arrayTridimensional[1][0][1]);
        int[][][] arrayT2 = new int[2][2][2]; //Tiene el mismo tamaño que el array tridimensional anterior.

    }

}
