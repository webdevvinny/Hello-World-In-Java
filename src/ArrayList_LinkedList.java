import java.util.*;
import java.util.HashMap;

class OuterClass{
    int number = 654;

    static class InnerClass{
        int num = 345;
    }
}
public class ArrayList_LinkedList {
    public static void main(String [] args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Benz");
        cars.add("BMW");
        cars.add("Bugatti");
        cars.add("Lamborghini");

        Collections.sort(cars);

        for(String c : cars){
            System.out.println("This is an a");
            System.out.println("This SuperCar is a: " + c);
        }

        cars.set(1, "McLaren");
        System.out.println(cars);
            OuterClass n = new OuterClass();
            OuterClass.InnerClass w = new OuterClass.InnerClass();
        System.out.println("The number in the InnerClass is: " + w.num);
        System.out.println(n.number + " is the number in the OuterClass");
    }



}
