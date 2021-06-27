package chap12.lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyMaxNumber max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMaxNumber(3, 4));
    }
}
