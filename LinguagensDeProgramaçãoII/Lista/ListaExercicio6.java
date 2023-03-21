package Faculdade.LinguagensDeProgramaçãoII.Lista;
import java.util.Scanner;

public class ListaExercicio6 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = input.nextInt();
        
        if(idade < 16)
        	System.out.println("Você ainda não é um eleitor!");
        else if(idade >= 18 && idade <= 65)
        	System.out.println("Você é um eleitor obrigatório!");
        else
        	System.out.println("Você é um eleitor facultativo!");

	}

}
