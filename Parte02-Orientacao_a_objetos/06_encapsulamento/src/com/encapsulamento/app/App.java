package com.encapsulamento.app;

import java.util.Scanner;
import com.encapsulamento.models.PessoaFisica;
import com.encapsulamento.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica(null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);
        Scanner sc = new Scanner(System.in);

        // Dados da empresa

        empresa.setNomeFantasia("Funerária você é próximo");
        empresa.setCnpj("87.832.945/0001-58");
        empresa.setEmail("funeraria@contato.com.br");
        empresa.setTelefone("(61)99992-2919");

        // Dados do usuário

        System.out.println("Informe o nome:");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o CPF:");
        usuario.setCpf(sc.nextLine());
        System.out.println("Informe o e-mail");
        usuario.setEmail(sc.nextLine());
        System.out.println("Informe o telefone:");
        usuario.setTelefone(sc.nextLine());
        
        // Saída de dados

        System.out.println("\nDADOS DO USUÁRIO\n");
        System.out.println("Nome do usuario: " + usuario.getNome());
        System.out.println("CPF do usuario: " + usuario.getCpf());
        System.out.println("E-mail do usuario: " + usuario.getEmail());
        System.out.println("Telefone do usuario: " + usuario.getTelefone());
        System.out.println("\nDADOS DA EMPRESA:\n");
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CNPJ da empresa: " + empresa.getCnpj());
        System.out.println("E-mail da empresa: " + empresa.getEmail());
        System.out.println("Telefone da empresa: " + empresa.getTelefone());
       sc.close();
    }
}
