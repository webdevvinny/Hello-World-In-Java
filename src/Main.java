public class Main {

    public static void main(String [] args)
    {
        myMethod((byte) 23);
    }
    static void myMethod(byte age)
    {

        System.out.println("This is a method being called");
        System.out.println("The method has been called!!!");
        System.out.println(age);
    }
}