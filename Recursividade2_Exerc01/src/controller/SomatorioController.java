package controller;

public class SomatorioController {

	public SomatorioController() {
		super();
	}
	
	public int somatorio(int numero) {
		
		//Condi��o de parada
		if (numero == 0) {
			return 0;
		} else {
			return numero + somatorio(numero-1);
		}
		
	}
	
}
