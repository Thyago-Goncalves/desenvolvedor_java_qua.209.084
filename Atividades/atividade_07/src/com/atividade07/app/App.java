package com.atividade07.app;

import java.util.Scanner;
import com.atividade07.models.PessoaFisica;
import com.atividade07.models.PessoaJuridica;
import com.atividade07.models.ContaPF;
import com.atividade07.models.ContaPJ;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Atributos

        String tipoDeConta;
        String acao;

        // Seleção do tipo de conta

        System.out.println("\n SEJA BEM-VINDO AO BANCO LIMAMEI \n");
        System.out.println("Informe o tipo de conta em que deseja entrar:");
        System.out.println("PJ - Pessoa Juridica");
        System.out.println("PF - Pessoa Fisica");
        tipoDeConta = sc.nextLine();

        // Conta selecionada

        switch (tipoDeConta) {
            case "PJ":
                PessoaJuridica pessoaJuridica = new PessoaJuridica(null, null, null, null);
                System.out.println("Informe o nome fantasia:");
                pessoaJuridica.setNomeFantasia(sc.nextLine());
                System.out.println("Informe a razão social:");
                pessoaJuridica.setRazaoSocial(sc.nextLine());
                System.out.println("Informe o e-mail cadastrado na conta:");
                pessoaJuridica.setEmail(sc.nextLine());
                System.out.println("Informe o CNPJ:");
                pessoaJuridica.setCnpj(sc.nextLine());
                break;

            case "PF":
                PessoaFisica pessoaFisica = new PessoaFisica(null, null, null);
                System.out.println("Informe o nome do Titular a conta:");
                pessoaFisica.setNome(sc.nextLine());
                System.out.println("Ifnrome o E-mail cadastrado na conta:");
                pessoaFisica.setEmail(sc.nextLine());
                System.out.println("Informe o CPF do titular:");
                pessoaFisica.setCpf(sc.nextLine());
                break;

            default:
                System.out.println("Por favor, informe o tipo de conta correto!");
        }

        do {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Consultar dados da conta");
            System.out.println("2 - Realizar Saque");
            System.out.println("3 - Realizar depósito");
            System.out.println("4 - Sair do programa");
            acao = sc.nextLine();

            if (!"4".equals(acao)) {
                switch (acao) {
                    case "1":
                        if (tipoDeConta == "PF") {
                        ContaPF pf = new ContaPF("0001-8", "123456-7", 1000, null);
                        System.out.println("\n Dados da Conta \n");
                        System.out.println("Número da Âgencia: " + pf.getNAgencia());
                        System.out.println("Número da Conta: " + pf.getNConta());
                        System.out.println("Saldo: " + pf.getSaldo());
                        } else {
                        ContaPJ pj = new ContaPJ("0001-7", "123455-6", 10000, null);
                        System.out.println("\n Dados da Conta \n");
                        System.out.println("Número da Âgencia: " + pj.getNAgencia());
                        System.out.println("Número da Conta: " + pj.getNConta());
                        System.out.println("Saldo: " + pj.getSaldo());
                        }
                        break;
                    case "2":
                    default:
                        break;
                }
            }
        } while (!"4".equals(acao));
        sc.close();
    }
}

// TODO - Atividade 7
// Crie um programa de aplicativo de banco: o usuário poderá escolher se desejar entrar como pessoa fisica ou pessoa juridica, devera informar nome. email e cpf (classe PessoaFisica), ou nome fantasia, razão social, email e cnpj (Classe conta) do titular (uma unica vez durante todo o programa) Em seguida, o programa devera exibir as opções para o usuario: consultar dados da conta (nAgencia, nConta, Saldo), fazer saque, fazer depósito, sair do programa. O Programa deverá cobrar uma taxa de 0,01% em cima de cada saque feito pela pessoa juridica. Qualquer saque só podera ser feito caso o valor do saque seja menor ou igual ao saldo da conta.
// NOTE - Use os 4 pilares da orientação a objeto, mais interface e composição. 