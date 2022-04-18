package Unit5.Comparable_or_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(101,"Basant");
        Student s2= new Student(109,"Santosh");
        Student s3 = new Student(104,"Prakash");
        Student s4 = new Student(98,"Ayush");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Collections.sort(students);
        System.out.println(students);
    }
}
