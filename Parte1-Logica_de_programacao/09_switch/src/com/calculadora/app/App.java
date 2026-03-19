package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciando a classe

        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis

        double num1;
        double num2;
        double result;
        String operador;

        // Entrada de dados

        System.out.println("Informe o 1° número: ");
        num1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextDouble();

        // Limpeza de buffer

        sc.nextLine();

        // menu
        System.out.println("Informe a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operador = sc.nextLine();

        // Verifica a operação desejada

        switch (operador) {
            case "1":
                result = num1+num2;
                System.out.println("O valor da soma é " + result);
                break;
            case "2":
                result = num1-num2;
                System.out.println("O valor da subtração é " + result);
                break;
            case "3":
                result = num1*num2;
                System.out.println("O valor da multiplicação é: " + result);
                break;
            case "4":
                result = num1/num2;
                System.out.println("O valor da divisão é " + result);
                break;
            default:
                System.out.println("Operação Inválida.");

        }

        // Fechar objeto

        sc.close();
    }
}
