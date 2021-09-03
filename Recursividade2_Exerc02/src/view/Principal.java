package view;

import java.util.Scanner;

import controller.VerificaController;

public class Principal {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		VerificaController vCt = new VerificaController ();
		
		System.out.print("Informe um número inteiro: ");
		int numero = sc.nextInt();
		
		if (numero < 10 && numero > 999999) {
			System.err.println("-------------------------------------");
			System.err.println("              ATENÇÃO                ");
			System.err.println("O número deve estar entre 10 e 999999");
			System.err.println("-------------------------------------");
		} else {
			System.out.print("Informe o numero verificador: ");
			int verificador = sc.nextInt();
			
			if (verificador >= 0 && verificador <= 9) {

				int inc = vCt.verifica(numero, verificador);
				System.out.println("Digito " + numero + " aparece " + inc + " vezes");
				
			} else {
				System.out.println("O digito deve estar entre 0 e 9");
			}
			
			
		}
		
		
	}

}
