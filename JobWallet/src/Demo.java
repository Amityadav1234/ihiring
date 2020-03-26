
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="New String";
		System.out.println(s.length());
		System.out.println("hi this my first program");
		
		//1 way
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		sb=sb.reverse();
		System.out.println(sb); 
		
		//2 way
		String orignal="mouse",rev="";
		for(int i=orignal.length()-1;i>=0;i--)
		{
			rev=rev+orignal.charAt(i);
		}
		System.out.println(rev);
		
		String str="Amit";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);	
		}
		String str1="Rama";
		 
	}
}