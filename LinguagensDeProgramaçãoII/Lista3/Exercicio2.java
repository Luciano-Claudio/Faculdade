package Faculdade.LinguagensDeProgramaçãoII.Lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float[] notas = new float[3];

		for (int i = 0; i < 3; i++) {
			System.out.printf("Informe a %d° nota:\n", (i + 1));
			notas[i] = Integer.parseInt(input.nextLine());
		}

		System.out.println("Informe se a média será aritmética(A) ou ponderada(P)");
		char c = input.nextLine().charAt(0);

		float media = CalcularMedia(notas, c);
		if(c == 'a' || c == 'A')
			System.out.println("A média aritmética do aluno foi: " +  media);
		else
			System.out.println("A média ponderada do aluno foi: " +  media);
	}

	public static float CalcularMedia(float[] notas, char c) {
		float media = 0;
		if (c == 'A' || c == 'a') {
			for (int i = 0; i < 3; i++)
				media += notas[i];

			media /= 3;
		}
		else {
			notas[0] *= 5;
			notas[1] *= 3;
			notas[2] *= 2;
			for(int i=0;i<3;i++) 
				media += notas[i];
			
			media /= (5+3+2);
		}
		return media;

	}
}
