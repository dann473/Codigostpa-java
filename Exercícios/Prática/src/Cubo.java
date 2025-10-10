import java.util.*;
public class Cubo {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		double v, l;
		System.out.println("Insira o Lado.");
		l = ler.nextDouble();
		
		v = l*l*l;
		System.out.println("O Volume do Cubo é: " +v);
		ler.close();
	}

}
