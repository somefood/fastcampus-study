package chap11.generic;

public class Powder extends Material {

    @Override
    public void doPrinting() {
        System.out.println("Powder로 프린팅합니다.");
    }

    public String toString() {
        return "재료는 Powder 입니다.";
    }
}
