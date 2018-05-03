package net.ictcampus.control;

import net.ictcampus.model.Rakete;
import net.ictcampus.view.Flugfeld;
import net.ictcampus.view.Spielfeld;

public class Game {
	Rakete rakete;
	Flugfeld flug;
	Spielfeld s;
	public Game(Rakete r1, Flugfeld ff, Spielfeld spiel) {
		rakete=r1;
		flug=ff;
		s=spiel;
		
	}

	private int zaehleScore;
	
	
	public void zaehleScore() {
		//if()
		
		for(int i = 0; i < 1000; i++) {
			
		}
	}
	
	public void play() {
		while(true) {
			System.out.println(""); //MUUUUSSS HIER BLEIBEN AMK
			if(s.left) {
				System.out.println(rakete.getxPos());
				rakete.setxPos(rakete.getxPos() -10);
				flug.repaint();
				System.out.println("links");
				s.setLeft(false);
			}
			if(s.right) {
				rakete.setxPos(rakete.getxPos() +10); 
				flug.repaint();
				s.setRight(false);
			}
		}
	}
	
}
