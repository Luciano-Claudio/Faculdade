package Faculdade.LinguagensDeProgramaçãoII.Lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static class Filme {
		String nome;
		String autor;
		int ano;
		float preco;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Filme f = new Filme();
		
		Leitor(input,f);
		Imprimir(f);
		
	}
	public static void Leitor(Scanner input, Filme f) {
		System.out.println("Digite o nome do filme:");
		f.nome = input.nextLine();
		System.out.println("Digite o autor do filme:");
		f.autor = input.nextLine();
		System.out.println("Digite o ano do filme:");
		f.ano = Integer.parseInt(input.nextLine());
		System.out.println("Digite o preço do filme:");
		f.preco = Float.parseFloat(input.nextLine());
	}
	public static void Imprimir(Filme f) {
		System.out.printf("O nome do filme é %s o autor do filme é %s o ano do filme é %d e o preco do filme é %f"
				,f.nome,f.autor,f.ano,f.preco);
	}
	
	
}
