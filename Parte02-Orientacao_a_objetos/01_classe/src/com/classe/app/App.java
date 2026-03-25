package com.classe.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instacia as classes

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        // Entrada de dados

        System.out.println("Informe o nome da pessoa: ");
        pessoa.nome = sc.nextLine();
        System.out.println("Informe o e-mail: ");
        pessoa.email = sc.nextLine();
        System.out.println("Informe a idade: ");
        pessoa.idade = sc.nextInt();
        System.out.println("Informe a altura em metros: ");
        pessoa.altura = sc.nextDouble();
        // Saida de dados

        System.out.println("Atributos do objeto:");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("E-mail: " + pessoa.email);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Altura: " + pessoa.altura + " metros.");

        // Saida de dados
        pessoa.cumprimentar();
        pessoa.apresentar();

        sc.close();
    }
}
