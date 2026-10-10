public class generics {
    public static void main(String[] args)
    {
        college<String,Integer> c=new college<>("Gitam","VSK",200);
        
      System.out.println( "My college  is at : "+ c.inform() +"  and It has  in approx. " +c.area() +"Acres "); 

    }

}/*it allows  us to write classes,interfaces and methods that can handle different datatypes
while provind the type safety and we alreday see this in   Arryalist 
*/

class college<type,ype>{
    type name;
    type place; 
    ype acres;
    college(type name,type place,ype acres)
    {
        this.name=name;
        this.place=place;
        this.acres=acres;
    }
    public type inform()
    {
        return  this.place;
    }
    public ype area()
    {
        return this.acres;
    }
}
