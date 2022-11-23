package Question_1;
import java.util.*;
public class CityClass {
	public static void main(String[] args) {
		List<String> cities_List = Arrays.asList("Jalgaon","Daund","Ranchi","Satara","Pune");
		Collections.sort(cities_List,(city_1,city_2) -> city_2.compareTo(city_1));
		System.out.println("List of Cities:-"+" "+cities_List);
	}
}
