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
        
        // Instanciando as classes
        
        Scanner sc = new Scanner(System.in);
        Caminhao caminhao = new Caminhao();
        Carro carro = new Carro();
        Moto moto = new Moto();
        Onibus onibus = new Onibus();

        // Entrada de dados 

        System.out.println("Informe o Fabricante do veículo: ");
        
        System.out.println("Informe o Fabricante do veículo: ");
        System.out.println("Informe o Fabricante do veículo: ");
        System.out.println("Informe o Fabricante do veículo: ");
        System.out.println("Informe o Fabricante do veículo: ");
    }
}
