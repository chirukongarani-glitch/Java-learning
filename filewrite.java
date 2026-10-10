import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class filewrite {
    public static void main(String[] args)
    {
        String content="""
            Hello,This is James Gosling
            developer of Java at
            Sun microsystems  ok 
            """;// we can create and use  files in vs code instead of creating a folders 
try( FileWriter wr=new FileWriter("C:/Users/Chiranjeevi/OneDrive/Deskop/filewritesample/sa.txt"))
{
   // FileWriter wr=new FileWriter("sample.txt");//IT is also fine
    wr.write(content);
   // wr.close();  Removed wr.close() because try-with-resources closes the writer automatically
    System.out.println("File is written Successfully");
}
/*scatch(FileNotFoundException e){
    System.out.println("Couldn't find the file location");//location of file like desktop download
}*/
catch(IOException e)
{
    System.out.println("You cannot write into this File");
}

    }
}
