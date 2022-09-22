package Question_2;
import java.util.Scanner;
public class Demo {
    public Hotel provideFood(int amount){
        if (amount > 1000) {
            return new TajHotel();
        } else if (amount > 200 & amount < 1000) {
            return new RoadSideHotel();
        } else {
            return null;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an amoount");
        int amount = sc.nextInt();

        Demo demo = new Demo();

        Hotel hotel = demo.provideFood(amount);

        if(hotel != null) {
            if(hotel instanceof TajHotel) {
                TajHotel tajHotel = (TajHotel)hotel;
                tajHotel.welcomeDrink();
            }
            hotel.chickenBiryani();
            hotel.masalaDosa();
        }
        else {
            System.out.println("Please enter a valid amount!");
        }

    }
}
