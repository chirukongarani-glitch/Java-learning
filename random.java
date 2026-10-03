import java.util.Random;
public class random {
    public static void main(String[] args)
    {
        System.out.println("Random number for int:");
        Random r=new Random();
        int n=r.nextInt(0,11);
         System.out.println(n);
         System.out.println("Random number for Double:");
         double n1=r.nextDouble(0,11);
          System.out.printf("%.2f\n",n1);
          boolean is=r.nextBoolean();
          System.out.print(is);
    }
}
