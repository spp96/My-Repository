package Question_3;

public class Thread_Even extends Thread{
	@Override
	public void run() {
		
		for (int i = 1; i <= 20 ; i++) {
			if(i%2==0) {
				System.out.println("Even Numbers is:- "+i);
			}
		}
	}
}
