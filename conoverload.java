import java.util.Scanner;
class conoverload {

    String name;
    int age;
    int gpa;
    double fee;
    conoverload()
    {
this.name="Guest";
this.age=0;
this .gpa=0;
//no nee use fee also
    }
    conoverload(String name)//constructor overloading (multiple constructors within the same class with different parameters)
    {
        this.name=name;
        this.age=0;
        this .gpa=0;
        
    }
    public static  void  main(String[] args)
    {
conoverload c=new conoverload();
System.out.println("Student name:"+c.name);
System.out.println("Enter your name:");
Scanner sc = new Scanner(System.in);
String name=sc.nextLine();
conoverload c1=new conoverload(name);
System.out.println("My  actual name:  "+c1.name);
    }
    
}
