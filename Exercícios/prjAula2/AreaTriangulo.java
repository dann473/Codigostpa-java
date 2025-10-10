package prjAula2;
import java.util.Scanner;
class AreaTriangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//Declaração de variáveis
		double base, altura, area;  
		System.out.println ("Digite a base");
		base = ler.nextDouble();
		
		System.out.println ("Digite a altura");
		altura = ler.nextDouble();
		
		area = (base*altura)/2;
		System.out.println ("A área do triângulo é: "+area);
		}
}
