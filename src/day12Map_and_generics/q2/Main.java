package day12Map_and_generics.q2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String ,String > linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Rajasthan","Jaipur");
        linkedHashMap.put("Gujrat","Gandhinager");
        linkedHashMap.put("MP","Bhopal");
        linkedHashMap.put("Panjab","Chandigarh");
        linkedHashMap.put("West Bengal","Kolkata");

        Set<Map.Entry<String ,String>> set = linkedHashMap.entrySet();

        for (Map.Entry<String ,String> key:set) {
            System.out.println( "Capital of " + key.getKey() + " is " + key.getValue());
        }
    }
}
