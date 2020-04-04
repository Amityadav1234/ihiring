


public class InteruptThreadTest extends Thread {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("i m lazy thread: "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				 System.out.println("i got interrupted");
			}
		}
	}

	public static void main(String[] args) {
		InteruptThreadTest t=new InteruptThreadTest();
		t.start();
		t.interrupt();
		for(int i=0;i<5;i++) {
			System.out.println("end of main thread");
		}

	}

}
