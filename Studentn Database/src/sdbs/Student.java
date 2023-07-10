package sdbs;

public class Student {

	
	private String s_name;
	private String id;
	private int age;
	private int marks;
	
	static int count=101;
	
	public Student(String s_name, int age, int marks) {
		super();
		s_name = s_name;
		this.id = "JSP"+count;
		this.age = age;
		this.marks = marks;
	}
	

	public void setname(String s_name) {
		this.s_name=s_name;
	}
	
	
	public String getname() {
		return s_name;
	}
	
	
	//--------------------------------------
	public String getid() {
		return id;
	}
	
	
	
	//---------------------------
	public int getage() {
		return age;
	}
	
	
	public void setage(int age) {
		this.age=age;
	}
	//----------------------------------
	public void setmarks(int marks) {
		this.marks=marks;
	}
	
	public int getmarks() {
		return marks;
	}
	
	public String toString() {
		return  "name :"+s_name+","+" age :"+age+", id :"+id+", marks :"+marks ;
	}
	
}


