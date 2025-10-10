import java.util.*;
public class Salario {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		double bruto, liquido;
		double inss = 8/100;
		double vale = 6/100;
		
		bruto = ler.nextDouble();
		
		liquido = (bruto)-inss-vale;
		System.out.println ("Seu Salário líquido é " +liquido);
		ler.close();
	}
}
