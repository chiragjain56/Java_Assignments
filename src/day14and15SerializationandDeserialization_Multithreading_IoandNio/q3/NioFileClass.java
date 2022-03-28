package day14and15SerializationandDeserialization_Multithreading_IoandNio.q3;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioFileClass {
    public static void main(String[] args) throws IOException {
        Path myPath = Paths.get("student.txt");
        List <String> readList = Files.readAllLines(myPath);
        for(String str:readList){
            System.out.println(str);
        }
    }
}
