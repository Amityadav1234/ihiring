
public class SingleTonDemo {

	public static void main(String[] args) {
		 Runtime rt=Runtime.getRuntime();
		 Runtime rt1=Runtime.getRuntime();
		 Runtime rt2=Runtime.getRuntime();
		 
		 System.out.println(rt);
		 System.out.println(rt1);
		 System.out.println(rt2);
	}

}