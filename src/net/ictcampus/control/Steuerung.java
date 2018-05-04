package net.ictcampus.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import net.ictcampus.model.Rakete;
import net.ictcampus.view.Spielfeld;

public class Steuerung implements KeyListener{
	
	Spielfeld spiel;
	Rakete r;
	
	public Steuerung(Spielfeld s,Rakete r) {
		this.r=r;
		spiel = s;
	

	}

	public Steuerung(Spielfeld spiel) {
		this.spiel= spiel;
	}
	
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == spiel.getStarteSpiel()){
        	//spiel.getText().setText("adad");
        	JOptionPane.showMessageDialog(null,"setText");
//        	spiel.getText().setText("adad");

        }
        }
	
	public void keyPressed(KeyEvent e) {
	    
	    if (e.getKeyCode() == KeyEvent.VK_LEFT){
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
