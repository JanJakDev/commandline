package de.jan.commandline.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	
	static String leader = "JanJakJar";

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Jaknam Clan");
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		
		JTextField jtf = new JTextField(30);
		
		panel.add(jtf);
		
		frame.add(panel);
		frame.setVisible(true);
		
		jtf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String input = jtf.getText();
					//String[] inputSplitted = input.split(" ");
					switch(input) {
					case "/clan":
						msg("Clanname: Jaknam", input);
						break;
					case "/anf�hrer":
						msg("Clananf�hrer: " + leader, input);
						break;
					case "/kontakt":
						String player = JOptionPane.showInputDialog(null, "Spielername:", input, JOptionPane.DEFAULT_OPTION);
						switch(player) {
						case "JanJakJar":
							msg("Discord: JanJakJar#3161", input);
							break;
						default:
							msg("Kein Kontakt zum Spieler \"" + player + "\" gefunden!", input);
						}
						break;
					case "/q":
						System.exit(0);
						break;
					case "/commands":
						msg("/clan /anf�hrer /kontakt /q", input);
					default:
						msg("Command nicht gefunden! Commands unter \"/commands\"!", input + "?");
					}
					jtf.setText("");
				}
			}
		});
	}
	
	public static void msg(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.DEFAULT_OPTION);
	}

}
