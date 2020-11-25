package ro.uvt;

public class Main {

    public static void main(String[] args) {
        Order order = new CreateOrderCmd().execute();

        new DisplayOrderCmd(order).execute();
    }
}
