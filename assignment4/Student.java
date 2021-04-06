package assignment4;

public class Student {
	float score;
	String name;
	public static int number;
	
	public Student() {
		// TODO Auto-generated constructor stub
		this.number++;
	}
	
	public Student(String n,float s) {
		this.name=n;
		this.score=s;
		this.number++;
	}
	
	private void setName(String name){
		this.name = name;
	}
	
	private void setScore(float score){
		this.score = score;
	}
	
	private void setNumber(int number){
		this.number = number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getScore() {
		return this.score;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student("ะกร๗",90);
		
		System.out.println(number);
	}
}
