import java.util.Scanner;  
public class user_inputs 
{
 public static void main(String[] args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the first number");
  int a=obj.nextInt();
  System.out.println("Enter the second number");
  int b=obj.nextInt();
  int sum=a+b;
  obj.nextLine();
  System.out.println("What is your name:");
  String s=obj.nextLine();
  System.out.println("Hi "+s+" the sum is="+sum);
 }
}
