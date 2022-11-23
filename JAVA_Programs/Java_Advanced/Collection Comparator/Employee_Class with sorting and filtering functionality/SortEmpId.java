package Question_2;

import java.util.Comparator;

public class SortEmpId implements Comparator<Employee> {

	@Override
	public int compare(Employee id1, Employee id2) {
		// TODO Auto-generated method stub
		if(id1.getEmpId() > id2.getEmpId()) {
			return 1;
		} else if(id1.getEmpId() < id2.getEmpId()) {
			return -1;
		}else {
			return 0;
		}
	}
	

}
