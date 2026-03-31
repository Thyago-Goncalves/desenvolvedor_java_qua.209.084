package com.heranca.app;

import java.util.Scanner;
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        // Dados da empresa

        empresa.razaoSocial = "THYAGO SAF";
        empresa.nomeFantasia = "Thyago passeios ";
        empresa.cnpj = "51.049.673/0001-77";
        empresa.email = "thyagopasseios@contato.com.br";
        empresa.telefone = "(61) 96666-6666";
        empresa.endereco = "SIA";
        empresa.website = "passeiosdothyago.com.br";

        // Dados do usuário
        System.out.println("Dados do Usuário:");
        System.out.println("Informe o nome do usuário:");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o CPF do usuário:");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe o e-mail do usuário:");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone do usuário:");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe a idade do usuário:");
        usuario.idade = sc.nextInt();

        // Saída de dados

        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.nome));
        sc.close();
    }
}
