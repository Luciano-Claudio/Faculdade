package Faculdade.LinguagensDeProgramaçãoII.Lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número para receber a tabuáda dele!");
        int x = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d  * %d = %d\n", x, i, (x * i));
        }
    }
}

