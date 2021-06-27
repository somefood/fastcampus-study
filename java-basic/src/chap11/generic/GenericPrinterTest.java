package chap11.generic;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter.toString());

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter.toString());

        powderPrinter.printing();
        plasticPrinter.printing();

//        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
//        Water water = new Water();
//        waterPrinter.setMaterial(water);
//        System.out.println(waterPrinter.toString());
    }
}
