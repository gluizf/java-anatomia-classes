package edu.santander.anatomia;
public class MinhaClass{

    public static void main(String [] args){

        String primeiroNome = "Gabriel Luiz";
        String segundoNome = "Ferraz";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){ //metodo
            return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}