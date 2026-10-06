public class overird {
    public static void main(String[] args)
    {
principle p = new principle();
p.job();
teacher t=new teacher();
t.job();
student s= new student();
s.job();
    }

}
class principle{
  
    void job()
    {
        System.out.println("Diretcs and monitors the school");
    }
}
class teacher extends principle
{
    @Override 
    void job()// a child class  provides its own implementation of method that was already defined in parent class
    {
        System.out.println("Directs a paritcular class");
    }
    //method overriding relates to inheritance but overloading doesn't
}
class student extends principle{
    @Override //its not mandatory helps to override by other developers
    void job()
    {
    System.out.println("Learning or develpoing");
    }
}
