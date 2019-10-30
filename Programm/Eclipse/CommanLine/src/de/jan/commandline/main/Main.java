package de.jan.commandline.main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String input;
		boolean next = true;
		do {
			input = JOptionPane.showInputDialog(null, "Command:", "Command Line", JOptionPane.DEFAULT_OPTION);
			switch(input) {
			case "/exit":
				next = false;
			break;
			case "/help":
				msg("/commands", "/help");
			}
		}while(next);

	}
	
	public static void msg(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.DEFAULT_OPTION);
	}

}
