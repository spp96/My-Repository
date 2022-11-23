package Question_6;

import java.util.*;
import java.util.concurrent.Callable;

public class MyCallable implements Callable  {
	
	int num;
	public MyCallable(int n) {
		this.num = n;
	}

	@Override
	public Object call() throws Exception {
		
		
		System.out.print(Thread.currentThread().getName()+":"+"Number is:-"+ num+" "+" is"+" " );
		
//		long numb = 1;
		for (int i = 0; i <=num; i++) {
			if(num%2!=0) {
				return "Odd Number";
			} else {
				return "Even Number";
			}
		}
		return null;
	}
	

}
