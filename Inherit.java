
package inheritance;

public class Inherit {
	abstract class Animal{
		public abstract void makeNoise();
		public abstract void eat();
		public abstract void roam();
		public void sleep() {
			System.out.println("Animal sleeps");
		}
		
	}
	abstract class Feline extends Animal{
		public void roam() {
			System.out.println("Feline roams");
		}
	}
	class Tiger extends Feline{
	
		public void eat() {
			System.out.println("Tiger eats");	
		}
		public void makeNoise() {
			System.out.println("Tiger grunts");	
		}
	}
	class Lion extends Feline{
		
		public void eat() {
			System.out.println("Lion eats");	
		}
		public void makeNoise() {
			System.out.println("Lion roars");	
		}
	}
	class Cat extends Feline{
		
		public void eat() {
			System.out.println("Cat eats");	
		}
		public void makeNoise() {
			System.out.println("Cat mews");	
		}
	}
	abstract class Canine extends Animal{
		public void roam() {
			System.out.println("Canine roams");
		}
		
	}
	class Wolf extends Canine{
		
		public void eat() {
			System.out.println("Wolf eats");	
		}
		public void makeNoise() {
			System.out.println("Wolf grunts");	
		}
	}
	class Dog extends Canine{
		
		public void eat() {
			System.out.println("Dog eats");	
		}
		public void makeNoise() {
			System.out.println("Dog barks");	
		}
	}
	abstract class Hippo extends Animal{
		
		public void eat() {
			System.out.println("Dog eats");	
		}
		public void makeNoise() {
			System.out.println("Dog barks");	
		}
	}
}