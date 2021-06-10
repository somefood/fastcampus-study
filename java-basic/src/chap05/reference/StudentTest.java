package chap05.reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentHong = new Student(100, "홍석주");
        studentHong.setKoreaSubject("국어", 100);
        studentHong.setMathSubject("수학", 95);
        studentHong.showStudentScore();

        Student studentKim = new Student(200, "김김김");
        studentKim.setKoreaSubject("국어", 80);
        studentKim.setMathSubject("수학", 99);
        studentKim.showStudentScore();
    }
}
