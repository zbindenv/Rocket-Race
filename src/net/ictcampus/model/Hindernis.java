package net.ictcampus.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Hindernis {
	
	private BufferedImage stone;
	private int bildnr = 0;
	private int xPos;
	private int yPos;
	
	public Hindernis(int bildn, int xPos, int yPos){
		this.bildnr = bildn;
		this.xPos =xPos;
		this.yPos = yPos;
		if(bildnr <=20) {
			try {                
		          stone = ImageIO.read(new File("C:/Users/weilenmannj/RocketRace/Rocket-Race/src/net/ictcampus/view/stone.png"));
		       } catch (IOException ex) {
		            System.out.println(ex.getMessage());
		            System.out.println("Test");
		       }
		}
		else if(bildnr >= 21 && bildnr <=25) {
			try {                
		          stone = ImageIO.read(new File("C:\\Users\\weilenmannj\\RocketRace\\Rocket-Race\\src\\net\\ictcampus\\view\\satellite.png"));
		       } catch (IOException ex) {
		            System.out.println(ex.getMessage());
		            System.out.println("Test");
		       }
		}
	}
	
	public int falleRunter() {
		
		return yPos = this.getyPos()-10;
		
		
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
	
	public BufferedImage getHindernis() {
		return stone;
	}
	
}
