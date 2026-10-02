import  java.util.Scanner;
public class Scan {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String  name=sc.nextLine();
         System.out.println("Enter your age:");
         int age=sc.nextInt();
          System.out.println("Enter your marks:");
          sc.nextLine();
          double marks= sc.nextDouble();
           System.out.println("Name: "+name+"\nage:"+age+"\nMarks :"+marks);
    }
}