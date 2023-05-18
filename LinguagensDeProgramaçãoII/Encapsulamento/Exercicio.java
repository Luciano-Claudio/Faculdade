package Encapsulamento;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = inputString.nextLine();
		
		System.out.println("Digite seu CPF:");
		String cpf = inputString.nextLine();

		System.out.println("Qual é o tipo de conta que você deseja criar?\n1-Conta Corrente\n2-Conta Poupança");
		int n = input.nextInt();
		float total;

		if(n == 1){
			// Conta Corrente
			Conta c = new Conta(nome,cpf,"Corrente");
			System.out.println("Digite quanto você quer depositar na sua Conta Corrente:");
			total = input.nextFloat();
			c.Depositar(total);

			System.out.printf("Você tem %.2f reais na sua Conta Corrente\n", c.GetSaldo());

			System.out.println("Digite quanto você quer sacar da sua Conta Corrente:");
			total = input.nextFloat();
			c.Sacar(total);

			System.out.printf("Você tem %.2f reais na sua Conta Corrente\n", c.GetSaldo());
			System.out.println(c);
		}
		else if(n == 2){
			// Conta Poupança
			Conta c = new Conta(nome,cpf,"Poupança");
			System.out.println("Digite quanto você quer depositar na sua Conta Poupança:");
			total = input.nextFloat();
			c.Depositar(total);

			System.out.printf("Você tem %.2f reais na sua Conta Poupança\n", c.GetSaldo());

			System.out.println("Digite quanto você quer sacar da sua Conta Poupança:");
			total = input.nextFloat();
			c.Sacar(total);

			System.out.printf("Você tem %.2f reais na sua Conta Poupança\n", c.GetSaldo());
			System.out.println(c);
		}

	}
}
