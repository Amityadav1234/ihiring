
class MyDaemon extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("lazy thread");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}

public class Daemon extends MyThread {

	public static void main(String[] args) {
		MyDaemon md = new MyDaemon();
		md.setDaemon(true);
		md.start();
		System.out.println("end of main thread");
	}

}
