import java.util.*;
public class AgenciaMergulhos {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String destino;
		int dias;
		System.out.println("Digite seu destino: ilhabela ou noronha ");
		destino = in.next();
		
		if (destino.equalsIgnoreCase("Ilhabela")) {
			System.out.println("Quantos dias você vai ficar: ");
			dias = ler.nextInt();
			if (dias>=1 && dias <=5) {
				System.out.println("R$240,00 por dia");
				if (dias>=6 && dias<=10) {
					System.out.println("R$240,00 por dia + Taxa adicional de R$130,00");
				} if (dias>10) {
					System.out.println("Qual é o destino: ");
				}else if (destino.equalsIgnoreCase("Noronha")) {
					System.out.println("Quantos dias você vai ficar: ");
				}if (dias>=1 && dias<=5) {
					System.out.println("R$400,00 por dia + Taxa adicional de R$100,00");
				}if (dias>=6 && dias<=10) {
					System.out.println("R$410,00 por dia + Taxa adicional de R$150,00");
				} if (dias>10) {
					System.out.println("R$400,00 por dia + Taxa adicional de R$100,00");
				}
			}
			
		}
		ler.close();
	}

}
