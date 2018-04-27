package net.ictcampus.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Flugfeld extends JPanel{
	
	protected void paintComponent(Graphics g) {
		BufferedImage img = new
			    BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		g.drawImage(img,0,0,null);
	}
	
}
