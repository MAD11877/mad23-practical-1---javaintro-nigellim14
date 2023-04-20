import java.util.Scanner;
public class Question4
{
  public static void main(String[] args)
  {
     Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a, b;
        for(a = n; a <= n; a--) {
            for(b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
  }
}

