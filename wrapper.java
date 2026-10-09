public class wrapper {
    public static void main(String[] args)
    {
        //Wrapper classes  are the classes  in java used to convert primitive
        //  data types into corresponding wrapper objects
          //***** Autoboxing****
        int a=9;
        Integer b=a;//this is wrapper object
        Float f=89f;//Automatically convert primitive value into  wrapper object
     System.out.println(b +" "+f);
//***Unboxing****
Double z=908.0;
double c=b;
Character m='A';//Automatically convert  wrapper object into  primitive object
char k=m;
//*** *//
String s=Integer.toString(123);//convert any primitive value into String
String s1=Double.toString(56);
String s2=Character.toString('*');
String t=s+s1+" "+s2;
System.out.println(t);
//convert   String into  integer
int A=Integer.parseInt("179");
double B=Double.parseDouble("39.0");
char C="Good".charAt(0);
System.out.println(C+" "+B);
char Z='a';
char Y='a';
char X='1';
System.out.println(Character.isLetter(Z));
System.out.println(Character.isUpperCase(Y));
System.out.println(Character.isDigit(X));

    }
}
