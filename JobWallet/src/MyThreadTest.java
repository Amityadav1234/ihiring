
public class MyThreadTest extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("sita thread");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		MyThreadTest t = new MyThreadTest();
		t.start();
		//t.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Ram Thread");
		}

	}

}
