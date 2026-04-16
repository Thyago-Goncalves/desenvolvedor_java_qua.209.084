// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.entrada.app;

import java.awt.Component;
import javax.swing.JOptionPane;

public class App {
   public App() {
   }

   public static void main(String[] args) throws Exception {
      String nome = JOptionPane.showInputDialog("Informe o seu nome:");
      JOptionPane.showMessageDialog((Component)null, "Meu nome é: " + nome);
   }
}
