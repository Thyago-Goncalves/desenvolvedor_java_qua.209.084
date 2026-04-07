package com.atividade06.models;

final public class Onibus extends Veiculo {
    
    // Atributos

    private boolean leito;

    // Construtor

    public Onibus (boolean leito, String fabricante, String modelo, String cor, String ano, String placa, String categoria) {
        super (fabricante, modelo, cor, ano, placa, categoria);
        this.leito = leito; 
    }

    // Metodos de acesso


    public boolean isLeito() {
        return this.leito;
    }

    public boolean getLeito() {
        return this.leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }

}
