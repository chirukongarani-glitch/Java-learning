import java.util.Scanner;
public class method {
    public static void main(String[] agrs)
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");//method are resuable code and exceutes when we called
String na=sc.nextLine();
System.out.println("Enter the type of your mood:");
String ty=sc.nextLine();
greet(na);//notice that parameter name and argument need not be same
greet(na,ty);
    }
    static void greet(String name)
    {
System.out.println("Hi"+" " +name+ "  "+"how was your day today!");
    }
    static void greet(String name,String type)//Method overloading
    /* same method name but with different parameters and can
    be different datatypes 
     */
    {
       System.out.println("Hi"+" " +name+ "  "+"how was your day today!  Is it "  +type ); 
    }
}
