package Faculdade.LinguagensDeProgramaçãoII.Lista3;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1, s2;
        
        System.out.println("Digite a primeira string:");
        s1 = input.nextLine();
        System.out.println("Digite a segunda string:");
        s2 = input.nextLine();
        
        
        if(s1.equals(s2))
			System.out.println("Strings iguais.");
        else
        	System.out.println(s1.concat(s2));
    }
}
