public class interfacee {
    public  static  void main(String[] args){

rabbit r= new rabbit();
deer d=new deer();
r.hunt();
d.hunt();
d.save();
    }//interface is blue print that defines a set of methods  that a class must implement
}
//Imp: in an interface a method can have a definition by using default before the method name
    public interface hunter{
        void hunt();
    }
    public interface saver{
        void save();
    }
    class rabbit implements hunter{
      public  void hunt()
        {
            System.err.println("A hunter hunts the rabbit");
        }
    }

        class deer implements hunter,saver{
           // A class can implement two or more interfaces
          public  void hunt()
            {
                System.out.println("A deer may hunt by hunter");
            }
           public  void save()
           {
            System.out.println("A saver saves many Animals");
           }
        }
    

