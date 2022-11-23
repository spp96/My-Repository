package Question_1;

public class Thread_A extends Thread{
	
	int products = 1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				products*=i;
			}
			this.notify();
		}
		
	}

}
