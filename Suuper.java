public class Suuper {
    String firstName;
    String lastName;
    int age;
    Suuper(String firstName,int age)
    {
        this.firstName=firstName;
        this.lastName="ban";
        this.age=age;
    }
    void display()
    {
        System.out.println("My name is:"+firstName+" "+lastName);
    }
}//super is used when parent and child hava same variables or methods or constructors
class parent extends Suuper{
parent(String firstName,int age)
{
    super(firstName,age);//same constructors
    System.out.println("My name is :"+super.firstName);
    System.out.println("And his age:"+super.age);//same variables

   
}



public static void  main(String[] args)
    {
parent r=new parent("hanish",100);
r.display();
    }
}
