package chap14.stream.decorator;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        long milliseconds = 0;

        try(FileInputStream fis = new FileInputStream("reader.txt");
            FileOutputStream fos = new FileOutputStream("copy.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            milliseconds = System.currentTimeMillis();

            int i;
            while((i=bis.read()) != -1) {
                bos.write(i);
            }
            milliseconds = System.currentTimeMillis() - milliseconds;
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("시간: " + milliseconds);
    }
}
