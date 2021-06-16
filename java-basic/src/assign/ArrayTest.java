package assign;

public class ArrayTest {
    public static void main(String[] args) {
        char[] alpha = new char[26];
        char ch = 'A';
        for(int i=0, j=65; i<alpha.length; i++, j++) {
//            alpha[i] = (char)j;
            alpha[i] = ch++;
        }
        for(int i=0; i<alpha.length; i++) {
            System.out.println(alpha[i]);
        }
    }
}
