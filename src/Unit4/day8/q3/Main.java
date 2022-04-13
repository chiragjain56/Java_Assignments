package Unit4.day8.q3;

import java.util.Scanner;

public class Main {
    public Hotel provideFood(int amt) {
        TajHotel tajHotel = new TajHotel();
        RoadSideHotel roadSideHotel = new RoadSideHotel();
        if (amt > 1000) {
            return tajHotel;
        } else if (amt > 200 && amt < 1000) {
            return roadSideHotel;
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount");
        int amt = sc.nextInt();
       Hotel hotel = obj.provideFood(amt);

        if(hotel instanceof TajHotel) {
            hotel.chickenBiryani();
            hotel.masalaDosa();
            //Down casting to use the specific method of TajHotel Object
            ((TajHotel) hotel).welcomeDrink();
        } else if  (hotel instanceof RoadSideHotel) {
            hotel.chickenBiryani();
            hotel.masalaDosa();
        } else {
            System.out.println("Please Enter a valid amount");
        }
    }
}
