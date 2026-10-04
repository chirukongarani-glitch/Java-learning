import java.util.Scanner;
import java.util.Random;
public class rps {
    public static void main(String[] args)
    {
        String[]  choice={"rock","paper","scissor"};
        String user;
        String playAgain="yes";
        Scanner sc=new Scanner(System.in);
        String computer;
        Random r=new Random();
        
        do{
            System.out.println("Enter your choice:");
        user=sc.nextLine().toLowerCase();
        if(!user.equals("rock")&&!user.equals("paper")&&!user.equals("scissor"))
        {
            System.out.println("Invalid choice!");
            continue;
        }
   
        computer=choice[r.nextInt(3)];
        System.out.println("computer choice:"+computer);
        if(user.equals(computer))
        {
            System.out.println("Tie#");
        }
        else if(user.equals("paper")&&computer.equals("rock")||user.equals("rock")&& computer.equals("scissor")||user.equals("scissor")&&computer.equals("paper"))
        {
            System.out.println("You won$");
        }
        else{
            System.out.println("You lost!");
        }
        System.out.println("You want play again:");
        playAgain=sc.nextLine().toLowerCase();

    }while(playAgain.equals("yes"));
    }
}
