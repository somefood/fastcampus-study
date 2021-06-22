package assign.chap09;

import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        Sort sort;
        int[] arr = {1, 2, 3};
        while(true) {
            System.out.println("정렬방식을 선택하세요.");
            System.out.println("B : BubbleSort");
            System.out.println("H : HeapSort");
            System.out.println("Q : QuickSort");
            s = scan.next();

            if (s.equals("B")) {
                sort = new BubbleSort();
            } else if(s.equals("H")) {
                sort = new HeapSort();
            } else if(s.equals("Q")) {
                sort = new QuickSort();
            } else {
                System.out.println("잘못 입력했습니다. 종료합니다.");
                break;
            }
            sort.ascending(arr);
            sort.descending(arr);
            sort.description();
        }
    }
}
