import java.util.Scanner;
import java.util.InputMismatchException;
public class exception {
    public static void main(String[] args)
    {
Scanner sc= new Scanner(System.in);

    
    

try{
      System.out.println("Enter the two numbers:");
int a= sc.nextInt();
    int b= sc.nextInt();

    
    System.out.println("Result is:"+a/b);//contains code that may cause an exception

}
catch(ArithmeticException e)
{
    System.out.println( " cannot divide by zero");//handles the exception thrown by try block
}
catch(InputMismatchException e)
{
    System.out.println("a and b values must be numbers");
}
catch(Exception e){// it can catch all unchecked exceptions mostly
    System.out.println("Something went Wrong!");
}
finally{
    System.out.println("This block is always executes");
}//contains the code that always exceutes whther the exception occurs  or not
    }
}
