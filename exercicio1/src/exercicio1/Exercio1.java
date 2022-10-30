package exercicio1;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int salario;
		int abono; 

		System.out.println("Digite o salario: ");
	salario = leia.nextInt();
		
		System.out.println("Digite o abono: ");
	abono = leia.nextInt();
	
			System.out.println("\n" + salario + " + " + abono + "= " + (salario+abono));
			
	
	
	}
	
	

}
