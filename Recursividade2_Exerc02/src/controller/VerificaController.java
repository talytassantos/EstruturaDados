package controller;

public class VerificaController {

	public VerificaController() {
		super();
	}
	
	public int verifica (int numero, int verificador) {
		//Condição de Parada
		if (numero == 0) {
			return 0;
		} else {
			int resto = numero % 10;
			numero = numero / 10 ;
			int inc =0;
			if (verificador == resto) {
				inc++;
			}
			return inc + verifica(numero, verificador);
		}
		
	}
	
}