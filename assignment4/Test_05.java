package assignment4;

interface Flayable{
	public void takeoff();
	public void land();
	public void fly();
}

class Vehicle{
	
	void refuel() {
		
	};
}

class Animal{
	
	void eat() {
	};
}

class AirPlane extends Vehicle implements Flayable{

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("The airplane is taking off");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("The airplane is landing");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The airplane is flying");
	}
	
}

class Bird extends Animal implements Flayable{

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("The bird is taking off");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("The bird is landing");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The bird is flying");
	}
	
	void buildNest() {
		System.out.println("The bird is building nest");
	}
	
	void layEggs() {
		System.out.println("The bird is laying eggs");
	}
}

public class Test_05 {
	public static void main(String args[]) {
		Bird bird=new Bird();
		AirPlane airPlane=new AirPlane();
		
		bird.fly();
		bird.buildNest();
		bird.takeoff();
		bird.land();
		bird.layEggs();
		airPlane.fly();
		airPlane.land();
		airPlane.takeoff();
	}
}