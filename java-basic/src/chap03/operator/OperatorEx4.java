package chap03.operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        int num1 = 0B00001010; // 10
        int num2 = 0B00000101; // 5

        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);

        System.out.println(num2 << 1); // 1비트씩 밀기
        System.out.println(num2 << 2);
        System.out.println(num2 << 3); // 2의 n승 곱하기
        System.out.println(num2 >> 2); // 나누기 2의 n승
        System.out.println(num2 <<= 3); // 대입 연산자

    }
}
