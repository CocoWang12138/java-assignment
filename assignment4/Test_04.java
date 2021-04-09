package assignment4;

class Student_2{
	String name;
	int age;
	
	public Student_2(String n,int a){
		name=n;
		age=a;
	}
	
	public void Show() {
		System.out.println("My name is "+this.name+", I am "+this.age+" years old.");
	}
}

class Undergraduate extends Student_2 {
	String degree;
	
	public Undergraduate(String n,int a,String d) {
		super(n, a);
		degree=d;
	}
	
	public void Show() {
		System.out.println("My name is "+this.name+", I am "+this.age+" years old.");
		System.out.println("I am a bachelor student of "+this.degree);
	}
}

public class Test_04 {
	public static void main(String args[]) {
		Student_2 s=new Student_2("Ð¡Ã÷", 21);
		Undergraduate u=new Undergraduate("Ð¡ºì", 21, "Software Engineer");
		
		s.Show();
		u.Show();
	}
}
