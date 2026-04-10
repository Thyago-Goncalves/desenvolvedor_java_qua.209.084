package com.atividade07.models;

import com.atividade07.repository.IConta;

public abstract class Conta implements IConta {

    // Atributos

    private String nAgencia;
    private String nConta;
    private double saldo;

    // Construtor


    public Conta(String nAgencia, String nConta, double saldo) {
        this.nAgencia = nAgencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }

    // Metodos de acesso


    public String getNAgencia() {
        return this.nAgencia;
    }

    public void setNAgencia(String nAgencia) {
        this.nAgencia = nAgencia;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Override
    
    @Override
    public void exibirDados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirDados'");
    }

    @Override
    public double fazerDeposito(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fazerDeposito'");
    }

    @Override
    public double fazerSaque(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fazerSaque'");
    }

}
