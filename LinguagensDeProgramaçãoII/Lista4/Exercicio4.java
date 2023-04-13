package Faculdade.LinguagensDeProgramaçãoII.Lista4;

import java.util.Scanner;

public class Exercicio4 {
	public static class Conta {
		float dinheiro;

		void Sacar(float total) {
			dinheiro -= total;
		}

		void Depositar(float total) {
			dinheiro += total;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();

		// Conta Corrente
		System.out.println("Digite quanto você quer depositar na sua Conta Corrente:");
		float total = Float.parseFloat(input.nextLine());
		contaCorrente.Depositar(total);

		System.out.printf("Você tem %.2f reais na sua Conta Corrente\n", contaCorrente.dinheiro);

		System.out.println("Digite quanto você quer sacar da sua Conta Corrente:");
		total = Float.parseFloat(input.nextLine());
		contaCorrente.Sacar(total);

		System.out.printf("Você tem %.2f reais na sua Conta Corrente\n", contaCorrente.dinheiro);

		// Conta Poupança
		System.out.println("Digite quanto você quer depositar na sua Conta Poupança:");
		total = Float.parseFloat(input.nextLine());
		contaPoupanca.Depositar(total);

		System.out.printf("Você tem %.2f reais na sua Conta Poupança\n", contaPoupanca.dinheiro);

		System.out.println("Digite quanto você quer sacar da sua Conta Poupança:");
		total = Float.parseFloat(input.nextLine());
		contaPoupanca.Sacar(total);

		System.out.printf("Você tem %.2f reais na sua Conta Poupança\n", contaPoupanca.dinheiro);
	}
}
