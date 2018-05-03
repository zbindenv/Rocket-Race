package net.ictcampus.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
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
		JOptionPane.showMessageDialog(null,"Klickt");
	}
}
