import java.util.Scanner;
import java.util.Random;
public class dice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int total=0;
        int dice;
        int roll=0;
        Random r= new Random();
        System.out.println("Enter the number of dice:");
        dice=sc.nextInt();
        
        if(dice>0)
        {
            for(int i=1;i<=dice;i++){
                 roll=r.nextInt(1,7);
                 diced(roll);
                    System.out.println("You rolled "+roll);
                     total+=roll;
            }
           
         

        }
       
        else{
            System.out. println("Dice number cannot be negative!");
        }
 System.out.println("Total number of rolls:"+total);
    }
 static void diced(int roll)
 {
    String dice1="""
            --------
            |       |
            |       |
            |   ●   |
            |       |
            |       |
            ----------
            """;
     String dice2="""
            --------
            |       |
            |       |
            |   ●   |
            |       |
            |      ●|
            ----------
            """;
               String dice3="""
            --------
            |  ●    |
            |       |
            |   ●   |
            |       |
            |      ●|
            ----------
            """;
        String dice4="""
            ------------
            |  ●    ● |
            |         |
            |         |
            |         |
            |  ●    ●|
            ----------
            """;
        String dice5="""
           ------------
            |  ●    ● |
            |         |
            |    ●    |
            |         |
            |  ●    ● |
            ----------
            """;
           
            String dice6="""
           ------------
            |  ●    ● |
            |         |
            |  ●    ● |
            |         |
            |  ●    ● |
            ----------
            """;
 
            switch(roll)
            {
                case 1->System.out.println(dice1);
             
                case 2->System.out.println(dice2);
                case 3->System.out.println(dice3);
                
                case 4->System.out.println(dice4);
                
                case 5->System.out.println(dice5);
                
                case 6->System.out.println(dice6);
                
                default->System.out.println("Invalid Dice!");
            }
        }
            
 }

    

