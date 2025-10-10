package prjLacosDois;
import java.util.*;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1;
		int idade;
		double quant15 = 0, quant30 = 0, quant45=0, quant60=0, quant61=0 ;
		while (i<=10) {
			System.out.println("Entre com a idade do "+i+"o usuário");
			idade = ler.nextInt();
			if(idade<=15) {
				quant15++;
			}else if (idade<=30) {
				quant30++;
			}else if (idade<=45) {
				quant45++;
			}else if (idade<=60) {
				quant60++;
			}else {
				quant61++;
			}
			i++;
		}
		System.out.println(quant15/100+"% dos usuário tem até 15 anos");
		System.out.println(quant30/100+"% dos usuário tem entre 16 e 30 anos");
		System.out.println(quant45/100+"% dos usuário tem entre 31 e 45 anos");
		System.out.println(quant60/100+"% dos usuário tem entre 46 e 60 anos");
		System.out.println(quant61/100+"% dos usuário tem mais de 61 anos");
	}
	
}
