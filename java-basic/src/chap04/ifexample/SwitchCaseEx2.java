package chap04.ifexample;

import java.util.Scanner;

public class SwitchCaseEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.next();
        int day = 0;
        switch (month) {
            case "Jan": case "Mar": // 같은 경우 이렇게
                day = 31;
                System.out.println("test");
                break;
            case "Feb":
                day = 28;
                System.out.println("test2");
                break;
        }
        System.out.println(day);
    }
}
