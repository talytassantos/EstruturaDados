package view;

import java.util.Scanner;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		SomatorioController sCt = new SomatorioController();
	
		System.out.print("Informe um número: ");
		int numero = sc.nextInt();
		
		if (numero < 0 ){
			System.out.println("0");
		} else {
			int somatoria = sCt.somatorio(numero);
			System.out.println("A somatória dos números naturais contidos em " 
									+ numero + " é " + somatoria);	
		}	
	}	
}
