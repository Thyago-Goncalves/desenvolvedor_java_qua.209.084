package com.atividade03.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // TODO
        // Recrie o programa da calculadora feito no dia 18/03/2026 (switch-case), mas
        // desta vez acrescentando a opção de encerrar o programa quando o 
        // usuario quiser.

        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis

        double num1;
        double num2;
        double result;
        String operador;
        String opcao;

        // Entrada de dados

        do{
        System.out.println("Informe o 1° número: ");
        num1 = sc.nextDouble();
        System.out.println("Informe o 2° número: ");
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
        System.out.println("Deseja encerrar o programa?");
        System.out.println("1 - Sim");
        System.out.println("2 - Continuar no programa");
        opcao = sc.nextLine();

        if (opcao == "1") {
            
        }
        else {}
       } while (opcao != 2);
        
       }
          sc.close();

        

    }
}
