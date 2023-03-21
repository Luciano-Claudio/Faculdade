package Faculdade.LinguagensDeProgramaçãoII.Lista;
import java.util.Scanner;

public class ListaExercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String aluno = input.nextLine();
        System.out.printf("Olá %s, digite o nome da sua disciplina: ", aluno);
        String disciplina = input.nextLine();

        float[] notas = new float[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a nota da disciplina %d: ", i + 1);
            notas[i] = input.nextFloat();
        }

        System.out.printf("A média das notas é: %.2f\n", calcularMedia(notas));
    }

    public static float calcularMedia(float[] notas) {
        float media = 0;

        for (int i = 0; i < 4; i++) {
            media += notas[i];
        }

        return media / 4;
    }
}
