package chap10.string;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


        // 상수 풀에서 가져옴
        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
