package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1;
		int num2; 
		int num3;
		int num4;
		int dif;
		

		System.out.println("Digite o primeiro numero: ");
	num1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
	num2 = leia.nextInt();
	
	System.out.println("Digite terceiro numero: ");
	num3 = leia.nextInt();
		
		System.out.println("Digite o quarto numero: ");
	num4 = leia.nextInt();
	
	dif =(num1*num2) - (num3*num4); 
	
	System.out.println("Diferença =" + (dif));
	
	}
	
	}