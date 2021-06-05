package chap04.loopexample;

public class ForExample {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
//        for(count=1; count <= 10; count++) {
//            sum += count;
//        }
        for(int i=0; i<10; i++, count++) { // 증감식 여러개 쓸 수 있음
            sum += count;
        }

//        for(;;) 무한 로프
        System.out.println(count + " " + sum);
    }
}
