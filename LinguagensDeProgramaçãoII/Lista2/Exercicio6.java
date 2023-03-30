package Faculdade.LinguagensDeProgramaçãoII.Lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.printf("Digite a ordem(tamanho) da matriz: ");
		int tam = Integer.parseInt(input.nextLine());
		int[][] mat = new int[tam][tam];

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.printf("Digite o número para a posição [%d, %d] da matriz: ", i, j);
				mat[i][j] = Integer.parseInt(input.nextLine());
			}
		}

		System.out.println("A matriz que você digitou é: ");
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}

		mat = Transposta(mat, tam);

		System.out.println("A matriz transposta é: ");
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] Transposta(int[][] mat, int tam) {

		int[][] transposta = new int[tam][tam];
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				if (i < j || i > j)
					transposta[i][j] = mat[j][i];
				else if (i == j)
					transposta[i][j] = mat[i][j];
					
			}
		}
		return transposta;
	}
}
