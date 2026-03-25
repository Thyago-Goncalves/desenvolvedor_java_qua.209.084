package com.classe.app;

public class Pessoa { 

    // Atributos

    public String nome;
    public String email;
    public int idade;
    public double altura;

    // Método

    public void cumprimentar() {
        System.out.println("Olá, boa noite.");
    }

    public void apresentar() {
        System.out.print("Meu nome é " + this.nome);
        System.out.print(", tenho " + this.idade);
        System.out.print(" anos, e " + this.altura + " metros de altura.");
    }
}

