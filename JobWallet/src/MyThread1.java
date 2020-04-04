
public class MyThread1 extends Thread {

	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {

		MyThread1 mt = new MyThread1();
		// mt.setPriority(10);
		mt.start();
		System.out.println("main thread");

	}

}
