package day14and15SerializationandDeserialization_Multithreading_IoandNio.q1;

import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    Student student = new Student(56,"Chirag","Udaipur","chirag@56","chirag123");
    FileOutputStream fileOutputStream = new FileOutputStream("student.txt.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(student);
        System.out.println("Done");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.txt.txt"));
        Student student1 = (Student)objectInputStream.readObject();
        System.out.println(student1.toString());
    }
}
