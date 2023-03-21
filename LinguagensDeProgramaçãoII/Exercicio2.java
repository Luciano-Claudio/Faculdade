package Faculdade.LinguagensDeProgramaçãoII;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = -1;
		while(x != 0) {
			System.out.println("(Ler dois números e imprimir o maior - 1");
			System.out.println("Contador até 100 só os pares - 2");
			System.out.println("Ingressos - 3");
			System.out.println("Sair - 0)");
			System.out.println("Digite qual código você quer usar: ");
			
			x = Integer.parseInt(input.nextLine());
			
			switch(x) {
			case 0:
				break;
			case 1:
				Maior(input);
				break;
			case 2:
				Ate100Par();
				break;
			case 3:
				Ingresso(input);
				break;
			default:
				System.out.println("Número inválido, escolha outro! ");
			}
			
			if(!(Continuar(input))) break;
		}
		System.out.println("Até logo!");
		input.close();
	}

	public static void Maior(Scanner input) {
		System.out.printf("Digite o Primeiro número: ");
		int a = Integer.parseInt(input.nextLine());
		System.out.printf("Digite o Segundo número: ");
		int b = Integer.parseInt(input.nextLine());
		
		if(a > b)System.out.printf("%d é maior que %d\n",a,b);
		else if(a < b)System.out.printf("%d é maior que %d\n",b,a);
		else System.out.printf("%d e %d são iguais!",a,b);
	}
	public static void Ate100Par() {
		for(int i=0;i<=100;i+=2) {
			System.out.println(i);
		}
	}
	public static void Ingresso(Scanner input) {
		System.out.println("Você é Estudante, Aposentado ou Nenhum dos dois?");
		String pessoa = input.nextLine();
		System.out.println("Qual o valor do ingresso?");
		float valor = Float.parseFloat(input.nextLine());
		if(pessoa.equals("Estudantes") || pessoa.equals("Estudante")|| pessoa.equals("estudantes")|| pessoa.equals("estudante")) 
			valor /= 2;
		else if(pessoa.equals("Aposentados") || pessoa.equals("Aposentado") || pessoa.equals("aposentados")|| pessoa.equals("aposentado"))
			valor *= 0.7;
			
		
		System.out.println("O valor do seu ingresso é " + valor);
	}
	
	public static boolean Continuar(Scanner input) {
		System.out.println("Deseja continuar? (S/N)");
		String escolha = input.nextLine();
		if(escolha.equals("Sim") || escolha.equals("sim") || escolha.equals("S") || escolha.equals("s")) 
			return true;
		return false;
	}
}
