package Q2;

public class Check_Weather {
    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if (isSnowing ||isRaining ||temperature < 50.0  ){
            System.out.println("Let’s stay home.");
        } else {
            System.out.println("Let’s go out!");
        }
    }
    //print "Let’s stay home." if its raining, snowing or
    //below 50 degrees and print "Let’s go out!" otherwise.
}
