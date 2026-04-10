package com.atividade06.app;

import java.util.Scanner;
import com.atividade06.models.Caminhao;
import com.atividade06.models.Carro;
import com.atividade06.models.Moto;
import com.atividade06.models.Onibus;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: ATIVIDADE 06
        // A partir da superclasse abstrata Veiculo, crie as subclasses: moto, carro, onibus e caminhão, todas no package models. Instancie cada uma das subclasses na classe principal, e peça para o usuário informar os seguintes atributos privados de um veículo escolhido pelo próprio usuário: Fabricante, Modelo, Cor, Ano, Placa. O atributo privado categoria deverá ser informado pelo próprio programa. Ao final, o programa exibirá os dados do veículo escolhido por ele.
        // NOTE: Diferença entre as classes: Carro tera bagageiro, ônibus leito ou não e caminhão terá carroceria. 
        // NOTE: Utilize herança, abstração e encapsulamento para codar.
        
        String tipoVeiculo;
        

        // Instanciando as classes
        
        Scanner sc = new Scanner(System.in);

        // Entrada de dados (Tipo de veículo)

        System.out.println("Infome o tipo do Veículo");
        System.out.println("A - Moto");
        System.out.println("B - Carro");
        System.out.println("C - Caminhão");
        System.out.println("D - Ônibus");
        tipoVeiculo = sc.nextLine();


        switch (tipoVeiculo) {
            case "A":
                Moto moto = new Moto(null, null, null, null, null, null, "A");
                System.out.println("Informe o fabricante:");
                moto.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                moto.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                moto.setCor(sc.nextLine());
                System.out.println("Informe a placa:");
                moto.setPlaca(sc.nextLine());
                System.out.println("Informe o ano:");
                moto.setAno(sc.nextLine());
                System.out.println("Informe as cilindradas:");
                moto.setCilindradas(sc.nextLine());

                System.out.println("Fabricante: " + moto.getFabricante());
                System.out.println("Modelo: " + moto.getModelo());
                System.out.println("Cor: " + moto.getCor());
                System.out.println("Placa: " + moto.getPlaca());
                System.out.println("Ano: " + moto.getAno());
                System.out.println("Cilindradas: " + moto.getCilindradas());
                System.out.println("Categoria: " + moto.getCategoria());
                break;
            case "B":
                Carro carro = new Carro(null, null, null, null, null, null, "B");
                System.out.println("Informe o fabricante:");
                moto.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                moto.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                moto.setCor(sc.nextLine());
                System.out.println("Informe a placa:");
                moto.setPlaca(sc.nextLine());
                System.out.println("Informe o ano:");
                moto.setAno(sc.nextLine());
                System.out.println("Informe as cilindradas:");
                moto.setCilindradas(sc.nextLine());
        }
        // Entrada de dados (Sobre o veículo)

        System.out.println("Informe o Fabricante do veículo: ");
        sc.nextLine();
        System.out.println("Informe o Modelo do veículo: ");
        sc.nextLine();
        System.out.println("Informe a Cor do veículo: ");
        sc.nextLine();
        System.out.println("Informe o Ano do veículo: ");
        sc.nextLine();
        System.out.println("Informe a Placa do veículo: ");
        sc.nextLine();

        // Saida de dados

        System.out.println("\nDados de Veículo\n");
        
   sc.close();
    }


}
