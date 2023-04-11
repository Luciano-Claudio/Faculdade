package Faculdade.LinguagensDeProgramaçãoII.Lista3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o número final do somatório:");
		int n = input.nextInt();
		System.out.printf("O somatório de 1 até %d é : %d",n, Somatorio(n));
	}

	public static int Somatorio(int n) {
		if(n == 1)
			return 1;
		return n + Somatorio(n-1);
	}
}
