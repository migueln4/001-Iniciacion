package com.cice;

public class Main {

    public static String nombre = "Miguel"; //así se hace para que todos los métodos estáticos tengan acceso a esta variable del tipo String. Es una variable local de la clase y es accesible desde todos los métodos de la clase. Incluso aunque fuera "private" en lugar de "public".

    /**
     * Esto es un comentario que sirve para la documentación del programa.
     * A javaDoc le gusta este comentario.
     * @param args <- Esto sirve para explicar qué se espera que se reciba en la matriz args
     */

    public static void main (String[] args) {
	// write your code here
        System.out.println("Hola mundo"); //Esto es del documento 000

        int numero = 1;
        byte numerillo = 10; //byte solo se puede poner valores entre -128 y 127
        numero = 4000;

        final int NUMERO_NO_MUTABLE = 200; //esto es una constante, por eso va con final y con mayúsculas.

        double a = 8;

        System.out.println("Cuadrado de un número con decimales -> "+elevarAlCuadradoDouble(a));
        System.out.println("Cuadrado de un número entero -> "+elevarAlCuadradoInt(numero));
    }

    public static String saludar () {
        int dato = (1 == 2) ? 1 : 2; //este es un ejemplo de comparador ternario

        int numero = 7; //se puede crear aquí esta variable porque el otro "numero" está creado en otro método que no es este.

        return "Muy buenas";
    }

    public static double elevarAlCuadradoDouble (double a) {
        return a*a;
    }

    public static int elevarAlCuadradoInt (int n) {
        return n*n;
    }
}
