package day7.q2;

import java.util.*;
public class Main {

    public static String reverseString(String str){
        char[] charArr = str.toCharArray();
        String s = "";
        for(int i=charArr.length-1;i>=0;i--){
            s += charArr[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();

        String result = reverseString(originalString);

        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);

    }
}
