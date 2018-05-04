package net.ictcampus.control;

import net.ictcampus.model.Hindernis;
import net.ictcampus.model.Rakete;
import net.ictcampus.view.Flugfeld;
import net.ictcampus.view.Spielfeld;

public class HindernisseFallen extends Thread{
	
	boolean spiel = false;
	private int zaehleScore;
	Rakete rakete;
	Flugfeld flug;
	Spielfeld s;
	Hindernis h;
	Game g;
	
	public HindernisseFallen(Game g, boolean gestartet, Rakete r1, Flugfeld ff, Spielfeld sf, Hindernis hh){
		rakete=r1;
		flug=ff;
    	this.s=sf;
		this.spiel = gestartet;
		h = hh;
		this.g=g;
		
			while(spiel) {
				
				
				System.out.println("power");
				System.out.println(rakete.getHitbox());
				System.out.println(h.getHitbox());
				
				g.s.s1.setyPos(g.s.s1.getyPos()+10);
				if(h.checkCollision(rakete,g)) {
					int a =g.punkte;
					s.getG().cancleTimer();
					this.spiel=false;
					
					
				}
				
				
				if(s.left) {
					if(rakete.getxPos() >= 3) {
						rakete.setxPos(rakete.getxPos() -15);
						flug.repaint();
						s.setLeft(false);
					}
				}
				if(s.right) {
					if(rakete.getxPos()<(600 - 60)) {
						rakete.setxPos(rakete.getxPos() +15); 
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
	
}
