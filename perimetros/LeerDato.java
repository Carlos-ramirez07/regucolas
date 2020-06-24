package geometria;
import java.io.*;

public class LeerDato {

    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

public LeerDato() {
}
    
public float leer(float val)throws IOException{
    val = Float.parseFloat(entrada.readLine());	
    return val;
 }
    
public int leer(int val)throws IOException{
    	    	
    val = Integer.parseInt(entrada.readLine());
    return val;
}
    
public String leer()throws IOException{
    	return entrada.readLine();
        
    }
}