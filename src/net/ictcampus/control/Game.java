package net.ictcampus.control;

import net.ictcampus.model.Rakete;
import net.ictcampus.view.Spielfeld;

public class Game {

	private int zaehleScore;
	
	Spielfeld s;
	Rakete r1;
	
	public void zaehleScore() {
		//if()
		
		for(int i = 0; i < 1000; i++) {
			
		}
	}
	
	public void play() {
		while(true) {
			if(s.left) {
				r1.setxPos(r1.getxPos() -50); 
			}
			if(s.right) {
				r1.setxPos(r1.getxPos() +50); 
			}
		}
	}
	
}
