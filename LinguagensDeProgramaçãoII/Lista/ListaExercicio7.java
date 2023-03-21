package Faculdade.LinguagensDeProgramaçãoII.Lista;

import java.util.Scanner;

public class ListaExercicio7 {

	public static void main(String[] args) {

		int[][] refeicao = { { 750, 30 }, { 342, 80 }, { 545, 90 } };

		Scanner input = new Scanner(System.in);

		System.out.println("Prato\t\t|\tBebida");
		System.out.println("1-Italiano\t|\t1-Chá");
		System.out.println("2-Japonês\t|\t2-Suco de laranja");
		System.out.println("3-Salvadoreno\t|\t3-Refrigerante");
		System.out.println("Escolha um prato: ");
		int prato = input.nextInt() - 1;
		System.out.println("Escolha uma bebida: ");
		int bebida = input.nextInt() - 1;
		
		System.out.println("O total de calorias ingerido foi de " + (refeicao[prato][0] + refeicao[bebida][1]));

	}

}
