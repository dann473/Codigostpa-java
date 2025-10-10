package prjAula2;
import java.util.Scanner;
class ConversaoDias {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double dias, meses, anos;
		
		System.out.println("Insira o numero de Dias:");
		dias = ler.nextDouble();
		
		meses = dias/30;
		System.out.println("O numero de Meses é "+meses);
		
		anos = dias/365;
		System.out.println("O numero de Anos é "+anos);
	}
}
