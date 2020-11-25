package ro.uvt;

public class DisplayOrderCmd {
    Order o;
    public DisplayOrderCmd(Order order) {

        o = order;
    }
    public void execute() {
        double s = 0;
        for(Produs i: o.produse) {
            System.out.println(i.cant+" x "+i.nume+" x "+i.pret+" RON");
            s = s + i.pret * i.cant;
        }
        System.out.println("TOTAL: " +s+ " RON");
    }
}
