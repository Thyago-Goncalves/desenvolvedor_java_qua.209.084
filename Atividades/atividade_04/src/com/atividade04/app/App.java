package com.atividade04.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //TODO: ATIVIDADE 04
        // Desenvolva um programa que crie um objeto da classe veiculo 
        // (pode ser qualquer veiculo) com os atributos:
        // - Fabricante
        // - Modelo
        // - Placa
        // - Ano
        // - Cor
        // O programa deverá mostrar os dados do veículo 
        // NOTE: veículo não mostra dados. portanto não pode ser via método)
        // NOTE: Usuário deverá informar os dados do veículo

        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();

        // Entrada de dados

        System.out.println("Informe o fabricante do veículo: ");
        veiculo.fabricante = sc.nextLine();
        System.out.println("Informe o modelo do veículo: ");
        veiculo.modelo = sc.nextLine();
        System.out.println("Informe a placa do veículo: ");
        veiculo.placa = sc.nextLine();
        System.out.println("Informe a cor do seu veículo: ");
        veiculo.cor = sc.nextLine();
        System.out.println("Informe o ano do veículo: ");
        veiculo.ano = sc.nextInt();

        // Saida de dados 

        System.out.print("A fabricante do seu carro é: " + veiculo.fabricante);
        System.out.print(", de modelo: " + veiculo.modelo);
        System.out.print(", com a placa: " + veiculo.placa);
        System.out.print(", de cor: " + veiculo.cor);
        System.out.print(" e ano: " + veiculo.ano );

        sc.close();
    }
}
