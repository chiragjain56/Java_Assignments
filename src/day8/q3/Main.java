package day8.q3;

interface Hotel{
    void chickenBiryani();
    void masalaDosa();
}
class TajHotel implements Hotel{
    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Taj Hotel");
    }
}
class RoadSideHotel implements Hotel{
    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Road Side Hotel");

    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Road Side Hotel");

    }
}

public class Main {
    public static void main(String[] args) {
TajHotel tajHotel = new TajHotel();
RoadSideHotel roadSideHotel = new RoadSideHotel();
 tajHotel.chickenBiryani();
 tajHotel.masalaDosa();
 roadSideHotel.chickenBiryani();
 roadSideHotel.masalaDosa();
    }
}
