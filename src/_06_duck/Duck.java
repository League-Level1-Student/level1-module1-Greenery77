package _06_duck;

public class Duck {

	int numberOfFriends;
	String favoriteFood;
	
	public void quack() {
		
		System.out.println("The duck quacks happily.");
		
	}
	
	public void waddle(){
		
		System.out.println("The duck waddles away. Waddle waddle, till the very next day bum bum bum b-");
		
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}

}
