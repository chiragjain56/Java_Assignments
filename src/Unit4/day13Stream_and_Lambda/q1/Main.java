package Unit4.day13Stream_and_Lambda.q1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(32,"Chirag",600));
        list.add(new Student(34,"Shivansh",300));
        list.add(new Student(36,"Jay",799));
        list.add(new Student(33,"Sibtain",900));
        list.add(new Student(39,"Jatin",450));
        list.add(new Student(42,"Aarti",280));

        List<Student> stud = list.stream().filter(s-> s.getMarks()<800).toList();
        stud.forEach(s-> System.out.println(s));
    }
}
