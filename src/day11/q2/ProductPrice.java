package day11.q2;

import java.util.Comparator;

public class ProductPrice implements Comparator<Productbean> {


    @Override
    public int compare(Productbean p1, Productbean p2) {
        if(p1.getProductPrice()>p2.getProductPrice())
            return +1;

        if(p1.getProductPrice()<p2.getProductPrice())
            return -1;

        else
            return 0;
    }
}
