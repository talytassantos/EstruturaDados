package view;

import java.util.Scanner;

import controller.InversaoController;

//import controller.InversaoController;

public class Principal {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		InversaoController ic = new InversaoController ();
		
		System.out.print("Informe a palavra: ");
		String palavra = sc.next();
		
		String invert = ic.invert(palavra);
		System.out.println("Palavra " + palavra + " invertida fica : " + invert);
	
	}

}
