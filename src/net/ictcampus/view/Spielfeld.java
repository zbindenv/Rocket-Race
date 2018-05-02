package net.ictcampus.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.ictcampus.model.Rakete;

public class Spielfeld extends JFrame {

	private Flugfeld ff = new Flugfeld();
	private JFrame Spielfeld = new JFrame();
	private JPanel navigation = new JPanel();
	private JButton starteSpiel = new JButton("Start");
	private JLabel text = new JLabel("100");
	private JTextField text2 = new JTextField("Rocket Race");
	private Rakete r1 = new Rakete(1);

	
	public Spielfeld() {
		super("Rocket Race");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		File imageFile = new File("C:/Bilder/bild.jpg");
		
		starteSpiel.setSize(200,50);
		text.setSize(200,50);
		text2.setSize(200, 50);
		navigation.setLayout(new GridLayout(1,2));
		navigation.add(text2);
		navigation.add(starteSpiel);
		navigation.add(text);
		
		ff.setLayout(null);
		
		ff.add(r1);
		
				
		add(navigation, BorderLayout.SOUTH);
		add(ff, BorderLayout.CENTER);
		
		
		//starteSpiel.addActionListener();

	}
		
	
	public static void main(String[]args) {
		Spielfeld feld = new Spielfeld();
		feld.setSize(600, 800);
		feld.setVisible(true);
	}
		
		
}
