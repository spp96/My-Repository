package Question_1;

import java.util.Scanner;

public class UserRegistration {
    static void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }

    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = user.nextLine();
        System.out.println("Enter Your Country:");
        String country = user.nextLine();

        try {
            registerUser(name, country);
        } catch (InvalidCountryException a) {
            System.out.println(a.getMessage());
            user.close();
        }
    }
}