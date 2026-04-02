package com.encapsulamento.models;

final public class PessoaFisica extends Pessoa {
    
    // Atributos

    private String nome;
    private String cpf;

    // Construtor 

    public PessoaFisica(String nome, String cpf, String email, String telefone) {
        super (email, telefone);
        this.nome = nome;
        this.cpf = cpf;
    }

    // Metodos de acesso (Getters e Setters)

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.nome;
    }

    public void setCpf(String nome) {
        this.nome = nome;
    }
}
