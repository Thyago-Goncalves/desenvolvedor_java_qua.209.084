package com.heranca.models;

public class PessoaFisica extends Pessoa {
    public String nome;
    public String cpf;
    public int idade;

    // Construtor

    public PessoaFisica() {
    }

    // Metodo

    public String apresentar() {
        return "Olá, meu nome é " + this.nome + ". Prazer";
    }
}
