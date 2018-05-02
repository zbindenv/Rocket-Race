package net.ictcampus.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.ictcampus.model.Rakete;

public class Flugfeld extends JPanel{
	
	Rakete r1 = new Rakete(0);
	
	public Flugfeld() {
		
	}

	
	protected void paintComponent(Graphics g) {
		BufferedImage img = new BufferedImage(600, 800, BufferedImage.TYPE_INT_ARGB);
		g.drawImage(img,0,0,null);
		g.setColor(Color.BLACK);
	}	
}
