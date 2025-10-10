import java.util.*;
public class LataOleo {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double r, h, v;
		System.out.println("Insira o raio da lata");
		r = ler.nextDouble();
		System.out.println("Insira a altura da lata");
		h = ler.nextDouble();
		v = 3.14*(r*r)*h;
		
		System.out.println("O volume da lata é: "+v);
		
		ler.close();
	}

}
