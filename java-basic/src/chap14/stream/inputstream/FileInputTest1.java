package chap14.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
            int i;
            while( (i = fis.read()) != -1) { // -1은 끝을 의미함
                System.out.print((char)i);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("end");
    }
}
