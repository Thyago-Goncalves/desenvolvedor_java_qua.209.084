package com.classe.app;

import javax.swing.JOptionPane;

import com.classe.models.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia da Classe Pessoa

        Pessoa pessoa = new Pessoa(null, null, null, 0, 0);

        // Entrada de dados

        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em mentros:").replace(",", ".")));
        pessoa.setCpf(JOptionPane.showInputDialog("Informe o CPF:"));
        pessoa.setEmail(JOptionPane.showInputDialog("Informe o E-mail:"));
    
        // Saida de dados

        JOptionPane.showMessageDialog(null,
            "Nome: " + pessoa.getNome() +
            "\nIdade: " + pessoa.getIdade() +
            "\nAltura: " + pessoa.getAltura() +
            "\nCPF: " + pessoa.getCpf() + 
            "\nE-mail: " + pessoa.getEmail()
        );
    }
}
