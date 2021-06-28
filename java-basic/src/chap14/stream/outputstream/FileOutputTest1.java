package chap14.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("output.txt", true)) { // append true시 이어 붙임
            fos.write(65);
            fos.write(66);
            fos.write(67);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
