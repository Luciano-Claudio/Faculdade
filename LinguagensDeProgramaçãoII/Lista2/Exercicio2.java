package Faculdade.LinguagensDeProgramaçãoII.Lista2;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de filhos da familia 1: ");
        int filhos = Integer.parseInt(input.nextLine());
        System.out.println("Digite o salário da familia 1: ");
        float salario = Float.parseFloat(input.nextLine());

        int i = 1;


        float mediaFilhos = 0, mediaSalario = 0, maiorSalario = 0;

        while (salario != -1) {
            i++;
            mediaFilhos += filhos;
            mediaSalario += salario;

            maiorSalario = salario > maiorSalario ? salario : maiorSalario;

            System.out.printf("Digite a quantidade de filhos da familia %d:\n", i);
            filhos = Integer.parseInt(input.nextLine());
            System.out.printf("Digite o salário da familia %d:\n", i);
            salario = Float.parseFloat(input.nextLine());
        }

        mediaFilhos /= i;
        mediaSalario /= i;

        System.out.println("A média do salário das familias é " + mediaSalario);
        System.out.println("A média dos filhos das familias é " + mediaFilhos);
        System.out.println("O maior salário das familias é " + maiorSalario);

    }
}
