package AbstractDemo;

abstract class Animal{
	
	public String name;
	public int age;
    
	abstract void makeSound();
	
}


class Cat extends Animal{
	
	public Cat(String name, int age){
		super.age=age;
		super.name=name;
	}
	
	void makeSound(){
		System.out.println("Name: "+this.name+" Age: " + this.age);	
		System.out.println("Meow-Meow");
		System.out.println();
	}
	
}


class Dog extends Animal{
	
	public Dog(String name, int age){
		super.age=age;
		super.name=name;
	}
	
	void makeSound(){
		System.out.println("Name: "+this.name+" Age: " + this.age);	
		System.out.println("Barks");
		System.out.println();
	}
	
}


public class AbstractDemo {

	public static void main(String[] args) {
		
		Cat obj = new Cat("Tinni",5);
		Dog obj1 = new Dog("Sheru",7);
		
		obj.makeSound();
		obj1.makeSound();
		
	}

}
