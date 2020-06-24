package geometria;

import java.io.*;

public class Circulo{
	double radio=0, pi=3.1416;
	
	public Circulo(){
		
	}
	
	public double calcularPerimetro(double valor) throws IOException {
		radio = valor;
		
		return (radio*radio)*pi;
	}


}
