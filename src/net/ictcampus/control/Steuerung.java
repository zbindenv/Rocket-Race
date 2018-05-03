package net.ictcampus.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Set;

import net.ictcampus.model.Rakete;
import net.ictcampus.view.Spielfeld;

public class Steuerung implements KeyListener{
	
	Spielfeld spiel;
	Rakete r;
	
	public Steuerung(Spielfeld s,Rakete r) {
		this.r=r;
		spiel = s;
		System.out.println("AUES HUERESÖHN");

	}
	public void keyPressed(KeyEvent e) {
	    
	    if (e.getKeyCode() == KeyEvent.VK_LEFT) {	    	
	        spiel.left = true;
	    }

	    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	        spiel.right = true;
	    }

	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
