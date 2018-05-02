package net.ictcampus.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import net.ictcampus.model.Rakete;

public class Flugfeld extends JPanel{
	
	Image img;
	
	public Flugfeld() {
		
		img =  Toolkit.getDefaultToolkit().createImage("background.jpg");
		
	}
	
	protected void paintComponent(Graphics g) {
		BufferedImage img = new BufferedImage(600, 750, BufferedImage.TYPE_INT_ARGB);
		g.drawImage(img,0,0,null);
		g.setColor(Color.BLACK);
	}	
}
