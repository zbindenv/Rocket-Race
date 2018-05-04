package net.ictcampus.model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Rakete extends JPanel{
	//Instanzvariabeln
	private int speed;
	private int xPos;
	private int yPos;
	private int breite;
	private int höhe;
	private BufferedImage rocket;

	//Konstruktor
	public Rakete(int speed, int xPos, int yPos,int breite, int höhe){
	this.speed = speed;
	this.xPos = xPos;
	this.yPos = yPos;
	this.breite=breite;
	this.höhe=höhe;

	//fügt das Bild ein, wenn die URL stimmt, sonst wird die Errormessage ausgegeben	
	try {                
        rocket = ImageIO.read(new File("C:/RocketRace/src/net/ictcampus/view/rakete.png"));
     } catch (IOException ex) {
          System.out.println(ex.getMessage());
     }
		
	}
	
	
	public Rectangle getHitbox() {
		return new Rectangle(xPos, yPos, getBreite(),getHöhe());
	}

	//Bild wird hinzugefügt
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		repaint();
	}	
	
	//Getters und Setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
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

	public BufferedImage getRocket() {
		return rocket;
	}

	public void setRocket(BufferedImage rocket) {
		this.rocket = rocket;
	}

	public int getHöhe() {
		return höhe;
	}

	public void setHöhe(int height) {
		this.höhe = height;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int width) {
		this.breite = width;
	}
}
