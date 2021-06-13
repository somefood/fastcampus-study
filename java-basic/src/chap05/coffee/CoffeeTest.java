package chap05.coffee;

public class CoffeeTest {
    public static void main(String[] args) {
        Person kim = new Person("Kim", 10000);
        Person lee = new Person("Lee", 10000);
        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();

        kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
        lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
    }
}
