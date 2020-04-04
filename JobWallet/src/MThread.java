


public class MThread extends Thread{
	public void strat() {
		System.out.println("start method");
	}
	
	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		 
     MThread mt=new MThread();
     mt.strat();
     
     System.out.println("main method");
	}

}
