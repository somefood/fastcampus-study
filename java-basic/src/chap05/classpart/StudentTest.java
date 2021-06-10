package chap05.classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentHong = new Student();
        studentHong.studentID = 2019113173;
        studentHong.studentName = "홍석주";
        studentHong.address = "서울";
        studentHong.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 2019113183;
        studentKim.studentName = "김개똥";
        studentKim.address = "부산";

        studentKim.showStudentInfo();
        System.out.println(studentHong); // toString 메소드 호출
        System.out.println(studentKim);  // 실제 메모리 주소 말고 jvm에서 만들어준 해시값이다.
    }
}
