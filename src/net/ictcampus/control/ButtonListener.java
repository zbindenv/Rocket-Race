package net.ictcampus.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import net.ictcampus.view.Spielfeld;


public class ButtonListener implements ActionListener{

	Spielfeld spiel;
	
	public ButtonListener(Spielfeld spiel) {
		Spielfeld s;
		this.spiel = spiel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		spiel.getStarteSpiel().setFocusable(false);		//Der Button wird nicht fokussiert
		spiel.setFocusable(true);						//Das Spielfeld wird fokussiert
		
		spiel.getG().counter(1);						//der Counter wird 
		
		spiel.setGestartet(true);
		spiel.repaint();

	}
}
