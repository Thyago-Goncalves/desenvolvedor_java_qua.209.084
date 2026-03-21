package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
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
        String sala;
        String filme = null;
        int idade;
        int idadeMin = 0;

            System.out.println("Informe o seu nome:");
            nome = sc.nextLine();
            System.out.println("Informe a sua idade:");
            idade = sc.nextInt();

            // Limpeza de buffer

            sc.nextLine();

            // menu

        do {
            System.out.println("Escolha o seu filme: ");
            System.out.println("Sala 1 - A Roda Quadrada - Livre");
            System.out.println("Sala 2 - A volta dos que não foram - 12 anos");
            System.out.println("Sala 3 - Poeira em alto mar - 14 anos");
            System.out.println("Sala 4 - As Tranças do Rei Careca - 16 anos");
            System.out.println("Sala 5 - A Vingança do Peixe Frito - 18 anos");
            sala = sc.nextLine();
          

            switch (sala) {
                case "1":
                    filme = "A Roda Quadrada";
                    break;
                case "2":
                    filme = "A volta dos que não foram";
                    idadeMin = 12;
                    break;
                case "3":
                    filme = "Poeira em alto mar";
                    idadeMin = 14;
                    break;
                case "4":
                    filme = "As Tranças do Rei Careca";
                    idadeMin = 16;
                    break;
                case "5":
                    filme = "A Vingança do Peixe Frito";
                    idadeMin = 18;
                    break;
                default: 
                    idadeMin = idade + 1;
                
            } 

            if ( idade >= idadeMin) {
                System.out.println(nome + " ingresso impresso com sucesso.");
                System.out.println("Filme: " + filme + ".");
                System.out.println("Tenha um bom filme! =D");
            }
            else {
                System.out.println("Entrada bloqueada para " + nome + ".");
                System.out.println("Favor escolher outro filme.");
            }
        } while (idade <= idadeMin);
        
            
            

        sc.close();
    }
}

