package prjFacaEnquanto;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int i, a, b, cont;
	    a = 0;
	    b = 1;
	    System.out.println("Insira o número de termos que deseja ver:");
	    cont = ler.nextInt();
	    i = 1;
	    do {
	        a = a+b;
	        b = a-b;
	        System.out.println("Fibonacci " + i + ": " + a);
	        i++;
	    } while (i <= cont);
	    ler.close();
	}
	 

	 
}
