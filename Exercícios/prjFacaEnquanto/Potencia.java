package prjFacaEnquanto;
import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	  int e, i=1, b, r=1;
	  System.out.println("Entre o Expoente: ");
	  e = ler.nextInt();
	  System.out.println("Insira a Base:");
	  b = ler.nextInt();
	  int teste=e;
	  do {
	   r=r*b;
	   i++;
	  }while (i<=teste);
	  System.out.println(r);
	  ler.close();
	 }
	
	}
