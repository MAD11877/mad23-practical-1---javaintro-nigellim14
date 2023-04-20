import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
   Scanner sc= new Scanner(System.in); 
  //System.out.print("Enter your height ");
  double height= sc.nextDouble();  
    
  //System.out.print("Enter your weight ");
  double weight= sc.nextDouble();

  double bmi = (100 * 100 * weight) / (height * height);  
  System.out.print(bmi);  
  }
}
