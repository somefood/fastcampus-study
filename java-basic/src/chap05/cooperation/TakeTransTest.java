package chap05.cooperation;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentHong = new Student("Seokju", 5000);
        Student studentKim = new Student("jimmy", 10000);

        Bus bus3414 = new Bus(3414);
        Bus bus3216 = new Bus(3216);
        Subway subway5 = new Subway(5);
        Subway subway8 = new Subway(8);

        studentHong.takeBus(bus3414);
        studentKim.takeSubway(subway5);

        studentHong.showInfo();
        studentKim.showInfo();

        bus3414.showBusInfo();
        bus3216.showBusInfo();

        subway5.showSubwayInfo();
    }
}
