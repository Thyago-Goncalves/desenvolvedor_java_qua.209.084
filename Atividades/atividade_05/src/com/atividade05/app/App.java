package com.atividade05.app;

import java.util.Scanner;
import com.atividade05.models.*;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: ATIVIDADE 05
        // Utilizando os conceitos básicos de orientação a objetos, crie um programa que um aluno informa seus dados (nome, idade e email) e pede para um professor (dados: nome e matricula) calcular para ele as seguintes fórmulas: área do triângulo, área do círculo e equação do 1° grau. e exibe o resultado na tela.
        // NOTE: Crie as classes Aluno e professor no package models.

        
        String operador;
        double xEquacao = 0;
        double aEquacao = 0;
        double bEquacao = 0;
        double xTriangulo = 0;
        double yTriangulo = 0;
        double rCirculo = 0;
        double pi = 3.14;


        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();
        Aluno aluno = new Aluno();

        System.out.println("Informe o seu nome: ");
        aluno.nome = sc.nextLine();
        System.out.println("Informe o seu e-mail:");
        aluno.email = sc.nextLine();
        System.out.println("Informe a sua idade: ");
        aluno.idade = sc.nextInt();

        prof.nome = "Thyago";
        prof.matricula = "RVU4G51";

        System.out.println(prof.darBoasVindas());

        // Limpeza de buffer

        sc.nextLine();
        
        System.out.println("Informe a operação desejada:");
        System.out.println("1 - Calcular área do triângulo");
        System.out.println("2 - Calcular área do círculo");
        System.out.println("3 - Equação do 1° grau");
        operador = sc.nextLine();

        switch (operador) {
            case "1":
                System.out.println("Informe o valor da base do triângulo:");
                xTriangulo = sc.nextDouble();
                System.out.println("Informe a altura do triângulo:");
                yTriangulo = sc.nextDouble();
                System.out.println("A área do triangulo é " + prof.areaDoTriangulo(xTriangulo, yTriangulo));
                break;
            case "2":
                System.out.println("Informe o valor do raio do circulo:");
                rCirculo = sc.nextDouble();
                System.out.println("A área do circulo é " + prof.areaDoCirculo(rCirculo, pi));
                break;
            case "3":
                System.out.println("Informe o valor de A:");
                aEquacao = sc.nextDouble();
                System.out.println("Informe o valor de B:");
                bEquacao = sc.nextDouble();
                if (aEquacao != 0) {
                    System.out.println("O resultado de X é: " + prof.equacaoDoPrimeiroGrau(xEquacao, aEquacao, bEquacao));
                }
                else {
                    System.out.println("O coeficiente 'A' não pode ser zero");
                }

            default:
        }
        sc.close();
    }
}

