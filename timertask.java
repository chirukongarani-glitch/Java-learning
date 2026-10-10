import java.util.Timer;
import java.util.TimerTask;
public class timertask {
    public static void main(String[] args)
    {
Timer t= new Timer();
TimerTask tt= new TimerTask() {
    int count=3;
    @Override 
    public void run(){
        System.out.println("Hello,Java!");
        count--;
if(count==0)
{
    System.out.println("Task is completed");
    t.cancel();
}
    }
};


//t.schedule(tt,1000);it delays 1 second
t.schedule(tt,0,1000);

    }
}
