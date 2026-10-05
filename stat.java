public class stat{
    String friend;
   static int number;//java automatically intializes number= 0 and friend=NULL
    stat(String friend)
    {
        this.friend=friend;
        number++;
    }
    public static void main(String[] args)
    {
stat s= new stat("hanuman");
stat s1= new stat("tiruswami");
stat s2= new stat("siva");

System.out.println("Name is:"+s.friend);//for static method we no need to create a  object for accessing 
System.out.println("Name is:"+s1.friend);
System.out.println("Name is:"+s2.friend);
System.out.println(""+stat.number);//static makes variable belong to the class instead of each object.
//System.out.println(""+s1.number);
    }
    
}
