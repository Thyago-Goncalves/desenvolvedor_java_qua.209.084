package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

         // Crie um programa que receba do usuário: nome, peso e altura
        // E exiba na tela o valor do seu IMC e o seu diagnóstico
        // Cálculo do IMC: peso/(altura*altura)
        // Diagnósticos: imc menor que 18.5 = abaixo do peso
        // imc entre 18.5 e 25 = peso ideal
        // imc entre 25 e 30 = acima do peso
        // imc entre 30 e 35 = obeso
        // imc entre 35 e 40 = obesidade nível 2
        // imc maior que 40 = obesidade mórbida

        Scanner sc = new Scanner(System.in);

        // Declaração de váriaveis

        String nome;
        double peso;
        double altura;
        double imc;
     // Recebendo dados do usuário

    System.out.println("Informe o seu nome: ");
    nome = sc.nextLine();
    System.out.println("Informe o seu peso: ");
    peso = sc.nextDouble();
    System.out.println("Informe a sua altura: ");
    altura = sc.nextDouble();
    
    // Declarando IMC 

    imc = (peso/(altura*altura));

    // Recebendo resultados do imc do usuário
if (imc < 18.5) {
    System.out.println(nome + " você está abaixo do peso.");
} 
else if (imc < 25) {
    System.out.println(nome + " você está com peso normal.");
} 
else if (imc < 30) {
    System.out.println(nome + " você está com sobrepeso.");
} 
else if (imc < 35) {
    System.out.println(nome + " você está com obesidade grau 1.");
} 
else if (imc < 40) {
    System.out.println(nome + " você está com obesidade grau 2.");
} 
else {
    System.out.println(nome + " você está com obesidade mórbida.");
}

sc.close();

    }
}
