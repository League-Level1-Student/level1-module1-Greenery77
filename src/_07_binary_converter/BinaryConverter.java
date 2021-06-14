package _07_binary_converter;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{

	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	JLabel label = new JLabel();
	
	JTextField answer = new JTextField(20);
	
	JButton button = new JButton();
	
	public void createUI() {
		
		panel.add(button);
		
		panel.add(answer);
		
		panel.add(label);
		
		frame.add(panel);
		
		frame.setVisible(true);
		
		button.addActionListener(this);
		
		frame.pack();
	}

	public void actionPerformed(ActionEvent e) {
		
		String text = answer.getText();
		
		String convertText = convert(text);

		label.setText(convertText);
		
		frame.pack();
		
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	   
}
}
