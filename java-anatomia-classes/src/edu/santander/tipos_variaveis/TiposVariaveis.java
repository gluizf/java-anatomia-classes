package edu.santander.tipos_variaveis;
public class TiposVariaveis{

    public static void main (String [] args)throws Exception{
        
        //variaveis
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //casting

        int numero = 5;

        numero = 10;

        //constantes = não podem ser alteradas
        final double VALOR_DE_PI = 3.14;

        System.out.println(numero);

    }

}