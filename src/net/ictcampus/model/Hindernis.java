package net.ictcampus.model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import net.ictcampus.control.Game;

public class Hindernis extends JPanel{
	
	//Instanzvariablen
	private BufferedImage stone;
	private int bildnr = 0;
	private int xPos;
	private int yPos;
	private int breite;
	private int h�he;
	Rakete r;

	
	//Konstruktor mit x, yPos und der Variabel f�rs ausw�hlen ob es ein Meteor oder Satellit sein soll
	public Hindernis(int bildn, int xPos, int yPos,int breite, int h�he){
		this.bildnr = bildn;
		this.xPos =xPos;
		this.yPos = yPos;
		this.breite = breite;
		this.h�he = h�he;
		
		//Wenn die Nr unter 20 ist wid es ein Meteorit
		if(bildnr <=20) {
			try {       
					this.breite = 50;
					this.h�he = 185;
		          stone = ImageIO.read(new File("C:/Users/weilenmannj/RocketRace/Rocket-Race/src/net/ictcampus/view/stone.png"));

		       } catch (IOException ex) {
		            System.out.println(ex.getMessage());
		       }
		}
		
		//Wenn die Nummer zwischen 20 und 26 ist wird es ein Satellit
		else if(bildnr >= 21 && bildnr <=25) {
			
			try {     
				this.breite = 100;
				this.h�he = 86;
		          stone = ImageIO.read(new File("C:/Users/weilenmannj/RocketRace/Rocket-Race/src/net/ictcampus/view/satellite.png"));

		       } catch (IOException ex) {
		            System.out.println(ex.getMessage());
		       }
		}
	}
	public Rectangle getHitbox() {
		return new Rectangle(xPos, yPos, getBreite(),getH�he());
	}
	
	public boolean checkCollision(Rakete r, Game g) {
		if(( this.getHitbox()).intersects(r.getHitbox())) {
			System.out.println("Sie sind " +g.getTimer()+" km weit geflogen.");
			return true;
		}
		return false;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		repaint();
	}	
	
	
	//Defieniert das runterfallen des Objekts
	public int falleRunter() {
		
		return yPos = this.getyPos()-10;
		
		
	}
	//Getter und Setter
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	
	public BufferedImage getHindernis() {
		return stone;
	}
	
	public int getBreite() {
		return breite;
	}
	
	public void setBreite(int breite) {
		this.breite = breite;
	}
	
	public int getH�he() {
		return h�he;
	}
	
	public void setH�he(int h�he) {
		this.h�he = h�he;
	}
}
