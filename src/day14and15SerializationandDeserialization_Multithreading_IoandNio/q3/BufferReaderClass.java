package day14and15SerializationandDeserialization_Multithreading_IoandNio.q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
        int str = reader.read();
        while (str != -1){
            System.out.print((char) str);
            str = reader.read();
        }
        reader.close();

    }
}
