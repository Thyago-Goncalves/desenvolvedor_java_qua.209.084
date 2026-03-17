package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis

        String nome;
        double peso;
        double altura;

        // Instancia a classe scanner

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        
        System.out.println("Informe o seu nome:");
        nome = sc.nextLine();
        System.out.println("Informe o seu peso em kg:");
        peso = sc.nextDouble();
        System.out.println("Informe a sua altura em metros:");
        altura = sc.nextDouble();

        // Condicional com operador booleano

        if (peso <= 120 && altura >= 1.25) {
            System.out.println("Entrada de " + nome + " autorizada.");
        }
        else {
            System.out.println("Entrada de " + nome + " não autorizada.");
        }

        // Fecha Objeto

        sc.close();
        }
}
