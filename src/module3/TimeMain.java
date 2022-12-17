package module3;
import java.sql.Time;
public class TimeMain {
    public static void main(String[] args) {
        TimeOne t1= new TimeOne();
        t1.setTime(23,50,10);
        displayTime("Show Time",t1);
    }
    private static void displayTime(
            String title,
            TimeOne time
    ){
        System.out.printf("%s%nUniversal Time: %s%nStandard Time:%s%n",title,time.toUniversalString(),time.toString());
    }
}