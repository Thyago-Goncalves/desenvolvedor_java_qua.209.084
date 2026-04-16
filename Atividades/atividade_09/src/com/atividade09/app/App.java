package com.atividade09.app;

import javax.swing.JOptionPane;
import com.atividade09.models.*;

public class App {
    public static void main(String[] args) throws Exception {
        double melhorCombustivel;
        String opcaoSelecionada;
    
        Usuario usuario = new Usuario(0, 0);
        
        do {
            opcaoSelecionada = JOptionPane.showInputDialog(null,"\n 1 - Informe o valor da Gasolina e do Etanol\n 2 - Mostrar melhor combustível\n 3 - Sair do programa");

            switch (opcaoSelecionada) {
                case "1":
                    usuario.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Gasolina:").replace(",", ".")));
                    usuario.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Etanol:").replace(",", ".")));
                    break;
                case "2":
                    melhorCombustivel = usuario.getEtanol()/usuario.getGasolina();
                    if (melhorCombustivel >= 0.7){
                        JOptionPane.showMessageDialog(null, "O melhor combustivel é o Etanol.");
                    } else {
                        JOptionPane.showMessageDialog(null, "O melhor combustível é a Gasolina.");
                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Programa encerrado com sucesso.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Selecione uma opção correta.");
            }
        }while(!opcaoSelecionada.equals("3"));
    }
}

// Faça um programa com JOptionPane que receba do usuário os valores dos combustíveis etanol e gasolina, e exiba qual o melhor combustível para abastacer. O programa deverá mostrar a opção de entrar com o valor do etanol, da gasolina, mostrar melhor combustível ou sair do programa.

// NOTE: Etanol > Gasolina = Etanol / Gasolina = 70% ou menos