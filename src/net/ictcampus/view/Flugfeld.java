package net.ictcampus.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import net.ictcampus.model.Hindernis;
import net.ictcampus.model.Rakete;

public class Flugfeld extends JPanel{
	//Instanzvariabeln
	private BufferedImage image;
	private Rakete rakete;
	private Hindernis hindernis;
	
	//Konstruktor
	public Flugfeld(Rakete r, Hindernis s) {
	    rakete = r;
		hindernis = s;
		try {
	          image = ImageIO.read(new File("C:/RocketRace/src/net/ictcampus/view/finalback.png"));	//Bild wird einegelesen
	       } catch (IOException ex) {
	            System.out.println(ex.getMessage());
	       }
		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(image,0,0,null); 														//Zeichnet HinterGrundbild
		g.drawImage(rakete.getRocket(),rakete.getxPos(),rakete.getyPos(),rakete.getBreite(),rakete.getHöhe(),null); 			//Zeichnet Rakete
		g.drawImage(hindernis.getHindernis(),hindernis.getxPos(),hindernis.getyPos(),null);
		repaint();

	}	
	//Getters Setters
	public Rakete getRakete() {
		return rakete;
	}

	public void setRakete(Rakete rakete) {
		this.rakete = rakete;
	}
	
	public Hindernis getHindernis() {
		return hindernis;
	}

	public void setHindernis(Hindernis hindernis) {
		this.hindernis = hindernis;
	}


}
