package chap05.coffee;

public class Person {
    String name;
    int money;
    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCoffee starCoffee, int price) {
        starCoffee.take(price);
        this.money -= price;
        System.out.println(this.name + "님이 " + price + "으로 별 다방 아메리카노를 구입했습니다.");
    }

    public void buyBeanCoffee(BeanCoffee beanCoffee, int price) {
        beanCoffee.take(price);
        this.money -= price;
        System.out.println(this.name + "님이 " + price + "으로 콩 다방 라떼를 구입했습니다.");
    }
}
