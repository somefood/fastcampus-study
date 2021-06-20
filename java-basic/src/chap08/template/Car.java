package chap08.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}

    // 이 템플릿은 유지 되어야 함. 재정의 되면 안됨. final 입력
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
