package Faculdade.LinguagensDeProgramaçãoII.Lista2;

import java.util.Scanner;

public class Exercicio5 {
	public static class Aluno {
		String nome;
		float[] notas;
		float media;

		public Aluno(String nome, float[] notas) {
			this.nome = nome;
			this.notas = notas;
			this.media = 0;
			for (float nota : notas) {
				this.media += nota;
			}
			this.media /= 2;
		}

		public String toString() {
			if (media >= 7)
				return "O aluno " + this.nome + " foi Aprovado com média " + this.media + ".\n";

			return "O aluno " + this.nome + " foi Reprovado com média " + this.media + ".\n";
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno[] alunos = new Aluno[5];

		for (int i = 0; i < 5; i++) {
			float[] notas = new float[2];
			System.out.printf("Digite o nome do aluno: ");
			String nome = input.nextLine();

			for (int j = 0; j < 2; j++) {
				System.out.printf("Digite a %d° nota do aluno %s: ", (j + 1), nome);
				notas[j] = Float.parseFloat(input.nextLine());
			}
			alunos[i] = new Aluno(nome, notas);
		}

		for (Aluno aluno : alunos) {
			System.out.println(aluno.toString());
		}
	}
}
