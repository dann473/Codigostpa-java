package prjAula2;
import java.util.Scanner;
class Imc {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double peso, altura, quadAltura, imc;
		
		System.out.println ("Insira seu peso:");
		peso = ler.nextDouble();
		
		System.out.println ("Insira sua altura:");
		altura = ler.nextDouble(); 
		
		quadAltura = altura*altura;
		imc = peso/quadAltura;
		
		System.out.println ("Seu imc é "+imc);
	}

}
