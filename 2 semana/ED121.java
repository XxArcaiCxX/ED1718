import java.util.Scanner;
import java.io.*;
public class ED121{

  public static void main(String [] args){
    Scanner stdin = new Scanner(System.in);
    int linhas = stdin.nextInt();
    for(int i=0; i<linhas; i++){
      String linha = stdin.nextLine();
      linha = linha.replaceAll("\\s+","");
      int letras = linha.length();
      if(letras % 2 == 0)
        int l = letras/2;       //par
      else
        int l = letras/2 + 1;   //impar
      boolean igual = new boolean;
      for(int j=0; j<l; j++){
        int k = l + j;
      }
    }
  }

}
