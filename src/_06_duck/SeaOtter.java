package _06_duck;

public class SeaOtter {
	
	int age;
	String name;
	
	public void swim() {
		
		System.out.println(name + " swims around.");
		
	}
	
	public void eat(){
		
		System.out.println(name + " eats some shrimp.");
		
	}
	
	SeaOtter(String name, int age) {
	       this.name = name;
	       this.age = age;
	}
}
