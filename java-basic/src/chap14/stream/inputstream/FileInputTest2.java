package chap14.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");){ // try resources는 auto close 해줌.
            int i;
            while( (i = fis.read()) != -1) { // -1은 끝을 의미함
                System.out.print((char)i);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
