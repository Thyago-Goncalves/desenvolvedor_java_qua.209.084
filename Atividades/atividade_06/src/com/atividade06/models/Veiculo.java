package com.atividade06.models;

abstract public class Veiculo {
    
    // Atributos

    private String fabricante;
    private String modelo;
    private String cor;
    private String ano;
    private String placa;
    private String categoria;

    // Construtor

    public Veiculo(String fabricante, String modelo, String cor, String ano, String placa, String categoria) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
        this.categoria = categoria;
    }

    // Metodos de acesso (Getters e Setters)

    public String getFabricante(){
        return this.fabricante;
    }
    
    public void setFabricante() {
        this.fabricante = fabricante;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo() {
        this.modelo = modelo;
    }
    public String getCor(){
        return this.cor;
    }
    
    public void setCor() {
        this.cor = cor;
    }
    public String getAno(){
        return this.ano;
    }
    
    public void setAno() {
        this.ano = ano;
    }
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca() {
        this.placa = placa;
    }
}
