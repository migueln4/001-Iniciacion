package com.cice.sintaxis;

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
    }

}
