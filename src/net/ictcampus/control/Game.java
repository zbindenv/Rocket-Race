package net.ictcampus.control;

import net.ictcampus.model.Rakete;
import net.ictcampus.view.Flugfeld;
import net.ictcampus.view.Spielfeld;

public class Game {
	
	//Instanzvariabeln definieren
	private int zaehleScore;
	Rakete rakete;
	Flugfeld flug;
	Spielfeld s;
	
	
	
	//Konstruktor
	public Game(Rakete r1, Flugfeld ff, Spielfeld spiel) {
	
		rakete=r1;
		flug=ff;
    	s=spiel;
		
	}
	
	//Zählt die Punkte
	public void zaehleScore() {

		System.out.println(s.getText());
		
		
		
	}
	
	//Spielablauf
	public void play() {
		while(true) {
			
			System.out.println(""); //MUSSS HIER BLEIBEN AMK
			if(s.left) {
				if(rakete.getxPos() >= 3) {
					rakete.setxPos(rakete.getxPos() -10);
					flug.repaint();
					s.setLeft(false);
				}
			}
			if(s.right) {
				if(rakete.getxPos()<(600 - 60)) {
					rakete.setxPos(rakete.getxPos() +10); 
					flug.repaint();
					s.setRight(false);
				}
			}
		}
	}
}
