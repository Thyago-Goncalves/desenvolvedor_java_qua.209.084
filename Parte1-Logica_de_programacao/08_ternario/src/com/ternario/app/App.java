package com.ternario.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

         // Declaração de variáveis

        String nome;
        String result;
        int idade;
         
         // Instancia a classe scanner

         Scanner sc = new Scanner(System.in);

         // Entrada de dados

        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe a sua idade");
        idade = sc.nextInt();

        // Verificar a idade do usuário

        result = (idade >= 18) ? " é maior de idade." : " é menor de idade.";
        
        // Saida de dados

        System.out.println(nome + result);

        // Fechar o objeto Scanner

        sc.close();
    }
}
