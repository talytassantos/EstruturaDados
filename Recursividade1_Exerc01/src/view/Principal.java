package view;

import java.util.Scanner;

import controller.FatorialController;

public class Principal {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		FatorialController fc = new FatorialController();
		
		System.out.print("Entre com um n�mero: ");
		int numero = sc.nextInt();
		
		if (numero < 0 || numero > 12) {
			System.err.println("----------------------------------");
			System.err.println("              ATEN��O             ");
			System.err.println(" O n�mero deve estar entre 0 e 12 ");
			System.err.println("----------------------------------");
		} else {
			int fatorial = fc.fatorial(numero);
			System.out.println("O fatorial de " + numero + " � " + fatorial);	
		}
		
	}

}
