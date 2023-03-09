package Faculdade;

import java.util.Scanner;

public class Exercício1 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();

		System.out.println("Olá " + nome + ", digite sua altura: ");
		float altura = Float.parseFloat(input.nextLine()); // usei o parseFloat no lugar do nextFloat porque tava dando bug com o ponto decimal

		System.out.println("Certo, agora digite seu peso: ");
		float peso = Float.parseFloat(input.nextLine());
		float imc = peso/(altura*altura);
		
		System.out.printf("%s, seu IMC é de %.2f, e sua classificação na tabela do Programa Saúde Fácil é \"%s\"", nome, imc, classificarIMC(imc));
		input.close();
	}
	/* 
	 * parte totalmente ignorável, fiz só para treinar
	 * dados tirados do site https://www.programasaudefacil.com.br/calculadora-de-imc
	*/
	public static String classificarIMC(float imc) {
		String[] classificacoes =  {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};
		double[] intervalos = {0, 18.5, 25, 30, 40, Double.POSITIVE_INFINITY};
	    int value = -1;
	    
	    for (int i = 0; i < intervalos.length - 1; i++) {
	        if (imc >= intervalos[i] && imc < intervalos[i + 1]) {
	            value = i;
	            break;
	        }
	    }
		
		return classificacoes[value];
	}
}
