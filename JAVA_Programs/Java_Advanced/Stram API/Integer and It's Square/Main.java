package Question_3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer>nums= new ArrayList<>();
		nums.add(8);
		nums.add(14);
		nums.add(16);
		
		List<Integer>square=nums
				               .stream().map(s ->(s*s))
				               .collect(Collectors.toList());
		square.forEach(s -> System.out.println(s));
		
	}
}
