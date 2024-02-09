public class LearningJavaClasses {
    String name = "Vincent Okemwa";
    int age = 19;
    char gender = 'M';

    public void studentMethod(){
        System.out.println("This is a fully accepted student!!!");
    }



    public static void main(String [] args)
    {
        var student = new LearningJavaClasses();
        System.out.println(
                "The student name is: " + student.name
                + "\nThe student is " + student.age + " years old.\n" +
                        "The student's gender is: " + student.gender + "\nLastly "
        );
        student.studentMethod();
    }
}
