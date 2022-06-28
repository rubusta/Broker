package app;

// Исправьте ошибки компиляции.
public class App {

    static String brokerName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductA product;
    static BrokerA broker;
    static String infoBroker;
    static String infoProduct;

    public static void main(String[] args) {
        doInputs();
//        showData(processData());
    }

    private static void doInputs() {
        // Релизуйте ввод значений через Scanner
    }


//    private static String processData() {
//        broker = new BrokerA(brokerName, phone, email);
////        infoBroker = вызовите метод infoBroker
//        product = new ProductA(productName, quantity, price);
//        infoProduct = product.infoProduct();
////        double sales =  Вызовите метод calcSales
////        roundBonus = Rounder.roundValue(broker.calcCommission(sales));
//        return infoBroker + infoProduct + "\nБонус (грн.): " + roundBonus;
//    }

    private static void showData(String output) {
        System.out.println(output);
    }
}
