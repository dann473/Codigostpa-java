package prjAvliacao;
import java.util.Scanner;
public class AnoBissexto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoInicial, anoFinal, i;
		System.out.println("Insira o ano Inicial:");
		anoInicial = ler.nextInt();
		i = anoInicial;
		System.out.println("Insira o ano Final:");
		anoFinal = ler.nextInt();
		
		while (i < anoFinal) {
			if (i%4 == 0 || i%400 == 0) {
				System.out.println(i);
			}
			i++;
			}
		}	
	}
	
