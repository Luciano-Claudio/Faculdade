package Faculdade.LinguagensDeProgramaçãoII.Lista3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int x = input.nextInt();
        
        if(ParImpar(x) == 1)
        	System.out.printf("O número %d é par!!",x);
        else
        	System.out.printf("O número %d é impar!!",x);
        	
        
    }
    public static byte ParImpar(int x) {
    	if(x % 2 == 0) return 1;
    	return 0;
    }
}

