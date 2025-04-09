import java.util.Scanner;

class operation 
{
 public static void main(String[] args) 
{
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter the first number: ");
   double num1 = scanner.nextDouble();
   System.out.print("Enter the second number: ");
   double num2 = scanner.nextDouble();
   double result; 
            
   while (true) {
      System.out.println("\n--- Menu ---");
      System.out.println("1.Add");
      System.out.println("2.Subtract");
      System.out.println("3.Multiply");
      System.out.println("4.Divide");
      System.out.println("5.Exit");
      System.out.print("Choose an option (1-5): ");
      int choice = scanner.nextInt(); 
   switch (choice) {
       case 1: 
             result = num1 + num2;
             System.out.println("Result: "+ result);
             break;
       case 2: 
              result = num1 - num2;
              System.out.println("Result: "+ result);
              break;
       case 3:  
              result = num1 * num2;
              System.out.println("Result: "+ result);
              break;
       case 4:  
              if (num2 != 0)
              {
                 result = num1 / num2;
                 System.out.println("Result: "+ result);
               }
              else
                {
                  System.out.println("in valid inputs");
                }
                 break;
       case 5:
              System.out.println("exit!!!");
              System.exit(0);
       default: 
              System.out.println("Invalid choice");
            }
        }

    }
}

