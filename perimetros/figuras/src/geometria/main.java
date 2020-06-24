package geometria;
import java.io.*; 
public class main {
	static LeerDato objLeer =  new LeerDato();
	static Cola objCola = new Cola();
	
	public static int menu(int op, int cont)throws IOException {
		do {
			System.out.println(" ");
			System.out.println("Bienvenido a este programa que calcula perimetros.");
			System.out.println(" ");
			System.out.println("¿Que figura "+cont+" deseas calcular?");
			System.out.println("1) Rombo, 2) Rectangulo, 3) Cuadrado, 4) Circulo y  5) triangulo equi");
			System.out.println("6.- imprimir");
			System.out.println("Elige una opcion -- > ");
			op = Integer.parseInt(objLeer.leer());
		    if(op < 1 || op > 6)
		      System.out.println("\n¡¡¡Error!!! Las opciones van de 1 a 6");
		   }while(op < 1 || op > 6);
		return(op);
	}

	public static void main(String[] args) throws IOException {
		int op=0, Max=9, cont = 0;
		double cola[]= new double [9];
		do {

			cont = cont+1;
			op=menu(op, cont);
			switch(op){
			case 1:
				System.out.println("Dame uno de sus lados");
				objCola.insertar_cs(cola, Max, 1);
				break;
			case 2:
				System.out.println("Dame su lado mas corto");
				objCola.insertar_cs(cola, Max, 2);
				break;
			case 3:
				System.out.println("Dame uno de sus lados");
				objCola.insertar_cs(cola, Max, 3);
				break;
			case 4:
				System.out.println("Dame su diametro");
				objCola.insertar_cs(cola, Max, 4);
				break;
			case 5:
				System.out.println("Dame uno de sus lados");
				objCola.insertar_cs(cola, Max, 5);
				break;
			case 6:
				System.out.println("\n IMPRESION");
				objCola.imprimir(cola, cont);
				break;
			}
		}while(op!=6);
	}

}
