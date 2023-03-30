package Faculdade.LinguagensDeProgramaçãoII.Lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vet = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d° número: ", (i+1));
			vet[i] = Integer.parseInt(input.nextLine());
		}
		int aux;
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (vet[i] > vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		
		for(int num : vet) {
			System.out.println(num);
		}
	}
}
