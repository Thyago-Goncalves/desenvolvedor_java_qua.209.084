package com.atividade07.models;

public abstract class Pessoa {

    // Atributos
    
    private String email;

    // Construtor

    public Pessoa(String email) {
        this.email = email;
    }

    // Metodos de acesso
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
