package chap05.classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentHong = new Student();
        studentHong.studentID = 2019113173;
        studentHong.studentName = "홍석주";
        studentHong.address = "서울";
        studentHong.showStudentInfo();
    }
}
