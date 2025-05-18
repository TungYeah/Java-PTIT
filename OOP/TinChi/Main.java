package OOP.TinChi;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(student.toString());
        System.out.println("Study credits " + student.credits());
        student.study();
        System.out.println("Study credits " + student.credits());
    }
}