package com.cice.concatenaciones;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        //Tres ejemplos del cuaderno
        System.out.println("El resultado es "+a*2+6/7); //Lo que hace es multiplicar 7 por 2 y concatenarlo a la división
        System.out.println("El resultado es "+a*(2+6)/7);//Lo que hace es la suma, la multiplicación y la división
        System.out.println("El resultado es "+(a*2+6/5));//Lo que hace es la operación completa y la suma de la multiplicación por la división
    }
}