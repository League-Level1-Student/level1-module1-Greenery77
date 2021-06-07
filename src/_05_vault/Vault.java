package _05_vault;

import java.util.Random;

public class Vault {

	int code = new Random().nextInt(1000000);
	
	public boolean tryCode(int n) {
		
		if (code == n){
		
		return true;
		
		}
		
		else {
			
		return false;
			
		}
	}
	
	
}
