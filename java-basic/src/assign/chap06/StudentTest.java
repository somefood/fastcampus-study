package assign.chap06;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        Student studentKim = new Student("Kim");
        Student studentCho = new Student("Cho");

        studentLee.addBook("태백산맥1");
        studentLee.addBook("태백산맥2");
        studentLee.addBook("태백산맥3");

        studentKim.addBook("토지1");
        studentKim.addBook("토지2");
        studentKim.addBook("토지3");

        studentCho.addBook("해리포터1");
        studentCho.addBook("해리포터2");
        studentCho.addBook("해리포터3");
        studentCho.addBook("해리포터4");
        studentCho.addBook("해리포터5");
        studentCho.addBook("해리포터6");

        studentLee.showBook();
        studentKim.showBook();
        studentCho.showBook();
    }
}
