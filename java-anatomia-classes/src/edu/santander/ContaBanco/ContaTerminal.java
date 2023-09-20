package edu.santander.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    
    public static void main (String [] args){

        double saldo = 23124.42;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu número de usuário: ");
        int num = scanner.nextInt();

        System.out.println("Bem vindo, "+ nome +". \n Agência: "+ agencia +"\n Usuário: "+ num +"\n Saldo disponível: "+ saldo);

    }
    
}
