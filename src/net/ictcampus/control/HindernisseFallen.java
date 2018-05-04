package net.ictcampus.control;

import net.ictcampus.model.Hindernis;
import net.ictcampus.model.Rakete;
import net.ictcampus.view.Flugfeld;
import net.ictcampus.view.Spielfeld;

public class HindernisseFallen extends Thread{
	
	boolean spiel = false;
	Rakete rakete;
	Flugfeld flug;
	Spielfeld s;
	Hindernis h;
	Game g;
	int speed = 10;
	
	
	public HindernisseFallen(Game g, boolean gestartet, Rakete r1, Flugfeld ff, Spielfeld sf){
		rakete=r1;
		flug=ff;
    	this.s=sf;
		this.spiel = gestartet;
		this.g=g;
		
			while(spiel) {
				
				
				for(Hindernis h : g.s.hindernisse) {
					
					h.setyPos(h.getyPos()+speed);
					
					if(h.checkCollision(rakete,g)) {
						int a =g.punkte;
						s.getG().cancleTimer();
						this.spiel=false;						
					}
					move(h, s);
					
				}
				
				if(s.getG().getTimer()==10) {
					
					setMeteorSpeed(12);
					rakete.setSpeed(16);
					
				}
				else if(s.getG().getTimer()==20) {
					
					setMeteorSpeed(14);
					rakete.setSpeed(17);
					
				}
				else if(s.getG().getTimer()==30) {
					
					setMeteorSpeed(16);
					rakete.setSpeed(18);
					
				}
				else if(s.getG().getTimer()==40) {
					
					setMeteorSpeed(18);
					rakete.setSpeed(19);
					
				}
				else if(s.getG().getTimer()==50) {
					
					setMeteorSpeed(20);
					rakete.setSpeed(20);
					
				}
				else if(s.getG().getTimer()==55) {
					
					setMeteorSpeed(22);

					
				}
				else if(s.getG().getTimer()==60) {
					
					setMeteorSpeed(24);

					
				}
				

				
				
				
				if(s.left) {
					if(rakete.getxPos() >= 3) {
						rakete.setxPos(rakete.getxPos() -rakete.getSpeed());
						flug.repaint();
						s.setLeft(false);
					}
				}
				if(s.right) {
					if(rakete.getxPos()<(600 - 60)) {
						rakete.setxPos(rakete.getxPos() +rakete.getSpeed()); 
						flug.repaint();
						s.setRight(false);
					}
				}
				s.getText().setText(g.timer+"");	
				g.s.s1.repaint();
				
				g.s.repaint();
				
				
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
				
		}
	}


	public void move(Hindernis h, Spielfeld sf) {
		int randomZahl1;
		int randomZahl2;
		
		randomZahl1 = (int) (Math.random()*-600 - h.getHöhe());
		randomZahl2 = (int) (Math.random()*550);
		if (h.getyPos() > sf.getHeight()) {
			h.setxPos(randomZahl2);
			h.setyPos(randomZahl1);
			h.repaint();
		}

	}
	public int getMeteorSpeed() {
		return speed;
	}

	public void setMeteorSpeed(int speed) {
		this.speed = speed;
	}
}
