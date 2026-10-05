class grandparent{
    String name ="grandmother";
    int age=70;
    void grand()
    {
        System.out.println("This  is grand mother class");
    }
  
    }// this multilevel inheritance 
    /*
    1parent-->1child(single inheritance)
    grandparent-->parent-->child(multilevel)
    1child-->many parents(multiple)not possible through class
    many childs-->one parent(hierarchial)
    combination of two inheritance(hybrid) */

class parent extends grandparent{
   
    void age()
    {
        System.out.println("One my grandparent   is alive that is  my "+name+" and her age  is "+age);
    }
    
}
public class child extends parent{
    void child()
    {
        
        System.out.println("My parents age is :"+(age-30));
    }


    public static void main(String[] args)
    {
       
child c = new child();
parent p =new parent();

p.grand();
c.age();
c.child();


    }
}

