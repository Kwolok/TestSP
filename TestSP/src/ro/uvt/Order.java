package ro.uvt;
import java.util.Vector;

public class Order {
    Vector<Produs> produse = new Vector<Produs>();
    public void addProd(String nume, int cant, double pret) {
        Produs p1 = new Produs(nume,cant,pret);
        produse.add(p1);
    }
}
