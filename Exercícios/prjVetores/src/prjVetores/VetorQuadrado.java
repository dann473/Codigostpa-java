package prjVetores;
import java.util.Scanner;
public class VetorQuadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		//leitura do vetor A
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor");
			a[i] = ler.nextInt();
		}
		//cálculo
		for (i=0; i<TAM; i++) {
			b[i] = a[i] * a[i];
		}
		System.out.print("Quadrados = [ ");
		//apresentação
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		ler.close();
	}

}
	
