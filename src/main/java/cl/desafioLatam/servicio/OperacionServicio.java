package cl.desafioLatam.servicio;

import cl.desafioLatam.model.Operacion;

public class OperacionServicio {

	private Operacion operacion;
	private String entradaOperacion;
	

public OperacionServicio(Operacion operacion, String entradaOperacion) {
	
		this.operacion = operacion;
		this.entradaOperacion = entradaOperacion;
	}



public Operacion getOperacion() {
	return operacion;
}



public void setOperacion(Operacion operacion) {
	this.operacion = operacion;
}



public String getEntradaOperacion() {
	return entradaOperacion;
}



public void setEntradaOperacion(String entradaOperacion) {
	this.entradaOperacion = entradaOperacion;
}



public String seleccionOperacion() {
	String resultado;
	
	switch (entradaOperacion) {
	case "suma": {
		resultado = servicioSuma();
		break;
	}
	case "resta": {
		resultado = servicioResta();
		break;
	}
	case "multiplicacion": {
		resultado = servicioMultiplicacion();
		break;
	}
	case "division": {
		resultado = servicioDivision();
		break;
	}
	case "ordenarNum": {
		resultado = servicioOrdenar();
		break;
	}
	
	case "parImpar": {
		resultado = servicioParImpar();
		break;
	}
	
	default:
		throw new IllegalArgumentException("Error en la entrada de dato: " + entradaOperacion);
	}
	
	return resultado;
	
}
	
	public String servicioSuma() {
		return String.format("El resultado de %d + %d es, %d", operacion.getA(), operacion.getB(),operacion.operacionSuma());
		
	}
	
	
	public String servicioResta() {
		return String.format("El resultado de %d - %d es, %d", operacion.getA(), operacion.getB(),operacion.operacionResta());
		
	}
	
	public String servicioMultiplicacion() {
		return String.format("El resultado de %d * %d es, %d", operacion.getA(), operacion.getB(),operacion.operacionMultiplicacion());
		
	}
	
	public String servicioDivision() {
		return String.format("El resultado de %d / %d es, %d", operacion.getA(), operacion.getB(),operacion.operacionDivision());
		
	}
	
	
	public String servicioOrdenar() {
		return "Numeros Ordenados de mayor a menor: ,"+ operacion.operacionOrdenarNum();
		
	}
	
	
	public String servicioParImpar() {
		String []arreglo = operacion.operacionParImpar();
		
		String resultado = (arreglo[0]+"\n" + arreglo[1]);
		
		return resultado;
	}
}
