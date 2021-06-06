package assign;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        char opCode = '+';
        if (opCode == '+') System.out.println(a + b);
        else if (opCode == '-') System.out.println(a - b);
        else if (opCode == '*') System.out.println(a * b);
        else if (opCode == '/') System.out.println(a / b);

        switch (opCode) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}
