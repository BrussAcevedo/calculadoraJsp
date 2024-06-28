package cl.desafioLatam.utilidad;

import cl.desafioLatam.exceptions.NumeroNoEnteroException;

public class Utilidad {


	
	public static int parsearValidarEntero(String numeroStr) throws NumeroNoEnteroException {
		
		if(numeroStr.matches("\\d+")) {
			return Integer.parseInt(numeroStr);
			 
		}
		throw new NumeroNoEnteroException("Dato de entrada no es entero.");
		
		
	}
	
}
