package com.encapsulamento.models;

abstract public class Pessoa {

    // Atributos

    private String email;
    private String telefone; 

    // Construtor

    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    // Metodos de acesso (Getters e Setters)

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }
    
}
