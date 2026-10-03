import java.util.Scanner;
public class math{
    public static void main(String[] args)

    {Scanner sc =new Scanner(System.in);

        System.out.println(Math.round(3.5677));//if 3.49 it rounds to 3
         System.out.println(Math.ceil(8.3677));// even 3.9 also it ceils to 9
          System.out.println(Math.floor(3.2677));//it floors to 3 even 3.9
           System.out.println("Enter the radius:");
           double r=sc.nextDouble();
           System.out.println("Circumference of circle is:"+(2*Math.PI*r));
           System.out.println("Area of circle is:"+(Math.PI*Math.pow(r,2)));
           System.out.println("Volume of sphere is:"+((4.0/3.0)*Math.PI*Math.pow(r,3)));




           
           

           


    }
}
