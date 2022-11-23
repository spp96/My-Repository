package Question_3;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<String> city=Arrays.asList("Jalgaon","Banglore","Indore","Bhopal","Jaipur");
		
		PrintList names_city=list_city ->{ 
			System.out.println("List of Cities:-"+" "+list_city);
		};
		names_city.display(city);
	}

}
