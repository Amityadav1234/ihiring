
public class TestException {

	public static void main(String[] args) {
 
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae){
			
			System.out.println(10/0);
		}finally {
			String s=null;
			System.out.println(s.length());
		}
	}

}
