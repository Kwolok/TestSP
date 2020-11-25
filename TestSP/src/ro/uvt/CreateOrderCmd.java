package ro.uvt;

import java.util.Vector;

public class CreateOrderCmd {
    public Order execute() {
        Order o = new Order();
        o.addProd("Supe pui",2,7.5);
        o.addProd("Friptura de porc la tava",1,15);
        o.addProd("Snitel vienez",1,13);
        o.addProd("Cartofi Wedges",2,6);
        o.addProd("Salata rosii",2,5);
        o.addProd("Ape minerale",2,3);

        return o;
    }
}
