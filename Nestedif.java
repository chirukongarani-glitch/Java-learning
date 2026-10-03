import java.util.Scanner;
public class Nestedif {
     public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
System.out.println("Enter your sessional grade:");
        char grade;
        grade =sc.next().charAt(0);
        int marks;
        System.out.println("Enter your internal marks:");
        marks=sc.nextInt();
        if(grade=='O')
        {
            if(marks>85)
            {
                System.out.println("You  get 10 points");
            }
            else{
                System.out.println("  yoou get 9.5 points");

            }
        }
        else{
            System.out.println("you are below 9");
        }

     }
}
