package prjEscolhaCaso;
import java.util.*;
public class Meses {
 public static void main(String[] args) {
	  Scanner ler = new Scanner (System.in);
	  System.out.println("Digite um mês");
	  String mes = ler.next();
	  switch (mes) {
	  case "janeiro":
	  case "março":
	  case "maio":
	  case "julho":
	  case "agosto":
	  case "outubro":
	  case "dezembro":
		  System.out.println("Esse mês tem 31 dias");
	   break;
	  case "fevereiro":
		  System.out.println("Esse mês tem 28 dias");
	   break;
	  case "abril":
	  case "junho":
	  case "setembro":
	  case "novembro":
		  System.out.println("Esse mês tem 30 dias");
	   break;
	  default:
		  System.out.println("Inválido");
	  }
	  ler.close();
	 }
	
	}
	 
