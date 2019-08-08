package animals;

abstract class Animals {
	abstract void makeNoise();
	abstract void roam();
	abstract void eat();
	public void sleep(){
		System.out.println("Sleeeeeeeeeep");
	}
	public static void main(String[] args) {
		Animals c = new Dogs();
		c.eat();
		c.roam();
		c.sleep();
		c.makeNoise();
		Animals w = new Wolves();
		w.eat();
		w.roam();
		w.sleep();
		w.makeNoise();
	}
}

abstract class Canine extends Animals{
	@Override
	void roam() {
		System.out.println("roam in canine");
	}	
}
class Dogs extends Canine{

	@Override
	void makeNoise() {
		System.out.println("bow bow");
	}
	@Override
	void eat() {
		System.out.println("eats bone");
	}
 }
 
class Wolves extends Canine{
	@Override
	void makeNoise() {
		System.out.println("wooooooo");
	}

	@Override
	void eat() {
		System.out.println("eaaat meat");
	}
}


 