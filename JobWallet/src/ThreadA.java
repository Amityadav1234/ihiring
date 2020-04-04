
public class ThreadA extends Thread {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("main thread calling wait");
			b.wait();
			System.out.println("main thread got notification call");
			System.out.println(b.total);
		}
	}
}

class ThreadB extends ThreadA {
	int total = 0;

	public void run() {

		synchronized (this) {

			System.out.println("child thread start calculation");
			for (int i = 0; i <= 100; i++) {

				total = total + i;
			}
			System.out.println("child thread giving notification call");
			this.notify();
		}
	}
}
