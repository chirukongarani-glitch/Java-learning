import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> foods=new ArrayList<>();
        System.out.println("Enter the number of items:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String food=sc.nextLine();
            foods.add(food);

        }
        if(n>0){
            foods.remove(0);//to remove

        }
        
        System.out.println(foods);
        System.out.println("After getting:");
        if(foods.size()>2)
        {
        System.out.println(foods.get(2));//to get at particular index
        }
        System.out.println("After setting:");
        if(foods.size()>3)
        {
        System.out.println(foods.set(3,"Fish"));//toreplace
        }
        
        Collections.sort(foods);//it sorts based on unicode values
        System.out.println("After sorting:");
         System.out.println(foods);
    }
}

