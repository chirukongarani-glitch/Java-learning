import java.util.Scanner;

public class jag{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");

       int row=sc.nextInt();
       int[][] jagged=new int[row][];
       for(int i=0;i<jagged.length;i++)
       {
System.out.println("Enter the number of columns  for row " +i+":");
        int columns=sc.nextInt();
        System.out.println("Enter the column values:");
        jagged[i]=new int[columns];
        for(int j=0;j<jagged[i].length;j++)
        {
            jagged[i][j]=sc.nextInt();
        }
       }
       System.out.println("Jagged array is:");
        for(int i=0;i<jagged.length;i++)
       {
         for(int j=0;j<jagged[i].length;j++)
        {
            System.out.print(jagged[i][j]+" ");
        }
        System.out.println();
    }
    

    }
}
