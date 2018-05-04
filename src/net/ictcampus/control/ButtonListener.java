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

		
		spiel.getStarteSpiel().setFocusable(false);
		spiel.setFocusable(true);
		
		spiel.getG().counter(1);
		
		spiel.setGestartet(true);
		spiel.repaint();

	}
}
