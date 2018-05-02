package net.ictcampus.control;

import java.awt.event.KeyEvent;

public class Steuerung {
	
	public void keyPressed(KeyEvent e) {

	    int key = e.getKeyCode();
	    
	    
	    if (key == KeyEvent.VK_LEFT) {
	        System.out.println("links");
	    }

	    if (key == KeyEvent.VK_RIGHT) {
	        //dx = 1;
	    }

	    if (key == KeyEvent.VK_UP) {
	        //dy = -1;
	    }

	    if (key == KeyEvent.VK_DOWN) {
	        //dy = 1;
	    }
	}
}
