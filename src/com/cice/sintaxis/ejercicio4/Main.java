package com.cice.sintaxis.ejercicio4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int entradaTeclado;
        long resultado=1;
        Scanner leerConsola = new Scanner(System.in);
        System.out.println("Por favor, introduce un número:  ");
        entradaTeclado = leerConsola.nextInt();

        for (int i=entradaTeclado; i>0; i--) {
            resultado *= i;
        }

        System.out.println(entradaTeclado+"! = "+resultado);

    }

}
