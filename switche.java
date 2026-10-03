import java.util.Scanner;
public class switche{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  day of a week:");
        String day=sc.nextLine();
        switch(day)
        {
            case "Monday" -> System.out.println("We have Java class Today");
             case "Tuesday" -> System.out.println("We  don't have Java class Today");
              case "Wednesday" -> System.out.println("We have Java Lab Today");
               case "Thursday" -> System.out.println("We have Java class Today");
                case "Friday" -> System.out.println("We have Java Exam Today");
                 case "Saturday" , "Sunday"-> System.out.println("Weekend ");
                 default -> System.out.println("Not a week day");
        }
        }
}
