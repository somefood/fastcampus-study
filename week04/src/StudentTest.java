import java.util.HashSet;
import java.util.Set;

class Student {
    int no;
    String name;
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return no;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return (this.no == student.no) && (this.name.equals(student.name));
        } else {
            return false;
        }
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(215233, "kim");
        Student s2 = new Student(215233, "kim");

        Set<Student> personSet = new HashSet<>();

        personSet.add(s1);
        personSet.add(s2);

        System.out.println(s1.equals(s2));
        System.out.println(personSet.size() == 1);

    }
}
