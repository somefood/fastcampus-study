import java.util.Scanner;

class AuthException extends RuntimeException {
    public AuthException(String message) {
        super(message);
    }
}

class IdNotRegisteredException extends AuthException {
    public IdNotRegisteredException(String message) {
        super(message);
    }
}

// 아이디는 영어만 가능하다는 예외
class IdOnlyPermitEnglish extends AuthException {
    public IdOnlyPermitEnglish(String message) {
        super(message);
    }
}

// 패스워드가 일치하지 않을 때 예외
class PasswordNotCorrectException extends AuthException {
    public PasswordNotCorrectException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("아이디를 입력해주세요: ");
//        String id = scan.next();
//        System.out.print("패스워드를 입력해주세요: ");
//        String password = scan.next();
//    }
    }
}
