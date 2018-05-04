package net.ictcampus.control;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import net.ictcampus.model.Rakete;
import net.ictcampus.view.Flugfeld;
import net.ictcampus.view.Spielfeld;

public class Game {

	// Instanzvariabeln definieren
	private int zaehleScore;
	int timer;
	Rakete rakete;
	Flugfeld flug;
	Spielfeld s;

	// Konstruktor
	public Game(Rakete r1, Flugfeld ff, Spielfeld spiel) {

		rakete = r1;
		flug = ff;
		s = spiel;
	}

	// Zählt die Punkte
	int zaehler = 10;

	public void counter(int zaehler) {
		timer = zaehler;
		System.out.println("adwad");

		Timer TimerA = new Timer();
		TimerTask TaskA = new TimerTask() {

			public void run() {
				if (timer >= 0) {
					System.out.println("" + timer);
					timer++;
				}
				if (timer == 100) {
					System.out.println("Aktion");
					TimerA.cancel();
				}
			}
		};
		TimerA.schedule(TaskA, 0, 2000);
	}

	// Spielablauf
	public void play() {
		while (true) {
			System.out.println(""); // MUUUUSSS HIER BLEIBEN AMK
			if (s.left) {
				if (rakete.getxPos() >= 3) {
					rakete.setxPos(rakete.getxPos() - 10);
					flug.repaint();
					s.setLeft(false);
				}
			}
			if (s.right) {
				if (rakete.getxPos() < (600 - 60)) {
					rakete.setxPos(rakete.getxPos() + 10);
					flug.repaint();
					s.setRight(false);
				}
			}
		}
	}

}
