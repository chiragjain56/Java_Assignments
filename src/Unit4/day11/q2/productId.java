package Unit4.day11.q2;

import java.util.Comparator;

public class productId implements Comparator<Productbean> {

    @Override
    public int compare(Productbean p1, Productbean p2) {
        if (p1.getProductId() > p2.getProductId())
            return +1;

        if (p1.getProductId() < p2.getProductId())
            return -1;

        else
            return 0;
    }
}