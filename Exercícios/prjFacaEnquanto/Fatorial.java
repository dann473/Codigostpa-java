package prjFacaEnquanto;
import java.util.*;
public class Fatorial {
	 public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	  int n, i=1, f=0, r=0;
	  System.out.println("Entre com um número: ");
	  n = ler.nextInt();
	  int teste=n;
	  do {
		   n=n*i;
		   f=n;
		   r=f;
		   i++;
	  }	while (i<teste);
	  System.out.println(r);
	  ler.close();
	 }
	}

 