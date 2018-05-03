package net.ictcampus.model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Hindernis extends JPanel{
	
	//Instanzvariablen
	private BufferedImage stone;
	private int bildnr = 0;
	private int xPos;
	private int yPos;
	
	//Konstruktor mit x, yPos und der Variabel fürs auswählen ob es ein Meteor oder Satellit sein soll
	public Hindernis(int bildn, int xPos, int yPos){
		this.bildnr = bildn;
		this.xPos =xPos;
		this.yPos = yPos;
		
		//Wenn die Nr unter 20 ist wid es ein Meteorit
		if(bildnr <=20) {
			try {                
		          stone = ImageIO.read(new File("C:/Users/weilenmannj/RocketRace/Rocket-Race/src/net/ictcampus/view/stone.png"));
		       } catch (IOException ex) {
		            System.out.println(ex.getMessage());
		       }
		}
		//Wenn die Nummer zwischen 20 und 26 ist wird es ein Satellit
		else if(bildnr >= 21 && bildnr <=25) {
			try {                
		          stone = ImageIO.read(new File("C:\\Users\\weilenmannj\\RocketRace\\Rocket-Race\\src\\net\\ictcampus\\view\\satellite.png"));
		       } catch (IOException ex) {
		            System.out.println(ex.getMessage());
		       }
		}
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
	
}
