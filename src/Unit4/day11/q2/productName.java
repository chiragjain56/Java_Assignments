package Unit4.day11.q2;

import java.util.Comparator;

public class productName implements Comparator<Productbean> {
    @Override
    public int compare(Productbean p1, Productbean p2) {
        return p1.getProductName().compareTo(p2.getProductName());
    }
}