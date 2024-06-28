package cl.desafioLatam.exceptions;

public class NumeroNoEnteroException extends Exception{


	private static final long serialVersionUID = 1L;

	public NumeroNoEnteroException (String mensaje) {
		super(mensaje);
	}
}
