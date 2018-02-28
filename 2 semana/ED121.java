import java.util.Scanner;
import java.io.*;
public class ED121{

  public static void main(String [] args){
    Scanner stdin = new Scanner(System.in);
    int linhas = stdin.nextInt();
    int l = 0;
    int k = 0;
    String lixo = stdin.nextLine();
    System.out.println(linhas);
    for(int i=0; i<linhas; i++){
      String linha = stdin.nextLine();
      linha = linha.replaceAll("\\s+","");
      int letras = linha.length();
        l = letras/2;
      int flag = 0;
      for(int j=0; j<l; j++){
        k = letras - 1 - j;
        if(linha.charAt(j) != linha.charAt(k))
          flag = 1;
      }
      if(flag == 0)
        System.out.println("Sim");
      else if(flag == 1)
        System.out.println("Nao");
    }
  }
}
