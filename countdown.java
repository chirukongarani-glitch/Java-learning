import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
public class countdown {
    public static void main(String[] args )
    {

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int  choice=sc.nextInt();
        
Timer t=new Timer();
TimerTask t1=new TimerTask(){
     int count=choice;
    public void run()
    {
System.out.println(count);
count--;

    
    if(count<0)
    {
        System.out.println("Time Up!,Give me your paper");
        t.cancel();
    }
}

};
t.schedule(t1,0,1000);
    }
}
