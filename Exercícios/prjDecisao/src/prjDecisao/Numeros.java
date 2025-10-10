package prjDecisao;
import java.util.Scanner;
public class Numeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			double num;
			System.out.println("Insira o número: ");
			num = ler.nextDouble();
			
			if (num < 0){
				System.out.println("Este é um número negativo.");
			} else if (num == 0) {
				System.out.println("Este é um número neutro.");
			} else {
				System.out.println("Este é um número positivo.");
			}
			ler.close();

	}

}
