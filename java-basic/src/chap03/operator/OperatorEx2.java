package chap03.operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        int num1 = 5 / 3;
        int num2 = 5 % 3;
        System.out.println(num1);
        System.out.println(num2);

        num1 = 10;
        num1 += 2;
        System.out.println(num1);

        int score = 100;
        System.out.println(++score);
        System.out.println(score++);
        System.out.println(score);
        System.out.println(--score);
        System.out.println(score--);
        System.out.println(score);
    }
}
