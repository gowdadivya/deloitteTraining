package vehicle;
//super class cons demo
abstract class Vehicle
{
	public abstract void startEngine();
	public void musicSystem() {
		System.out.println("Music");
	}	
}
class Car extends Vehicle
{
	@Override
	public void startEngine() {
		System.out.println("car started");
	}	
}
class Bike extends Vehicle
{
	@Override
	public void startEngine() {
	System.out.println("bike started");
	}
}
class VehicleApp
{
	public static void main(String[] args) {
		Vehicle c = new Car();
		c.startEngine();
		Vehicle b = new Bike();
		b.startEngine();
	}
}

