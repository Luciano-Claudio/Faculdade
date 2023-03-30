package Faculdade.LinguagensDeProgramaçãoII.Lista2;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[3];

        for(int i = 0; i < 3; i++) {
            System.out.println("Digite o nome " + (i+1));
            nomes[i] = input.nextLine();
        }
        int countA = 0, countE = 0;
        for(String nome : nomes) {
            nome.toLowerCase();
            for(int i = 0; i < nome.length(); i++) {
                if(nome.charAt(i == 'a')) countA++;
                if(nome.charAt(i) == 'e') countE++;
            }

            System.out.println("A quantidade de letras 'a' é " + countA);
            System.out.println("A quantidade de letras 'e' é " + countE);
        }
    }
}
