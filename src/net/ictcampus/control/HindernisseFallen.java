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
	
	public HindernisseFallen(Game g, boolean gestartet, Rakete r1, Flugfeld ff, Spielfeld sf){
		rakete=r1;
		flug=ff;
    	this.s=sf;
		this.spiel = gestartet;
		
			while(spiel) {
				
				
				System.out.print("power");
				
				for(Hindernis h : g.s.hindernisse) {
					h.setyPos(h.getyPos()+10);
					
					move(h, s);
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
		
		randomZahl1 = (int) (Math.random()*-600 - h.getHeight());
		randomZahl2 = (int) (Math.random()*550);
		System.out.println(h.getxPos());
		if (h.getyPos() > sf.getHeight()) {
			h.setxPos(randomZahl2);
			h.setyPos(randomZahl1);
			h.repaint();
		}
		
		
		
		
		
		/*int randomZahl1;
		int randomZahl2;
		
		randomZahl1 = (int) (Math.random()*25);
		randomZahl2 = (int) (Math.random()*600);
		
		sf.hindernisse.add (new Hindernis(randomZahl1, randomZahl2, 0));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}
	
	public void run() {
		
		
		
	}

}
