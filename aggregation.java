public class aggregation {
    public static void main(String[] args)
    {
books b= new books("JAVA","James Gosling",1499);
books b1= new books("C","Dinneis ritche",8999);
books b2= new books("PYTHON","Gudio Van Rossam",1299);
books[] book={b,b1,b2};
/*for(books boo:book){
    boo.bookdisplay();
}*/
library l= new library("KRC","Vishkapatnam",book);
l.libdisplay();
    }
}
/*
In aggregation, the Library class refers to Book objects, 
but the Book objects can exist independently without depending 
on the Library object. */
    class books{
        String name;
        String publisher;
        int pages;
        books(String name,String publisher,int pages)
        {
            this.name=name;
            this.publisher=publisher;
            this.pages=pages;

        }
        void bookdisplay()
        {
        System.out.println("Name of the  book is "+name+"  publisher by "+publisher+" it has "+pages+" pages");
        }
    }
    class library{
        String name;
        String loc;
        books[] book;
        library(String name,String  loc,books[] book)
        {
            this.name=name;
            this.loc=loc;
            this.book=book;
        }
        void libdisplay()
        { 
            System.out.println("Name of the library is " +name+" was in the "+loc);
            for(books boo:book){
    boo.bookdisplay();
}

        }
    }
