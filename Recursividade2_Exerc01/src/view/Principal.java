package view;

import java.util.Scanner;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		SomatorioController sCt = new SomatorioController();
	
		System.out.print("Informe um n�mero: ");
		int numero = sc.nextInt();
		
		if (numero < 0 ){
			System.out.println("0");
		} else {
			int somatoria = sCt.somatorio(numero);
			System.out.println("A somat�ria dos n�meros naturais contidos em " 
									+ numero + " � " + somatoria);	
		}	
	}	
}
