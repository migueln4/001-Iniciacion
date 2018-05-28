package com.cice.sintaxis;

/**
 * A partir de aquí se van a ver los operadores de relación, los lógicos, etcétera. Es el punto 2 del tema 1 de
 * los apuntes de clase.
 * */

public class Operadores {

    //OPERADORES DE RELACIÓN

    // >    <   <=  >=  !=  ==

    //La finalidad de los operadores de relación es conseguir una respuesta TRUE o FALSE

    //OPERADORES LÓGICOS

    //&&    &   ||  |   !   ^

    //OPERADORES UNARIOS

    //~ -

    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 2;
    static boolean r4 = 1 <= 2;
    static boolean r5 = 1 != 2;
    static boolean r6 = 1 == 2;
    static boolean r7 = 1 >= 1;

    public static void main(String[] args) {

        System.out.println("------------------PRUEBAS CON OPERADORES DE RELACIÓN-------------------");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("------------------PRUEBAS CON OPERADORES LÓGICOS-------------------");

        System.out.println(r1 && r2); //TRUE-TRUE = TRUE; TRUE-FALSE = FALSE; FALSE-TRUE = FALSE; FALSE-FALSE = FALSE
        // --> en cuanto uno de ellos es falso, devuelve falso.
        System.out.println(r2 || r3); //TRUE-TRUE = TRUE; TRUE-FALSE = TRUE; FALSE-TRUE = TRUE; FALSE-FALSE = FALSE
        // --> en cuanto uno de ellos es verdadero, devuelve verdadero.
        System.out.println(!r4); //!TRUE = FALSE; !FALSE = TRUE --> Invierte el resultado.
        System.out.println(r5^r6); // TRUE-TRUE = FALSE; TRUE-FALSE = TRUE; FALSE-TRUE = TRUE; FALSE-FALSE=FALSE -->
        // Tienen que ser distintos los dos para que devuelva verdadero. Si son iguales, devuelve falso.

        System.out.println(r1 | r2); //Está obligando a validar los dos términos.
        System.out.println(r2 & r3); //Está obligando a validar los dos términos. En ambos casos, si ya valida uno y
        // ve que sí (o no) se cumple la condición, ya no continúa y ofrece el resultado.
        System.out.println(r5 ^ r7);
        System.out.println(r5 ^ r4);

        System.out.println("------------------PRUEBAS CON OPERADORES UNARIOS-------------------");
        int n1 = 4;
        int n2 = -7;
        System.out.println(~n1);
        System.out.println(-n1);
        System.out.println(~n2);
        System.out.println(-n2);

        System.out.println("------------------PRUEBAS CON OPERADORES DE ASIGNACIÓN-------------------");

        int n3 = 14;
        n3++; //abreviación de n3 = n3 + 1
        System.out.println(n3);
        n3--; //abreviación de n3 = n3 - 1
        System.out.println(n3);
        n3*=2; //abreviación de n3 = n3*2
        System.out.println(n3);
        n3%=4;
        System.out.println(n3);
        n3+=5;
        System.out.println(n3);

        System.out.println(n3++);
        System.out.println(++n3);

    }
}
