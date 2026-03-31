package com.heranca.models;

public class PessoaJuridica extends Pessoa{
    
    // Atributos

    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;
    public String website;

    // Construtor

    public PessoaJuridica() {
    }

    // Método

    public String recepcionar(String nome) {
        return "Prazer, " + nome + ". Somos a empresa " + this.nomeFantasia + ".";
    }
}

