package net.ictcampus.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import net.ictcampus.model.Rakete;
import net.ictcampus.view.Spielfeld;

public class Steuerung implements KeyListener{
	
	//Instanzvariabeln
	Spielfeld spiel;
	Rakete r;
	
	//Konstruktor
	public Steuerung(Spielfeld s,Rakete r) {
		this.r=r;
		spiel = s;
	

	}

	//Schaut ob die rechte oder linke PFeiltaste gedrückt wurde und gibt true bei der jeweiligen Taste zurück
	public void keyPressed(KeyEvent e) {
	    
	    if (e.getKeyCode() == KeyEvent.VK_LEFT){
	        spiel.left = true;
	    }

	    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	        spiel.right = true;
	    }

	}

	public void keyReleased(KeyEvent arg0) {

		
	}

	public void keyTyped(KeyEvent arg0) {

	}
}
