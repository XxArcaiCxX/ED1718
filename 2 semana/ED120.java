import java.util.Scanner;
public class ED120{

  public static void losanbot(int i, int n){
    int m = i;
    for(int j=0; j<m; j++){
      System.out.print(".");
    }
    int v = n - (2 * m);
    for(int j=0; j<v; j++){
      System.out.print("#");
    }
    for(int j=0; j<m; j++){
      System.out.print(".");
    }
    System.out.print("\n");
  }


  public static void losantop(int i, int n){
    int m = n/2 - i;
    for(int j=0; j<m; j++){
      System.out.print(".");
    }
    int v = n - (2 * m);
    for(int j=0; j<v; j++){
      System.out.print("#");
    }
    for(int j=0; j<m; j++){
      System.out.print(".");
    }
    System.out.print("\n");
  }


  public static void main(String [] args){
    Scanner stdin = new Scanner(System.in);
    int n = stdin.nextInt();
    int m = n/2;
    for(int i=0; i<=m; i++){
      losantop(i, n);
    }
    for(int i=1; i<=m; i++){
      losanbot(i, n);
    }
  }
}
