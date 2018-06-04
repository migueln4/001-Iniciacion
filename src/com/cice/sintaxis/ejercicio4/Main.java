package com.cice.sintaxis.ejercicio4;

/*
    Realizar un programa que calcule el factorial de un número existente en una determinada variable entera.

    */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int entradaTeclado = leer();
        long resultado = 1;
        if (entradaTeclado < 0) {
            System.out.println("No existe el factorial de un número negativo.");
        } else {
            for (int i = entradaTeclado; i > 0; i--) {
                resultado *= i;
                if (resultado <= 0) {
                    break;
                }
            }
            if (resultado > 0) {
                System.out.println(entradaTeclado + "! = " + resultado);
            } else {
                System.out.println("El cálculo se ha salido de rango.");
            }
        }

    }

    public static int leer() {
        Scanner leerConsola = new Scanner(System.in);
        System.out.print("Por favor, introduce un número:  ");
        return leerConsola.nextInt();
    }
}
