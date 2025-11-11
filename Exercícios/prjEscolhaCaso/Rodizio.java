package prjEscolhaCaso;
import java.util.*;
public class Rodizio {
 public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
  
  System.out.println("Insira o final da sua placa:");
  int finalPlaca = ler.nextInt();
  
  switch(finalPlaca) {
   case 1:
   case 2:
	   System.out.println("Seu Rodízio é Segunda");
    break;
   case 3:
   case 4:
	   System.out.println("Seu Rodízio é Terça");
    break;
   case 5:
   case 6:
	   System.out.println("Seu Rodízio é Quarta");
    break;
   case 7:
   case 8:
	   System.out.println("Seu Rodízio é Quinta");
    break;
   case 9:
   case 0:
	   System.out.println("Seu Rodízio é Sexta");
    break;
   default:
	   System.out.println("Inválido.");
  }
  ler.close();
 }

}
 
