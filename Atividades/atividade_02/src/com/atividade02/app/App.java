package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //  TODO: ATIVIDADE 02
        // Crie um programa que receba do usuário o nome e a idade (1x) 
        // E depois exiba uma lista de filmes
        // Sala 01 - A Roda Quadrada - Livre
        // Sala 02 - A volta dos que não foram - 12 anos
        // Sala 03 - Poeira em alto mar - 14 anos
        // Sala 04 - As Tranças do Rei Careca - 16 anos
        // Sala 05 - A Vingança do Peixe Frito - 18 anos
        // O usuário deverá escolher o filme desejado.
        // Se tiver a idade mínima para ver o filme, o pograma imprime o ingresso e encerra.
        // Se o usuário não tiver a idade mínima, o programa bloqueia a entrada e re-exibe a lista de filmes para o usário escolher outro filme
        Scanner sc = new Scanner(System.in);

        String nome;
        double idade;
        int opcao;

            System.out.println("Informe o seu nome:");
            sc.nextLine();
            System.out.println("Informe a sua idade:");
            sc.nextDouble();

            System.out.println("Escolha o seu filme: ");
            System.out.println("Sala 1 - A Roda Quadrada - Livre");
            System.out.println("Sala 2 - A volta dos que não foram - 12 anos");
            System.out.println("Sala 3 - Poeira em alto mar - 14 anos");
            System.out.println("Sala 4 - As Tranças do Rei Careca - 16 anos");
            System.out.println("Sala 5 - A Vingança do Peixe Frito - 18 anos");
            opcao = sc.nextInt();

                System.out.println();
            

        sc.close();
    }
}

