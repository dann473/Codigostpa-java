import java.util.*;
public class ImcBro {
 public static void main(String[] args) {
  Scanner ler = new Scanner (System.in);
  double imc;
  
  System.out.println("Insira seu Peso (kg): ");
  double peso = ler.nextDouble();
  System.out.println("Insira sua Altura (m): ");
  double altura = ler.nextDouble();
  
  imc = peso /(altura*altura);
  System.out.printf("Seu IMC é: %.2f\n", +imc);
  
  ler.close();
 }

}
 