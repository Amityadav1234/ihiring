


public class MyThread extends Thread{
	
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("child thread");
		}
		
	}

	public static void main(String[] args) {
		MyThread mt=new MyThread();
		mt.start();
		
		for(int i=1;i<5;i++) {
			System.out.println("main thread");
		}
	}
}
