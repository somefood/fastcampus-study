package chap14.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest3 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input2.txt");){ // try resources는 auto close 해줌.
            int i;
            byte[] bs = new byte[10]; // 몇개씩 배열에 담아서 버퍼 역할
            while( (i = fis.read(bs)) != -1) { // -1은 끝을 의미함
//                for(byte b: bs) {
//                    System.out.print((char)b);
//                }
                for(int k=0; k<i; k++) {
                    System.out.print((char)bs[k]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
