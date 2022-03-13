package day8.q2;
import java.lang.*;
import java.util.*;
// Jatin Solution not mine...
//public class Main {
//    public static void main(String[] args) {
//        Main main = new Main();
//        int[] ans = main.findAndReturnPrimeNumbers(1,2,3,4,5,6,7,8,9,13,14,19);
//
//
//        //Arrays.toString() prints array in list form instead of the address
//        System.out.println(Arrays.toString(ans));
//    }
//
//
//    //Use of variable length arguments
//    public int[] findAndReturnPrimeNumbers(int... args){
//        String ans = "";
//        for(int num: args) {
//            if(isPrime(num)) {
//                ans += num + " ";
//            }
//        }
//
//        ans = ans.trim();
//
//        String[] temp = ans.split(" ");
//
//        int[] primeNumbers = new int[temp.length]; //let primeNumbers = [] => temp.length
//
//        for(int i = 0; i < temp.length; i++) {
//            primeNumbers[i] = Integer.valueOf(temp[i]);
//        }
//
//        return primeNumbers;
//    }

    public boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        if(num == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
//}