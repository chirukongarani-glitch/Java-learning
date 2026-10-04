public class constructor {
    String name; 
    int age;
    double fee;
    int skills=2;
    boolean isStudent;
    constructor(String name,int age,double fees)
    {
this.name=name;//this is refer the current object(if attributes names are same in both in class and constructor)
this.age=age;
fee=fees;//no need of this and since 2  argument is alreday passes no need  write again this.skills=skills
this.isStudent=true;
    }
    public static void main(String[] args)
    {
constructor c=new constructor("sohul",20,340000.0);//u can also take from user
constructor c2=new constructor("rahul",21,330000.0);
System.out.println("My name is "+c.name+" and my age "+c.age+"  and i have to pay "+c.fee+ " and i am student "+c.isStudent+" i have:  "+c.skills);
System.out.println("Price money is: "+c.mul(2,30000));


    }
    double mul(int skills,double fee)
    {
        return skills*fee;
    }
    
}
