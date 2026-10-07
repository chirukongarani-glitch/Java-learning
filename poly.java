public class poly {
    public static void main(String[] args)
    {
 bus b1= new bus();

 bike bi1=new bike();
 /* bi1.concr();
 b1.another();
 b1.big();(it can excutes)
 */
 vechile[] vech={b1,bi1};
 for(vechile v:vech)
 {
    System.out.println(v);
    v.big();
    v.another();
    
 }

    }
}
   abstract class vechile{
    abstract  void another();
    void big(){
        System.out.println("A vechile can be many");
    }

    }
class bike extends vechile{
    void another()
    {
        System.out.println("A bike can have 3 passengers");//polymerphism can also possible using interfaces
    }
}
class bus extends vechile{
    void another()
    {
        System.out.println("A bus can have 20-100 passengers");
    }
}

