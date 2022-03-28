package day14and15SerializationandDeserialization_Multithreading_IoandNio.q3;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        FileReader fileReader= new FileReader("student.txt");
        int readerFile = fileReader.read();
        while (readerFile != -1){
            System.out.print((char) readerFile);
            readerFile = fileReader.read();
        }
        fileReader.close();

    }
}
