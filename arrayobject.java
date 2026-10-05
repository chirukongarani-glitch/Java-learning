import java.util.Scanner;
public class arrayobject {
    String car;
    String color;
    double price;
    public static void main(String args[])
    {
        arrayobject o=new arrayobject("red",8900000);
        arrayobject o1=new arrayobject("green",8000000);
    
    //Array of objects used to stores the references  to mulitple  objects of same class.
    //arrayobject[] arr=new arrayobject[2];
    arrayobject[] arr={o,o1};
    /*arrayobject[] arr={new arrayobject("red",8900000),

new arrayobject("green",8000000)
    };*/
    
   
   for(int i=0;i<arr.length;i++)
    {
       arr[i] =o;
    }



      

    }
    arrayobject(String color,double price)
    {
        this.color=color;
        this.price=price;
        car="creata";
        System.out.println("My car is "+car+" i like "+color+" but its price is "+price);
    }
   
    
}
