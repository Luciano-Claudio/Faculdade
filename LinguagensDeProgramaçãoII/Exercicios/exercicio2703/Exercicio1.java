package Faculdade.LinguagensDeProgramaçãoII.Exercicios.exercicio2703;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*
		 * Crie uma matriz 2x2 e permita que o usuario insira seus elementos em seguida,
		 * os elementos da matriz devem ser impressos na tela.
		 */

		Scanner input = new Scanner(System.in);
		int[][] mat = new int[2][2];
		int x = 1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("Digite o %d° numero: ", x++);
				mat[i][j] = input.nextInt();
			}
		}
		System.out.println("Os números digitados foram:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
		input.close();
	}
}
