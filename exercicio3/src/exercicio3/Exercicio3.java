package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int salariobruto;
		int adnoturno; 
		int he;
		int desc;
		int saliquido;
		

		System.out.println("Digite o Salario Bruto: ");
	salariobruto = leia.nextInt();
		
		System.out.println("Digite o Adicional Noturno: ");
	adnoturno = leia.nextInt();
	
	System.out.println("Digite a Quantidade de HE: ");
	he = leia.nextInt();
		
		System.out.println("Digite o Valor dos Descontos: ");
	desc = leia.nextInt();
	
	saliquido = ((salariobruto+adnoturno+(he*5))-desc);
	
	System.out.println("Seu SAlario Liquido =" + (saliquido));
	
	
	}
	
	

}
