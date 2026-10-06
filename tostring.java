public class tostring {
    
    public static void main(String[] args)
    {
        cow c =new cow("milk","grass",4.5);
        System.out.println(c);//c.toString also fine  and without   toString method we get only adress of object c

    }
}
// used to  represent an object as a string
    class cow{
        String produce;
    String eat;
    double liter;

        cow(String produce,String eat,double liter)
        {
            this.produce=produce;
            this.eat=eat;
            this.liter=liter;
        }
        
        public String toString()
        {
return "The cow gives "+produce + " and eats "+ " it may give "+liter;
        }
    }
