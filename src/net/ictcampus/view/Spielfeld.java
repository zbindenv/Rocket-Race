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

	private Flugfeld ff = new Flugfeld();
	private JFrame Spielfeld = new JFrame();
	private JPanel navigation = new JPanel();
	private JButton starteSpiel = new JButton("Start");
	private JLabel text = new JLabel("100");
	private JTextField text2 = new JTextField("Rocket Race");
<<<<<<< HEAD
	private JPanel viereck = new JPanel();
=======
	private Rakete r1 = new Rakete(1);
>>>>>>> 09b6fcd79d359d62cce599595054514bc182051d

	
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
<<<<<<< HEAD
		add(navigation, BorderLayout.SOUTH);
		add(viereck, 10, 10);
=======
//		BufferedImage image = null;
//		try {
//			BufferedImage image = ImageIO.read(imageFile);
//		}
//		catch(IOException ioex) {
//			//abort
//			System.exit(1);
//		}
		//Spielfeld.add(new JLabel(new ImageIcon(image)));
		
		ff.setLayout(new GridLayout());

		
				
		add(navigation, BorderLayout.SOUTH);
		add(ff, BorderLayout.CENTER);
		
		
>>>>>>> 09b6fcd79d359d62cce599595054514bc182051d
		//starteSpiel.addActionListener();
		

	}
	
	
	public static void main(String[]args) {
		Spielfeld feld = new Spielfeld();
		feld.setSize(600, 800);
		feld.setVisible(true);
	}
		
		
}
