package assign.chap10;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(6, 26, 2021);
        MyDate date2 = new MyDate(6, 26, 2021);

        System.out.println(date1.equals(date2));
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
}
