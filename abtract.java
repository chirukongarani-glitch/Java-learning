public class abtract {
    public static void main(String args[])
    {
circle c = new circle(4.5);

System.out.println("Area of circle:"+c.area());
    }
}//abstraction is the internal implementaiton of details and shows only essiential fearures to users
    public abstract class shape{
        abstract double area();
    }
    // for abstract class we can't directly create an object but we can through their child class
    //abstract class can conatain both abstract and concrete methods 
    //abstract method forces the child to create a its own implementation
    class circle extends shape{
        double radius;
        circle(double radius)
        {
            this.radius=radius;

        }
        double  area()
        {
            return Math.PI*radius*radius;
        }
    }

