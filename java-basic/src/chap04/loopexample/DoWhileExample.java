package chap04.loopexample;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
//        int num = 1;
//        int sum = 0;
//
//        do {
//            sum += num;
//            num++;
//        } while (num <= 10);
//        System.out.println(sum);
        Scanner scan = new Scanner(System.in);
        int input;
        int sum = 0;
        do {
            input = scan.nextInt();
            sum += input;
        } while(input != 0);

        System.out.println(sum);
    }
}
