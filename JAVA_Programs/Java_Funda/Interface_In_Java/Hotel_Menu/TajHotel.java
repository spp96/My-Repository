package Question_2;

public class TajHotel implements Hotel{
    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }

    @Override
    public void chickenBiryani() {
        System.out.println("Ordered Biryani From TajHotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("Ordered MasalaDosa From TajHotel");
    }
}
