package net.ictcampus.model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Rakete extends JPanel{
	
	private int speed;
	private int xPos;
	private int yPos;
	private BufferedImage rocket;


	public Rakete(int speed){
	this.speed = speed;
		
	try {                
        rocket = ImageIO.read(new File("C:/RocketRace/src/net/ictcampus/view/rakete.png"));
     } catch (IOException ex) {
          System.out.println(ex.getMessage());
          System.out.println("Test");
     }
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(rocket,0,0,null);
	}	
	
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
}
