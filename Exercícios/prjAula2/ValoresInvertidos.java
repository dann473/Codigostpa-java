package prjAula2;
import java.util.Scanner;
class ValoresInvertidos {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double valor1, valor2, valor3;
		
		System.out.println ("Insira o valor A:");
		valor1 = ler.nextDouble();
		
		System.out.println ("Insira o valor B:");
		valor2 = ler.nextDouble();
		
		valor3 = valor1;
		valor1 = valor2;
		valor2 = valor3;
		
		System.out.println ("O valor A agora é "+valor1 +" e o valor B agora é " +valor2);
		
		
	}

}
