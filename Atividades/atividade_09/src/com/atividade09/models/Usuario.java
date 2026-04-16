package com.atividade09.models;

public class Usuario {
    private double etanol;
    private double gasolina;


    public Usuario(double etanol, double gasolina) {
        this.etanol = etanol;
        this.gasolina = gasolina;
    }


    public double getEtanol() {
        return this.etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    public double getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

}
