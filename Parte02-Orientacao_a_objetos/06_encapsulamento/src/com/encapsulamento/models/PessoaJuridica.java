package com.encapsulamento.models;

final public class PessoaJuridica extends Pessoa {

    // Atributos

    private String nomeFantasia;
    private String cnpj;

    // Construtor

    public PessoaJuridica(String nomeFantasia, String cnpj, String email, String telefone) {
        super(email, telefone);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
    
    // Metodos de acesso (Getters e Setters)

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
