package chap07.inheritance;

public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

//        System.out.println("VIPCustomer(int, String 생성자 호출");
    }

    @Override   // annotation: 컴파일러에게 알려줌
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
