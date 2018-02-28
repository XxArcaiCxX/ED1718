import java.util.Scanner;

public class ED183 {

  public static void amplitude(int v[]){
    int max = v[0];
    int min = v[0];
    for(int i=1; i<v.length; i++){
      if(v[i] < min){
        min = v[i];
      }
      else if(v[i] > max){
        max = v[i];
      }
    }
    int amp = max - min;
    System.out.println(amp);
  }

  public static void media(int v[]){
    double soma = 0;
    for(int i=0; i<v.length; i++){
      soma = soma + v[i];
    }
    double media = soma / v.length;
    System.out.printf("%.2f\n", media);
  }

   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      int n = stdin.nextInt();   // Ler a quantidade de numeros que se seguem
      int v[] = new int[n];     // Cria um novo array com espaço para 10 inteiro
      for (int i=0; i<n; i++)    // Ler os numeros a partir do stdin
         v[i] = stdin.nextInt();

      media(v);
      amplitude(v);
   }
}
