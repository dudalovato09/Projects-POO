package AAGA;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
        Veiculo[] veiculos = new Veiculo[5];

        // Laço para criar os 5 veículos
        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i] = new Veiculo();
            System.out.println("Digite os dados do veículo " + (i + 1) + ":");

            System.out.print("Placa: ");
            veiculos[i].setPlaca(input.nextLine());

            System.out.print("Marca: ");
            veiculos[i].setMarca(input.nextLine());

            System.out.print("Modelo: ");
            veiculos[i].setModelo(input.nextLine());

            System.out.print("Cor: ");
            veiculos[i].setCor(input.nextLine());

            System.out.print("Velocidade Máxima: ");
            veiculos[i].setVelocMax(input.nextFloat());

            System.out.print("Quantidade de Rodas: ");
            veiculos[i].setQtdRodas(input.nextInt());
            
            System.out.print("Quantidade de pistões do motor: ");
            veiculos[i].getMotor().setQtdPist(input.nextInt());

            System.out.print("Potência do motor: ");
            veiculos[i].getMotor().setPotencia(input.nextInt());
            input.nextLine(); // limpa o buffer
        }

        // Mostrando os dados
        System.out.println("\nDADOS DOS VEÍCULOS:");
        for (int i = 0; i < veiculos.length; i++) {
            System.out.println("Veículo " + (i + 1) + ":");
            System.out.println("Placa: " + veiculos[i].getPlaca());
            System.out.println("Marca: " + veiculos[i].getMarca());
            System.out.println("Modelo: " + veiculos[i].getModelo());
            System.out.println("Cor: " + veiculos[i].getCor());
            System.out.println("Velocidade Máxima: " + veiculos[i].getVelocMax());
            System.out.println("Quantidade de Rodas: " + veiculos[i].getQtdRodas());
            System.out.println("Pistões do motor: " + veiculos[i].getMotor().getQtdPist());
            System.out.println("Potência do motor: " + veiculos[i].getMotor().getPotencia());
            System.out.println("---------------------------");
        }
		
        input.close();
	}
}
