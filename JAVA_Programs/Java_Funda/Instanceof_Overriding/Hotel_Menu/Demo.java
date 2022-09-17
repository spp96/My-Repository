package Question_3;
import java.util.Scanner;

public class Demo {
        static Hotel th = new TajHotel();
        static Hotel rh = new RoadSideHotel();

        public Hotel provideFood(int amount) {
            if (amount > 1000) {

                return th;
            } else if (200 < amount && 1000 > amount) {

                return rh;
            }

            else
                return null;
        }

        public static void main(String[] args) {

            Demo d1 = new Demo();

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter amount...");
            int amount = sc.nextInt();

            Hotel obj = d1.provideFood(amount);

            if (obj == null) {
                System.out.println("Please Enter a valid amount");
            } else if (obj == th) {

                TajHotel th = (TajHotel) obj;

                th.welcomeDrink();
                obj.PavBhaji();
                obj.Biryani();
            } else if (obj == rh) {
                RoadSideHotel rh = (RoadSideHotel) obj;
                rh.welcomeDrink();
                obj.PavBhaji();
                obj.Biryani();
            }

        }

}
