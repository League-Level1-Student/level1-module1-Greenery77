package _05_vault;

public class Runner {

	public static void main(String[] args) {
		
		Vault v = new Vault();
		
		JamesBond j = new JamesBond();
			
		System.out.println(j.findCode(v));
	
	}
	
}
