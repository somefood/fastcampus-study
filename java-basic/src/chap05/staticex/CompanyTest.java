package chap05.staticex;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();

        Company company2 = Company.getInstance();

        System.out.println(company1 == company2);

        Calendar calendar = Calendar.getInstance();
    }
}
