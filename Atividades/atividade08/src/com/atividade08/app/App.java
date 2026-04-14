package com.atividade08.app;

import javax.swing.JOptionPane;
import com.atividade08.models.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciando a classe Pessoa

        Pessoa usuario = new Pessoa(null, 0);

        // Entrada de dados

        usuario.setNome(JOptionPane.showInputDialog("Informe o seu nome:"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));

        if (usuario.getIdade() >= 18) {
            JOptionPane.showMessageDialog(null, usuario.getNome() + ", é maior de idade.");
        } else {
            JOptionPane.showConfirmDialog(null, usuario.getNome() + ", é menor de idade." );
        }
    }
}
