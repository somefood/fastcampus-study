package chap11.generic;

public class Plastic extends Material {

    @Override
    public void doPrinting() {
        System.out.println("Plastic으로 프린팅합니다.");
    }

    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}
