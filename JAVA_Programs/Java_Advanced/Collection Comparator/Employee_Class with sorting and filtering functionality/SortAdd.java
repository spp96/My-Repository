package Question_2;

import java.util.*;

public class SortAdd implements Comparator<Employee> {

	@Override
	public int compare(Employee a1, Employee a2) {
		// TODO Auto-generated method stub
		return a1.getAddress().compareTo(a2.getAddress());
	}

}
