package Faculdade.LinguagensDeProgramaçãoII.Exercicios.exercicio2703;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Dado o vetor [3,18,2,51,45] crie um programa que determine o maior elemento
		 * deste vetor
		 * 
		 * Leia uma matriz 3x3 de elementos inteiros e calcule a soma dos seus elementos
		 */

		int[] mat = { 3, 18, 2, 51, 45 };
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < mat.length; i++)
			maior = mat[i] > maior ? mat[i] : maior;
		
		System.out.println("O maior número da lista [3,18,2,51,45] é " + maior);
	}
}
