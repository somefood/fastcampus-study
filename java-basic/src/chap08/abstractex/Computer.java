package chap08.abstractex;

public abstract class Computer {

    public abstract void display(); // {} 없이 ;로 끝내면 추상 클래스

    public abstract void typing();


    // 그냥 상속 받기
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
