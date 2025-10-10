import java.util.*;
public class Preco {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double preco, precoVenda, lucro;
		int quant;
		preco = ler.nextDouble();
		quant = ler.nextInt();
		precoVenda = ler.nextDouble();
		
		lucro = (preco+quant)-precoVenda;
		System.out.println(lucro);
		ler.close();
	}

}
