package prjAvliacao;
import java.util.Scanner;
public class VerifIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		do {
			System.out.println("Insira o ano de Nascimento:");
			int anoNasc = ler.nextInt();
			
			System.out.println("Insira o ano Atual:");
			int anoAtual = ler.nextInt();
			
			int idade = anoAtual - anoNasc;
			System.out.println("Sua idade é: " + idade);
			
			System.out.println("Deseja Continuar? Digite 1 Para Continuar || Digite 0 para Sair");
			i = ler.nextInt();
			if (i == 1) {
				System.out.println("O Usuário Continuou.");
			} else {
				break;
			}
		} while (i == 1);
	}

}
