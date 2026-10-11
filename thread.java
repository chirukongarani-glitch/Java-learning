import java.util.Scanner;
public class thread {
    public static void main(String[] args)
    {
        myrunnable my=new myrunnable();
        Thread t=new Thread(my);
        t.setDaemon(true);

        t.start();
        Scanner sc=new Scanner(System.in);
        System.out.println("You have only 5 seconds to enter your reg.no");
        System.out.println("Enter your number:");
int n=sc.nextInt();
System.out.println(n+" Is it your Registered number");
    }
}


class myrunnable implements Runnable{
    @Override
    public void run()
    {
    try{
    for(int i=1;i<=5;i++)
{
    Thread.sleep(1000);
    

if(i==5)
{
    System.out.println("Time is Up!");
    System.exit(0);
}
}

}
catch(InterruptedException e)
{
    System.out.println("Your thread was intercepted");
}
    }

}




