package Faculdade.LinguagensDeProgramaçãoII.exercicios0304;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número para ser somado aos seus anteriores:");
		int x = input.nextInt();

		System.out.println("A soma dos números é: " + SomaAnteriores(x));

	}

	public static int SomaAnteriores(int x) {
		int soma = 0;
		for(int i=1;i<=x;i++) {
			soma += i;
		}
		
		return soma;
	}
}
