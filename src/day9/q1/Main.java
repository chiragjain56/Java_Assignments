package day9.q1;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        System.out.println("start of main..");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");

        int num1 = 0;
        try {
            num1 = sc.nextInt();

        } catch (Exception e) {
            System.out.println("Please enter valid number.");
        }
        //=========================================================

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        try {
            ArithmeticException arithmeticException = null;
            if (num2 == 0) {
                arithmeticException = new ArithmeticException("");
            }
            throw arithmeticException;
        } catch (Exception e) {
            System.out.println("num2 should not be 0");
        }

        //========================================================

        String message = null;

        int num3 = num1 / num2;

        try {
            if (num3 > 10) {
                message = "Welcome to Exception Handling ";
                System.out.println("Message is :" + message.toUpperCase());
            } else {
                Exception exception = new Exception("");
                throw exception;
            }
        } catch (Exception e) {
            System.out.println("String value is null");
        }

        System.out.println("end of main");
    }}
