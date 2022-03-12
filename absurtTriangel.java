import java.util.Scanner;

public class absurtTriangel {
  public static void main(String[] args) {
    Scanner angel = new Scanner(System.in);
    
    System.out.print("Bir Sayı Giriniz (örn:10): ");
    int n = angel.nextInt();

    for (int i = 1; i < n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(" ");
      }
        for (int star = 1; star <= (2 * (n - i)) - 1; star++){
        System.out.print("*");
        }
        System.out.println();

    }







    angel.close();
  }
}
