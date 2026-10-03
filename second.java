import java.util.Scanner;
public class second {
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many seconds you want to count:");
        int s=sc.nextInt();
        for(int i=1;i<=s;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);

        }
        System.out.println("Happy coding");
    }
}
