import java.util.Scanner;
public class enume{
    public static void main(String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a weeek name:");
     
try{
       String choigy=sc.nextLine().toLowerCase();
    day d=day.valueOf(choigy);
switch(d)
{
    case sunday,saturday -> System.out.println("Weekend");
    case monday,tuesday,wednesday,thursday,friday->System.out.println("Weeday");
    default->System.out.println("Invalid day");
}
    }
    catch(IllegalArgumentException e)
    {
        System.out.println("Please enter the valid week name");
    }
}

}//enum  its a special type used to define fixed set of constants
enum day{
    sunday(1), monday(2),tuesday(3),wednesday(4),thursday(5),friday(6),saturday(7),holiday(8);
    private final int i;//when user holiday which is in enum class but not in switch then default case excutes
    day(int i)
    {
        this.i=i;

    }
    int getmethod()
    {
        return this.i;
    }
}
