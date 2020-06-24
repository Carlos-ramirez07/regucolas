package geometria;
import java.io.IOException;

public class Rombo {
    double base=0;

public Rombo() {		
}
	
public double calcularPerimetro(double valor) throws IOException {
    base = valor;	
    return base*4;
    
  }
}