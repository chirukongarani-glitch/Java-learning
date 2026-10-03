public class scope {
     static int x=5;//class level variable 
    //class-level variable can be accessed inside the methods of its class.
    public static void main(String[] args)
    {
        int y=3;// local accessible only inside its method
        System.out.println(x+" "+y);
        method();
    }
   static void method()
    {
         int z=9;
        System.out.println(z);/*but  for y gives error bcz the local variable 
        can be accesible only within its method or block*/
    }
}
