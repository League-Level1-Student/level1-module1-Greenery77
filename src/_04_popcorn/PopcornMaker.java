package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		
		String flavor = JOptionPane.showInputDialog("What flavor would you like your popcorn?");
		
		String time = JOptionPane.showInputDialog("How long would you like your popcorn to be in the microwave?");
		
		int timet = Integer.parseInt(time);
		
		Popcorn pop = new Popcorn(flavor);
		
		Microwave micro = new Microwave();
		
		micro.putInMicrowave(pop);
		
		micro.setTime(timet);
		
		micro.startMicrowave();
		
	}
	
}
