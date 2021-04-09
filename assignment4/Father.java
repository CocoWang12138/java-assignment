package assignment4;

public class Father {
	private String name="Zhang Dahu";
	
	public String getName() {
		return this.name;
	}
	
	private class Child{
		private String name="Zhang Xiaohu";
		
		public String getName() {
			return this.name;
		}
	}
	
	void Print() {
		Child child=new Child();
		System.out.println(child.getName());
	}
	
	public static void main(String args[]) {
		Father father=new Father();
		
		System.out.println(father.getName());
		father.Print();
	}
}
