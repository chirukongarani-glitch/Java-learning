import java.util.Scanner;
import java.util.Random;
public class guess {
    public static void main(String[] args)
     {
        int guess;
        int attempts=0;
        Scanner sc=new Scanner(System.in);
        int min,max;
        System.out.println("Enter the min number for guessing:");
        min=sc.nextInt();
          System.out.println("Enter the max number for guessing:");
          max=sc.nextInt();
          Random r=new Random();
          int a=r.nextInt(min,max);
          do{
              System.out.println("Guess the number:");
            guess=sc.nextInt();
            attempts++;
            if(guess<a){
                  System.out.println("Too Low!");
            }
            else if(guess>a)
            {
                  System.out.println("Too High!");
            }
            else
            {
                  System.out.println("Correct");
            }

          } while(a!=guess);
  System.out.println("You won after"+attempts+"Attempts");
     }


}
