package chap05.classpart;

public class Student {
    private int studentID;
    public String studentName;
    public String address;

    public Student() {} // 디폴트 생성자 만들어 줘야함

    public Student(String name) {
        studentName = name;
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소 없음";
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }
}
