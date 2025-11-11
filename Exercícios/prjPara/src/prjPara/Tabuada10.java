package prjPara;
import java.util.Scanner;
public class Tabuada10 {

 public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
  int i, n, r;
  for (i = 1; i<= 10; i++) {
   System.out.println("----------Tabuada do " + i + "----------");
    for (n=1; n<=10; n++) {
     r = n*i;
     System.out.println(n + "x" + i + "=" + r);
   }
  }
  ler.close();
 }

}
 