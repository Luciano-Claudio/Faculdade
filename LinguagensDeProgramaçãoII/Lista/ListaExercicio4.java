package Faculdade.LinguagensDeProgramaçãoII.Lista;
import java.util.Scanner;

public class ListaExercicio4 {
    public static void main(String[] args) throws Exception {
	    Scanner input = new Scanner(System.in);
	    
	    float[] madeira = new float[3];
	    
	    for(int i=0;i<3;i++) {
	    	System.out.println("Digite o tamanho da madeira " + (i+1));
	    	madeira[i] = Float.parseFloat(input.nextLine());
	    }

	    String frase = ((madeira[0] < madeira[1] + madeira[2]) && (madeira[1] < madeira[0] + madeira[2]) && (madeira[2] < madeira[0] + madeira[1]))?
    		"Essas 3 peças de madeira formam um Triângulo!" :
			"Essas 3 peças de madeira não formam um Triângulo!";
	    
	    System.out.println(frase);
    }
}
