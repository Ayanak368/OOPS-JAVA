import java.util.Scanner;  
public class Compare 
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the first number");
int a=obj.nextInt();
System.out.println("Enter the second number");
int b=obj.nextInt();

if(a>b)
{
System.out.println("first number is larger");
}
else
{
System.out.println("second number is large");
}
}

}
