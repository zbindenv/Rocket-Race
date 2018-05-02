package net.ictcampus.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.imageio.*;

public class Spielfeld extends JFrame {

	
	private JFrame Spielfeld = new JFrame();
	private JPanel navigation = new JPanel();
	private JButton starteSpiel = new JButton("Start");
	private JLabel text = new JLabel("100");
	private JTextField text2 = new JTextField("Rocket Race");
	private JPanel viereck = new JPanel();

	
	public Spielfeld() {
		super("Rocket Race");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		starteSpiel.setSize(200,50);
		text.setSize(200,50);
		text2.setSize(200, 50);
		navigation.setLayout(new GridLayout(1,2));
		navigation.add(text2);
		navigation.add(starteSpiel);
		navigation.add(text);
		add(navigation, BorderLayout.SOUTH);
		add(viereck, 10, 10);
		//starteSpiel.addActionListener();
		

	}
	
	
	public static void main(String[]args) {
		Spielfeld feld = new Spielfeld();
		feld.setSize(600, 800);
		feld.setVisible(true);
	}
		
		
}
