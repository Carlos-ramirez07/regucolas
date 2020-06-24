package geometria;
import java.io.*;

public class Rectangulo {

double base=0, altura = 0;
	
public Rectangulo() {		
}
	
public double calcularPerimetro(double valor, double valor2) throws IOException{
	base = valor;
	altura = valor2;	
	return (base*2)+(altura*2);	
   }
}
