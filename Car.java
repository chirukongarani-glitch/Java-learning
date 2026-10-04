public class Car {
    String name="creta";
    String modelname="tophand";
    double price=2400000.0;
    int year=2025;
    public static void main(String[] args)
    {
        Car c1=new Car();//here c1 is refernce variable that refers the object and new car() is actually creates an object
        System.out.println(c1.name);
        c1.driver();
        Car c2=new Car();
          System.out.println(c2.name);//which also gives same output
         
          System.out.println("After 5 years the price is "+ c1.afterYears(500000));
    }
    void driver()
    {
        System.out.println("Chetan was the driver of "+name+"car");
    }
    double afterYears(double p)
    {
        
        return  price-p;
    }
    
}
