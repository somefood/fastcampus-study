package chap04.ifexample;

import java.util.Scanner;

public class SwitchCaseEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char medalColor;
        int rank = scan.nextInt();
        // 자바 7부터 문자열 사용 가능
        switch (rank) {
            case 1:
                medalColor = 'G';
                break;
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
                break;
            default:
                medalColor = 'A';
                break;
        }
        System.out.println(medalColor);
    }
}
