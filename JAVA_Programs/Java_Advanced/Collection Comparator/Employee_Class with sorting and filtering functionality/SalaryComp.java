package Question_2;

import java.util.*;

public class SalaryComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getSalary() > e2.getSalary()) {
			return 1;
		} else if(e1.getSalary() < e2.getSalary()) {
			return -1;
		}else {
			return e1.getEmpName().compareTo(e2.getEmpName());
		}
	}

}
