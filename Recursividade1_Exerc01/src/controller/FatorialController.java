package controller;

public class FatorialController {
	
	public FatorialController() {
		super();
	}

	public int fatorial(int numero) {
		
		//Condição de Parada	
		if (numero <= 1) {
			return 1;
		} else {
			return numero * fatorial(numero-1);
		}		

	}
}

/* 
 * O numero passa pelo primeiro if, caso não seja <= 1, o próximo retorno realiza o calculo
 * de multiplicação chamando a propria funcao (numero-1)
 *
 **/