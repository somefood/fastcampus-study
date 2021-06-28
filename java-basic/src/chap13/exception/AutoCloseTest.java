package chap13.exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        try(AutoCloseObj obj = new AutoCloseObj()) {
            throw new Exception(); // 예외 생성
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
