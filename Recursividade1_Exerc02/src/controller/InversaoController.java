package controller;

public class InversaoController {
	
	public InversaoController() {
		super();
	}
	
	public String invert(String palavra) {
		
		//Condição de parada
		if (palavra.length() == 0) {
			return "";
		} else {
			return palavra.substring(palavra.length()-1) + 
					invert(palavra.substring(0, palavra.length()-1));

//			return invert(palavra.length()-1) ;
//			return palavra.substring(palavra.length());
		}
	}

}