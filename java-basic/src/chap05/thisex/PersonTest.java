package chap05.thisex;

public class PersonTest {
    public static void main(String[] args) {
        Person personNoname = new Person();
        personNoname.showInfo();

        Person personHong = new Person("홍석주", 25);
        personHong.showInfo();
        System.out.println(personHong);

        Person p = personHong.getSelf();
        System.out.println(p);
    }
}