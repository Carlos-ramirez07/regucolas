package geometria;
import java.io.*;

public class Triangulo{
     double base=0, altura=0; 
	
public Triangulo() {		
}

public double calcularPerimetro(double valor) throws IOException {
     base = valor;	
     return base*3;
  }
}
