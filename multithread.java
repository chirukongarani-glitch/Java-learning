public class multithread {
   public static void main(String[] args)
   {
myrunnable run = new myrunnable("Kit");

Thread tr=new Thread(run);
Thread tr1=new Thread(new myrunnable("Kat"));
 System.out.println("Game starts");
tr.start();
tr1.start();
try{//The purpose of join() in Java is to make one thread wait until another thread finishes its execution.
tr.join();
tr1.join();
}
catch(InterruptedException e)
{
    System.out.println(" Sorry! Interception ocuurs");
}

 System.out.println("Game ends");
   } 
}
   class myrunnable implements Runnable{
    String text;
    myrunnable(String text)
    {
        this.text=text;
    }
    
    public void run()
    {
        try{
            for(int i=0;i<=6;i++)
            {
                Thread.sleep(1000);
               // System.out.println(i);
              // System.out.println(Thread.currentThread().getName());
             
              System.out.println(text);
             

            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Threads are Intercepted");
        }
    }
   }
   
