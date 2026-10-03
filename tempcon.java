import java.util.Scanner;
public class tempcon {
    
    public static void main(String args[])
    {
        System.out.println("Enter the temperature:");
        Scanner sc= new Scanner(System.in);
        double temp=sc.nextDouble();
        System.out.println("Enter the units from what to convert (c or f):");
        String t=sc.next().toUpperCase();
       double n= (t=="C")?((temp-32)*5/9):((temp*5/9)+32);
        System.out.println("Temperature is :"+n+ "°");//alt+0176

        
    }
}
