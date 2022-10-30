package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int nota1;
		int nota2; 
		int nota3;
		int nota4;
		int media;
		

		System.out.println("Digite a nota 1: ");
	nota1 = leia.nextInt();
		
		System.out.println("Digite a nota 2: ");
	nota2 = leia.nextInt();
	
	System.out.println("Digite a nota 3: ");
	nota3 = leia.nextInt();
		
		System.out.println("Digite a nota 4: ");
	nota4 = leia.nextInt();
	
	
	
			System.out.println("\nMedia Final: "  + nota1 + " + " + nota2 + " + " + nota3 + " + " + nota4 + " = " + (nota1+nota2+nota3+nota4) / 4);
			
	
	
	}
	
	

}
