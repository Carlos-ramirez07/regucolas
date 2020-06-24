package geometria;
import java.io.*;
public class Cola {
	
	LeerDato objLeer =  new LeerDato();
	Cuadrado objCuadrado = new Cuadrado();
	Circulo objCirculo = new Circulo();
	Triangulo objTriangulo = new Triangulo();
	Rectangulo objRectangulo = new Rectangulo();
	
	Rombo objRombo=new Rombo();
	public int frente=-1, fin=-1, f=0, c=0;
    public Cola(){
    	 }
//=====================================================================COLA SIMPLE============================================================================//
//------------------------------------------INSERCION---------------------------------------//
   public void insertar_cs(double [] cola, int Max, int op)throws IOException{
	   double valor=0, valor2 = 0, perimetro=0;
		   
	   if(fin<Max-1) {
			   if (op != 2) {
				   valor =objLeer.leer(0);
			}else {
				valor =objLeer.leer(0);
				System.out.println("inserte el valor del lado mas largo");
				valor2 =objLeer.leer(0);
			}
		   
			   if (op==1) {
				   perimetro = objRombo.calcularPerimetro(valor);
				   cola[++fin]=perimetro;
			   }
			   if (op==2) {
				   perimetro = objRectangulo.calcularPerimetro(valor, valor2);
				   cola[++fin]=perimetro;
			   }
			   if (op==3) {
				   perimetro = objCuadrado.calcularPerimetro(valor);
				   cola[++fin]=perimetro;
			   }
			   if (op==4) {
				   perimetro = objCirculo.calcularPerimetro(valor);
				   cola[++fin]=perimetro;
			   }
			   if (op==5) {
				   perimetro = objTriangulo.calcularPerimetro(valor);
				   cola[++fin]=perimetro;
			   }
		   System.out.println("Dato insertado correctamente");
		     if(fin==0)
		    	 frente=0;
	   }
	   else
		   System.out.println("Cola llena"); 
   }
//------------------------------------------ELIMINACION-------------------------------------//
   public void eliminar_cs(String [] cola, int Max, boolean ban)throws IOException{
	  if(frente!=-1) {
		  if(ban)
		cola[frente]="";
		  if(frente==fin) {
			  frente=-1;
		      fin=-1; 
		  }	  
		  else 
			  ++frente;
		  
	  }
	  else
		  System.out.println("\n\n ¡¡COLA VACIA!!");   
		
	  
   }
   
   public void imprimir(double[] cola,int cont)throws IOException { 
	   System.out.println(" Los perimetros son ");
	   	for(f=0; f<cont-1; f++) {
	   		System.out.print(" Figura: "+f+1+"  ");
	   		System.out.println("|"+cola[f]+"|");
	   		
	   	}
	   }
 //==================================================================== FIN COLA SIMPLE ====================================================================//	       
	}

   
   

