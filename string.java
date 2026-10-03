
  import java.util.Scanner;
  public class string {
  
    public static void main(String[] args)
    {
        String name="Nirantar";
        String name1="  Nirantar  ";
        String username;
        String domainname;
        System.out.println(name.toUpperCase());//toLowerCase and java strings are immutable the original name doesnt change
        System.out.println(name.charAt(2));//this is immutable also
        System.out.println(name1.trim());//removes spaces
        System.out.println(name.equalsIgnoreCase(name1));//equals also
        System.out.println(name.length());
        System.out.println(name.lastIndexOf("a"));//IndexOf
        System.out.println(name.replace("a","c"));
        System.out.println(name.contains(" "));
        System.out.println(name.isEmpty());
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Email:");
         String mail=sc.nextLine();
         if(mail.contains("@"))
         {
             username=mail.substring(0,mail.indexOf("@"));
             domainname=mail.substring(mail.indexOf("@")+1);
             System.out.println(username+" \n"+domainname);

         }
        else{
             System.out.println("The mail must contain @");

         }
         
         
        

          

sc.close();


    }
}
