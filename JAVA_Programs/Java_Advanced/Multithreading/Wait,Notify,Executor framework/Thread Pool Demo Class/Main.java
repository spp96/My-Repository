package Question_6;

import java.util.concurrent.*;

public class Main {
	public static void main(String[] args)  {
		MyCallable [] number = {
			       new MyCallable(1),
			       new MyCallable(10),
			       new MyCallable(15),
			       new MyCallable(20),
			       new MyCallable(25),
			       new MyCallable(14),
			       
		};
		
		ExecutorService evenOrodd = Executors.newFixedThreadPool(3);
		
		for(MyCallable c: number) {
			Future ans = evenOrodd.submit(c);
			
			try {
				System.out.println(ans.get());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		evenOrodd.shutdown();
	
//		System.out.print(Thread.currentThread().getName()+"Number is :-"+ num+" "+" is"+" " );
	}

}
