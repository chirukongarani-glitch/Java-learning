import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class datetime {
    public static void main(String[] args)
    {
       // LocalTime time=LocalTime.now();
        //LocalDate date=LocalDate.now();
       // LocalDateTime dame=LocalDateTime.now();
       LocalDateTime damo=LocalDateTime.of(2002,06,20,2,20,34);
        LocalDateTime damo1=LocalDateTime.of(2006,05,23,1,50,34);
        if(damo.isBefore(damo1))
        {
            System.out.println("That's good Time");
        }
        else if(damo.isAfter(damo1))
        {
            System.out.println("That's not good");
        }
        else if(damo.isEqual(damo1))
        {
            System.out.println("Ah! that's may not possible");
        }
        else
        {
            System.out.println("Invalid Anyway!");
        }
        System.out.println(damo);
        DateTimeFormatter forma=DateTimeFormatter.ofPattern("dd-MM-yy  HH:mm:ss");
        String format=damo.format(forma);
        System.out.println(format);
    }
    
}
