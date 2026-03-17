package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // Declaração de variáveis

       String nome;
       int idade;

        // Instancia a classe Scanner

       Scanner sc = new Scanner(System.in);

       // Input

       System.out.println("Informe o seu nome: ");
       nome = sc.nextLine();
       System.out.println("Informe a sua idade: ");
       idade = sc.nextInt();

       // Verifica a idade

       if (idade >= 18) {
        System.out.println(nome + " é maior de idade.");
       }
       else {
        System.out.println(nome + " é menor de idade.");
       }

       // Fechar objeto

       sc.close();
    }
}
