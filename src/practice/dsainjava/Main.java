package practice.dsainjava;

import java.util.LinkedHashMap;
import java.util.Map;

class PushingObject {
    public static Map<Character,Integer> freq(String str){
        Map<Character,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){

            if(map.containsKey(str.charAt(i))){

                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        System.out.println(freq("chiragcg"));
    }
}