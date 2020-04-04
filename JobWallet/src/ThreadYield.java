
public class ThreadYield extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("child Thread");
		}

	}

	public static void main(String[] args) {

		ThreadYield td = new ThreadYield();
		td.start();

		for (int i = 0; i < 5; i++) {

			System.out.println("main thread");
		}

	}

}
