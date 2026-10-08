public class composition {
    public static void main(String[] args)
    {
house h = new house("Bhogapuram",2000000,2,8,"Blue");
h.roo.rshow();
h.hshow();
    }
}
    class room{
        String color;
        int width;
        int length;
        room(String color,int width,int length)
        {
            this.color=color;
            this.width=width;
            this.length=length;

        }
        void rshow()
        {
            System.out.println("A room has "+this.length +" length "+this.width+" width");
        }
    }// it is stronger relationship than Aggreation one classhas another class object
 class house{
    String loc;
    double price;
    room roo;
    house(String loc,double price,int length,int width,String color)
    {
        this.loc=loc;
        this.price=price;
        this.roo= new room(color,length,width);
    }
    void hshow()
    {
        System.out.println("The house was nearby "+this.loc+" location  and its price is "+this.price);
    }
 }   

