import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
   Scanner sc= new Scanner(System.in); 

   double height= sc.nextDouble();  
    
   double weight= sc.nextDouble();

   double bmi = (100 * 100 * weight) / (height * height);  
   System.out.println(bmi);  
  }
}
