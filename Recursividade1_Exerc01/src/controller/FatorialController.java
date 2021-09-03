package controller;

public class FatorialController {
	
	public FatorialController() {
		super();
	}

	public int fatorial(int numero) {
		
		//Condi��o de Parada	
		if (numero <= 1) {
			return 1;
		} else {
			return numero * fatorial(numero-1);
		}		

	}
}

/* 
 * O numero passa pelo primeiro if, caso n�o seja <= 1, o pr�ximo retorno realiza o calculo
 * de multiplica��o chamando a propria funcao (numero-1)
 *
 **/