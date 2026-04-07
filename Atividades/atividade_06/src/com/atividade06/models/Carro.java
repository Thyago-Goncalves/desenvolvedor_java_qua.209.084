package com.atividade06.models;

final public class Carro extends Veiculo {
    private boolean bagageiro;

    // Construtor

    public Carro (boolean bagageiro, String fabricante, String modelo, String cor, String ano, String placa, String categoria ) {
        super (fabricante, modelo, cor, ano, placa, categoria);
        this.bagageiro = bagageiro;
    }

    // Metodos de acesso


    public boolean isBagageiro() {
        return this.bagageiro;
    }

    public boolean getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

}