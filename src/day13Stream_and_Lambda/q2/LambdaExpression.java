package day13Stream_and_Lambda.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@FunctionalInterface
interface inter{
    List<String> sortName(List<String> name);
}

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Udaipur");
        list.add("Jaipur");
        list.add("Indor");
        list.add("Goa");
        list.add("Ahamdabad");

        inter inte = (n) -> {
            TreeSet<String> sorted = new TreeSet<>(n);
            List<String> ans = new ArrayList<>(sorted);

            return ans;
        };
        System.out.println(inte.sortName(list));
    }
}
