package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Declaração de variável
        
        String nome;

        // Entrada de dados

        nome = JOptionPane.showInputDialog("Informe o seu nome:");

        // Saida de dados

        JOptionPane.showMessageDialog(null, "Meu nome é: " + nome);
    }
}
