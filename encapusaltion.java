public class encapusaltion {
    public  static void main(String[] args)
    {
student s= new student("Hanish",20,99,'A');
//System.out.println(+s.grade); it gives ASCII value of O
//s.age=21; we cant change without  usin setter method beacuse it is private
s.grade='O';
s.setName("Venkat");
//s.setMarks(98);
System.out.println("The highest grade is:"+s.grade+ "  his name is "+s.getName()+ " and his age is  "+s.getage());
    }
}
    class student{
        private String name;
        private int age;
        private  final double marks;//we cant its value once assigned even with setter method also
        char grade;
        student(String name,int age,double marks,char grade)
        {
           this.name=name;
           this.age=age;
           this.marks=marks;
           this.grade=grade; 
        }
        public  String getName()//Yes, for the standard definition of a getter, it should not have parameters
        {
            return this.name;//the getter  method makes the field readable
        }
        public  double getage()// its just the name  we can abc also as getter method name
        {
return this.age;
        }
        void setName(String name){
            this.name=name;
        }
        //now we can change the name only not marks and without final keyword we can change the marks  also by using setter method
       /*  void setMarks(double marks){
            this.marks=marks;
        } 
        */
    }
