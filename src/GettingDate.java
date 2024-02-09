import java.util.*;

public class GettingDate {

    public static void main(String[] args){
        Date time = new Date();
        int hour = time.getHours();
        int minutes = time.getMinutes();
        int seconds = time.getSeconds();

        System.out.println("The current time is: " + hour + ":" + minutes + ":" + seconds + "(Kirinyaga)");
    }
}
