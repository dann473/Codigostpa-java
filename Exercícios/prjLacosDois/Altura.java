package prjLacosDois;
public class Altura {

 public static void main(String[] args) {
  double joao, pedro;
  int i;
  
  i = 1;
  joao = 1.34;
  pedro = 1.45;
  while (joao<pedro) {
   joao = joao+2.5;
   pedro = pedro +2;
   i++;
  }
  System.out.println("João demorará "+i+" anos para ficar mais alto que Pedro.");
 }

}
 