public class poly1 {
    public static void main(String[] args)
    {
        parent p1=new child();
        parent p2=new children();
        p1.work();
        p2.work();//this is how polymorphism works

    }
}//a same method name can behave in different ways based on objects
    interface parent{// i same as public interface parent
void work();
}
 class child implements parent{
    public void work()
    {
        System.out.println("Parents work hard for thier children");
    }
}//This is Run time polymorphism
public class children implements parent{
    public void work()
    {
        System.out.println("Parent can do anything for thier children");
    }
}
