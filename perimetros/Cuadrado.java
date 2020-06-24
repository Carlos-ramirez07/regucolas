package geometria;
import java.io.*;

public class Cuadrado{
     double base=0;
	
public Cuadrado() {		
}
	
public double calcularPerimetro(double valor) throws IOException {
     base = valor;	
     return base*4;
  }
}