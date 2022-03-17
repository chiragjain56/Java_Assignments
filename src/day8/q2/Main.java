package day8.q2;
import java.lang.*;
import java.util.*;

public class Main {
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int[] newArray = new int[0];
        for (int i : inputArray) {
            boolean flag = true;
            for (int j = i-1; j >1 ; j--) {
                if(i%j==0)
                {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                newArray = addInteger(newArray,i);
            }
        }
        return newArray;

    }

    public int[] addInteger(int[] inputArray ,int num){
        int[] newArray = new int[inputArray.length+1];
        for (int i = 0; i <inputArray.length ; i++) {
            newArray[i] = inputArray[i];
        }
        newArray[inputArray.length] = num;
        return newArray;

    }
    public static void main(String[] args) {
        Main m1 = new Main();
        int[] arr = {10,12,5,50,11,14,15};
        int[] returnedArray =  m1.findAndReturnPrimeNumbers(arr);
        if(returnedArray.length == 0){
            System.out.println( "Prime number not found in the supplied Array");
        }
        else{
            for (int i = 0; i < returnedArray.length; i++) {
                System.out.println(returnedArray[i]);
            }
        }
    }
}