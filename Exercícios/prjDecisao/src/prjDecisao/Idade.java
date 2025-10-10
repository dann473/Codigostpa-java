package prjDecisao;
import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	int anoAtual, anoNasc, idade;
	System.out.println("Insira o ano em que você nasceu:");
	anoNasc = ler.nextInt();
	System.out.println("Insira o ano atual:");
	anoAtual = ler.nextInt();
	
	idade = anoAtual-anoNasc;
			System.out.println("Sua idade é de "+idade+"anos");
	
			if (idade<18) {
				System.out.println("Você é menor de idade");
				
				}else {
					System.out.println("Você é maior de idade");
					
				}

	}

}
