import java.util.*;
public class Pesqueiro {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double kilo;
		
		System.out.println("Insira o peso do peixe(em kg): ");
		kilo = ler.nextDouble();
		
		if (kilo<=3) {
			System.out.println("O peixe custará R$12,00");
		}else if (kilo>3 && kilo<=5) {
			System.out.println("O peixe custará R$14,00");
		}else if (kilo>5 && kilo<=10) {
			System.out.println("O peixe custará R$15,00");
		} else {
			System.out.println("O peixe custará R$17,00 mais uma taxa adicional de R$8,00");
			
		}ler.close();
	}
	
}
