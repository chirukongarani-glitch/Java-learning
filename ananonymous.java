public class ananonymous {
    public static void main(String[] args)
    { btech b = new btech();
        btech b1=new btech(){
              @Override 
        void duration()
        {
            System.out.println("The duration of inter is 2 years");
        }
        };
b.duration();
b1.duration();
    }
}
    class btech{
        void duration()
        {
            System.out.println("The duration of Btech is 4 years");
        }
    }
    /*class inter extends btech{
        @Override 
        void duration()
        {
            System.out.println("The duration of inter is 2 years");
        }
    }
*///instead of creating another class we use ananonymous class the class without name

