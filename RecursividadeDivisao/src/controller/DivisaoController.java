package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int div(int dividendo, int divisor) {
		//Condi��o de parada
//		if (dividendo == 0) { S� funciona para divis�o exata
		if (dividendo < divisor) {
			return 0;
		} else {
			dividendo = dividendo - divisor;
			return 1 + div(dividendo, divisor);
		}
	}
	
}







