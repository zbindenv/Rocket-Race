package net.ictcampus.model;

public class Rakete {
	
	private int speed;
	private int xPos;
	private int yPos;
	

	public Rakete(int speed) {
	this.speed = speed;
	
		
		
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
}
