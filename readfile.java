import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class readfile {
    public static void main(String[] args)
    {
String read="C:/Users/Chiranjeevi/OneDrive/Desktop/filewritesample/sa.txt";
try(BufferedReader br= new BufferedReader(new FileReader(read)))
{
    System.out.println("File found and read successfully");//java automatically calls br.close()
    String line;
    while((line=br.readLine())!=null)
    {
        System.out.println(line);
    }
}
catch(FileNotFoundException e){
    System.out.println("Couldn't find the file");
}
catch(IOException e){
    System.out.println("Buffer is not closed");
}

    }
}
