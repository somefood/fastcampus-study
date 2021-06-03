package chap03.operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ( (num1 = num1 + 10) < 10) && ( (i = i + 2) < 10);
//        boolean value2 = ( (num1 = num1 + 10) < 10) || ( (i = i + 2) < 10);
        System.out.println(num1);
        System.out.println(i);  // 단란 평가로 인해 뒤에께 반영이 안됨
        System.out.println(value);

        int num2 = 10;
        int num3 = 20;
        int num = (num2 > num3)?num2:num3;
        System.out.println(num);
    }
}
