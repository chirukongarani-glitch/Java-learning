import java.util.Scanner;
public class Varargs {
  
     static double average(double... number)
        {
            double sum=0;
            for(double num:number)
            {
           sum+=num;
            
            }
             double avg=sum/number.length;
             return avg;
           
        }
    
    public static  void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of arguments:");
int n=sc.nextInt();
double[] number=new double[n];
System.out.println("Enter the elements");
for(int i=0;i<number.length;i++)
{
    number[i]=sc.nextInt();
}
System.out.println(average(number));
       
        
    }
}
