package net.ictcampus.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
<<<<<<< HEAD
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
=======
>>>>>>> 09b6fcd79d359d62cce599595054514bc182051d
import javax.swing.JPanel;

public class Flugfeld extends JPanel{
	
	private BufferedImage image;
	
	public Flugfeld() {
		
		try {                
	          image = ImageIO.read(new File("C:/Users/weilenmannj/RocketRace/Rocket-Race/src/net/ictcampus/view/back1.jpg"));
	       } catch (IOException ex) {
	            System.out.println(ex.getMessage());
	            System.out.println("Test");
	       }
		
	}

	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image,0,0,null);
	}	
}
