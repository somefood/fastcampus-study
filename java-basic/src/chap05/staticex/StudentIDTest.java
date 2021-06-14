package chap05.staticex;

public class StudentIDTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        System.out.println(studentLee.getStudentID());

        Student studentKim = new Student("kim");
        System.out.println(studentKim.getStudentID());
    }
}
