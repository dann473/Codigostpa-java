package prjAula2;
import java.util.Scanner; // Importando Leitura de Dados
class NotaExercicio {
		public static void main (String[] args) {
			Scanner ler = new Scanner(System.in);
			double nota1, nota2, media;
			System.out.println("Insira a 1a Nota:");
			nota1 = ler.nextDouble();
			System.out.println("Insira a 2a Nota:");
			nota2 = ler.nextDouble();
			media = (nota1+nota2)/2;
			
			System.out.println("Sua média é "+media+" você passou");
		}

}
