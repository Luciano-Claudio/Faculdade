package Faculdade.LinguagensDeProgramaçãoII.exercicios0304;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] lados = new float[3];
		for(int i=0;i<3;i++) {
			System.out.printf("Digite o tamanho do %d° lado do trângulo: ", (i+1));
			lados[i] = Float.parseFloat(input.nextLine());
		}
		
		System.out.println("O tipo de triângulo é: " + Triangulo(lados));
	}
	
	public static String Triangulo(float[] lados) {
		
		if((lados[0] >= lados[1] + lados[2]) || (lados[1] >= lados[0] + lados[2])
				|| (lados[2] >= lados[0] + lados[1]))
			return "Não forma Triângulo";
		
		if(lados[0] == lados[1] && lados[1] == lados[2])
			return "Triângulo Equilátero";
		else if(lados[0] == lados[1] || lados[1] == lados[2] || lados[0] == lados[2])
			return "Triângulo Isósceles";
		
		return "Triângulo Escaleno";
	}

}
