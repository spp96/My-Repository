package Question_1;
import java.util.*;

public class Indian_State_HashMap {
    public static void main(String[] args) {
        Map<String, String> stateOfCountry = new HashMap<>();
        stateOfCountry.put("Maharashtra","Mumbai");
        stateOfCountry.put("Madhya Pradesh","Bhopal");
        stateOfCountry.put("Karnataka","Bangalore");
        stateOfCountry.put("Punjab","Chandigarh");
        stateOfCountry.put("Gujrat","Gandhinagar");
        stateOfCountry.forEach((a,b) -> System.out.println(a + ":- " + b));
    }
}
