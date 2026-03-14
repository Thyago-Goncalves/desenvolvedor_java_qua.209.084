package com.input.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de Variáveis

        String nome;
        String email;
        int idade;
        double altura;
        
        // Criar Objeto que recebe os dados do usuário

        Scanner sc = new Scanner(System.in);

        // Entrada de dados

        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();
        System.out.println("informe a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Informe a sua altura: ");
        altura = sc.nextDouble();

        // Limpeza de buffer

        sc.nextLine();

        System.out.println("Informe o seu e-mail: ");
        email = sc.nextLine();

        // Saida de dados

        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Altura " + altura + " metros");
        System.out.println("E-mail: " + email);

        // Fecha objeto

        sc.close();
    }
}
