package Faculdade.LinguagensDeProgramaçãoII.Lista;
import java.util.Scanner;

public class ListaExercicio5 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor depositado:");
        float value = Float.parseFloat(input.nextLine());
        
        System.out.println("Digite a taxa de juros em porcentagem:");
        float juros = Float.parseFloat(input.nextLine());
        
        juros /= 100;
        
        System.out.println("O valor final é de " + (value*(1+juros)));
        

	}

}
