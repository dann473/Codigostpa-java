package prjAula2;
import java.util.Scanner; // Importando Leitura de Dados
class AnoNascimento {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int anoAtual, anoNasc, idade;
		int limite = 2025;
		
		 while (true) {
	            System.out.print("Insira um valor (máximo " +limite+ "): ");
	            anoAtual = ler.nextInt();

	            if (anoAtual <= limite) {
	                System.out.println("Valor válido: " +limite);
	                break; // Sai do loop quando o valor é válido
	            } else {
	                System.out.println("Valor inválido! Insira um valor menor ou igual a " + limite + ".");
	            }
	        }
		 
		System.out.println("Digite o ano de Nascimento");
		anoNasc = ler.nextInt();
				
		idade = (anoAtual-anoNasc);
		System.out.println("Você tem "+idade+" anos");
	}

}
