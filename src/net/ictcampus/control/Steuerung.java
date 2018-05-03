package net.ictcampus.control;

import java.awt.event.KeyEvent;
import java.util.Set;

import net.ictcampus.view.Spielfeld;

public class Steuerung {
	
	Spielfeld spiel;
	
	public Steuerung(Spielfeld s) {
		spiel = s;
	}
	public void keyPressed(KeyEvent e) {

	    int key = e.getKeyCode();
	    
	    
	    if (key == KeyEvent.VK_LEFT) {
	        spiel.left = true;
	    }

	    if (key == KeyEvent.VK_RIGHT) {
	        spiel.right = true;
	    }

	}
}
