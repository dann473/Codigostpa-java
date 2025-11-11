package prjVetores;

import java.util.Scanner;

public class VetorSoma {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 5;
		int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o "+ (i+1) +"o. Número:");
			a[i] = ler.nextInt();
		}
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o "+ (i+1) +"o. Número:");
			b[i] = ler.nextInt();
			c[i] = b[i]+a[i];
		}
		
		for (i = 0; i < TAM; i++) {
			System.out.print(c[i]+" ");
		}
		ler.close();
	}
}