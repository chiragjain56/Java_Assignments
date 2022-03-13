package day7.q3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll Number:");
        int rollNumber = sc.nextInt();

        System.out.println("Student Name:");
        String studentName = sc.next();

        System.out.println("Marks:");
        int marks = sc.nextInt();

        Student obj = new Student(rollNumber,studentName,marks);
        System.out.println("Student Name:" + obj.getStudentName());
        System.out.println("Student RollNumber:" + obj.getRollNumber());
        System.out.println("Student marks:" + obj.getMarks());
    }
}
