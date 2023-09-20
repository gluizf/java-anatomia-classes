package edu.santander.tipos_variaveis;

public class Operadores{
    public static void main (String [] args) {

        String nomeCompleto = "Gabriel"+" "+"Ferraz";

        System.out.println(nomeCompleto);

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //x repetição
        //numero++;
        //numero--;

        System.out.println(++numero);

        System.out.println(--numero);

        boolean variavel = true;

        //negando boolean no operação

        System.out.println(!variavel);

        System.out.println(variavel);

        //operador tenario

        int a = 5;
        int b = 5;

        String resultado = a==b?"O resultado é verdadeiro" : "O resultado é falso";

        System.out.println(resultado);

        // e = &&, ou ||
    }
}