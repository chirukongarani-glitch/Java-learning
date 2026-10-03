import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    boolean isfruit=false;
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    sc.nextLine();
    String[] fruits=new  String[n];
      System.out.print("Enter the fruits:");
    for(int i=0;i<fruits.length;i++)

    {
      
        fruits[i]=sc.nextLine();
    }
            System.out.println("Fruits are:");

     for(int i=0;i<fruits.length;i++)
    {
       
    
        System.out.println(" "+fruits[i]);
    }
 Arrays.sort(fruits);
 System.out.println("Sorting:"+Arrays.toString(fruits));//Arrays are muttable in Java
 System.out.println("Enter your target fruit:");
 String target=sc.nextLine();
  for(int i=0;i<fruits.length;i++)
  {
    if(target.equalsIgnoreCase(fruits[i]))/*dont use target==fruits[i] bcz it compares
     only refernces(Address) not actual values since Arrays are reference data not primitive datatypes*/
    {
        System.out.println("The target element is found at "+i);
        isfruit=true;
        break;
    }
    
  }
  if(!isfruit){
    System.out.println(target+ "Not found!");
  }
  Arrays.fill(fruits,"Pineapple");
  System.out.println("Filling:"+Arrays.toString(fruits));

} 
}
