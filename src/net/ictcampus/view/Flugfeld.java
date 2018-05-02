package net.ictcampus.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import net.ictcampus.model.Rakete;

public class Flugfeld extends JPanel{
	
	private BufferedImage image;
	private Rakete rakete;
	
	public Flugfeld(Rakete r) {
		rakete = r;
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
		g.drawImage(rakete.getRocket(),rakete.getxPos(),rakete.getyPos(),null);
	}	
}
