package Faculdade.LinguagensDeProgramaçãoII.Exercicios.strings;

import java.util.Scanner;

public class StringsAula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a primeira string:");
		String s1 = input.nextLine();

		System.out.println("O tamanho dessa string é " + s1.length());

		System.out.println("Digite a segunda string:");
		String s2 = input.nextLine();

		if (s1.equals(s2))
			System.out.println("As duas strings são iguais!");
		else
			System.out.println("As duas strings são diferentes!");

		System.out.println("A junção das duas palavras é:" + s1 + s2);

		char[] palavra = s1.toCharArray();

		System.out.println("A primeira palavra ao contrário fica:");
		for (int i = palavra.length-1; i >= 0; i--) {
			System.out.printf("%c", palavra[i]);
		}

	}

}
