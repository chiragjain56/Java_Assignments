package day13Stream_and_Lambda.q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(32,"Chirag",600));
        list.add(new Student(34,"Shivansh",300));
        list.add(new Student(36,"Jay",799));
        list.add(new Student(33,"Sibtain",900));
        list.add(new Student(39,"Jatin",450));
        list.add(new Student(42,"Aarti",280));

        Stream<Student> studentStrem = list.stream();

        List<Employee> employees = studentStrem.map(s -> new Employee(s.getRoll(),s.getName(),s.getMarks()*1000)).toList();
        employees.forEach(System.out::println);
    }
}
