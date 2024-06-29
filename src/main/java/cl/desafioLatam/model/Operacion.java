package cl.desafioLatam.model;


public class Operacion {
	private int a;
	private int b;
	
	
	public Operacion(int a, int b) {

		this.a = a;
		this.b = b;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
	
	
	//Operaciones
	
	public int operacionSuma() {
	
		return a+b;
		
	}
	
	public int operacionResta() {

		return a-b;
	}
	
	
	public int operacionMultiplicacion() {
		
		
		return a*b;
	}
	
	public int operacionDivision (){
		if (b!=0) {
			return a/b;
		}
		return -99999;
		
		
	}
	
	
	
	public String operacionOrdenarNum() {
		String numerosOrdenados = String.format("%d - %d", a,b);
		if (a<b) {
			numerosOrdenados = String.format("%d - %d", b, a);
			return numerosOrdenados;
		}
		return numerosOrdenados;
	}
	
	
	
	public String[] operacionParImpar() {
		
		String numA="";
		String numB="";
		
		if(a%2==0) {
			numA = String.format("El numero %d: es Par", a);
		}else {
			
			numA = String.format("El numero %d: es Impar", a);
		}
		
		if (b%2==0) {
			numB = String.format("El numero %d: es Par", b);
		}else {
			numB = String.format("El numero %d: es Impar", b);
		}
		
		String numArray [] =  new String [2];
		numArray[0] = numA;
		numArray[1] = numB;
		
		return numArray;
	}


	@Override
	public String toString() {
		return "Operacion [a=" + a + ", b=" + b + "]";
	}
	
}
