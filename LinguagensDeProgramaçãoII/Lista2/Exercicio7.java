package Faculdade.LinguagensDeProgramaçãoII.Lista2;

import java.util.Scanner;

public class Exercicio7 {
	static final int tam = 2;
	
	public static void main(String[] args) {
		int mat1[][] = new int[tam][tam];
		int mat2[][] = new int[tam][tam];

		CriarMatriz(mat1, 1);
		CriarMatriz(mat2, 2);
		
		int soma[][] = SomaMatriz(mat1,mat2);
		
		int sub[][] = SubtracaoMatriz(mat1,mat2);
		
		System.out.println("A matriz de soma é: ");
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.printf("%d ",soma[i][j]);
			}
			System.out.println();
		}

		System.out.println("A matriz de subtração é: ");
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.printf("%d ",sub[i][j]);
			}
			System.out.println();
		}
	}

	public static void CriarMatriz(int[][] mat, int x) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.printf("Digite o número para a posição [%d, %d] da matriz %d: ", i, j, x);
				mat[i][j] = Integer.parseInt(input.nextLine());
			}
		}
	}

	private static int[][] SubtracaoMatriz(int[][] mat1, int[][] mat2) {

		int mat[][] = new int[tam][tam];

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				mat[i][j] = mat1[i][j] - mat2[i][j];
			}
		}
		return mat;
	}

	private static int[][] SomaMatriz(int[][] mat1, int[][] mat2) {

		int mat[][] = new int[tam][tam];

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				mat[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		return mat;
	}
}
