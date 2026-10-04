import java.util.Scanner;
public class quiz {
    public static void main(String[] args)
    {
        String[] questions={
            "Who is the father of Java?","OOP stands for?","What is the String Datatype?"
        };
        String[][] options={{"1.James Gosling","2.Charles Baggage","3.Isacc Newton","4.None"},
    {"1.Object oriented programming","2.old object programming","3.None","4.Object oriented primary language"},{"1.Primitive","2.Reference ","3.Non-primitve","4.Both 2&3"}
};
    
    Scanner sc=new Scanner(System.in);
    int guess;
    int[] answers={1,1,4};
    int score=0;
    System.out.println("******Welcome to Java QUiz******");
    for(int i=0;i<questions.length;i++)
    {
        System.out.println(questions[i]);
    
    for(int j=0;j<options[i].length;j++)
    {
        System.out.println(options[i][j]);
    }
    guess=sc.nextInt();
   
    if(guess==answers[i])
    {
        System.out.println("Correct $");
        score++;
    }
    else{
        System.out.println(" Sorry Wrong!");
    }
    System.out.println("Total score is:"+score +"out of" +questions.length);

}

}

    
}
