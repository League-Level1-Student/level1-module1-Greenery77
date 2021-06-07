package _05_vault;

public class JamesBond {

	public int findCode(Vault e) {
		
		for (int i = 0; i < 1000000; i++) {
		
			if (e.tryCode(i)){
			
			return i;
				
			}
		}
		
		return -1;
		
	}
	
	
}
