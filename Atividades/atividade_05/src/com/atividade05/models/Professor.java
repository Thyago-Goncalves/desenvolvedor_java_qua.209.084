package com.atividade05.models;

public class Professor {

    public String nome;
    public String matricula;

    public String darBoasVindas() {
        return "Olá! Sou o seu professor e vou te ajudar nesse cálculo, meu nome é " + this.nome + " com a matricula - " + this.matricula + "."; 
    }

    public double areaDoTriangulo(double xTriangulo, double yTriangulo) {
        return xTriangulo*yTriangulo/2;
    }

    public double areaDoCirculo(double rCirculo, double pi) {
        return pi*Math.pow(rCirculo, 2);
    }
    public double equacaoDoPrimeiroGrau(double xEquacao, double aEquacao, double bEquacao) {
        return xEquacao = -bEquacao/aEquacao;
    }
}
