package assign;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("홀수 값을 입력하세요:");

        Scanner scan = new Scanner(System.in);
//        int lineCount = scan.nextInt();
        int lineCount = 11;
        int spaceCount = lineCount/2 + 1;
        int starCount = 1;

        for(int i=1; i <= spaceCount; i++) {
            for(int j=spaceCount-i; j>=1; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=lineCount-spaceCount; i>0; i--) {
            for(int j=0; j<spaceCount-i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i*2-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
