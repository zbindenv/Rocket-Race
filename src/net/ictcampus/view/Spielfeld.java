package net.ictcampus.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.imageio.*;

import net.ictcampus.model.Rakete;

public class Spielfeld extends JFrame {

	private Flugfeld ff;
	private JFrame Spielfeld = new JFrame();
	private JPanel navigation = new JPanel();
	private JButton starteSpiel = new JButton("Start");
	private JLabel text = new JLabel("100");
	private JTextField text2 = new JTextField("Rocket Race");

	private JPanel viereck = new JPanel();
	private Rakete r1 = new Rakete(1,300, 600);


	
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
		r1.setxPos(300);
		r1.setyPos(400);
		ff =  new Flugfeld(r1);
		ff.setLayout(new GridLayout());
		
		add(ff, BorderLayout.CENTER);
//		viereck.add(new JButton("Hello!"));
//		viereck.setLocation(150, 150);
//		ff.add(viereck);
		

	}
	
	
	public static void main(String[]args) {
		Spielfeld feld = new Spielfeld();
		feld.setSize(600, 800);
		feld.setVisible(true);
	}
		
		
}
