
public class Student {

	
	 String name;
	 int rollno;
	 
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

    
	void show() 
	{
		System.out.println(name+" "+rollno);
	}

	public static void main(String[] args) {
		 
		Student s1=new Student("Amit",101);
		 s1.show();
		 Student s2=new Student("Yadav",102);
		 s2.show();
		 
		

	}

}
