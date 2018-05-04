package net.ictcampus.control;

import java.util.Timer;
import java.util.TimerTask;

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
	int punkte=0;
	Timer timerA;
	
	// Konstruktor
	public Game(Rakete r1, Flugfeld ff, Spielfeld spiel) {

		rakete = r1;
		flug = ff;
		s = spiel;
	}

	// Zählt die Punkte
	int zaehler = 10;

	public void counter(int zaehler) {
	//	timer = zaehler;
		System.out.println("adwad");

		timerA = new Timer();
		TimerTask taskA = new TimerTask() {

			public void run() {
				if (timer >= 0) {
					//System.out.println("" + timer);
					punkte=timer;
					timer +=1;
				}
				if (timer == 100) {
					System.out.println("Aktion");
					punkte=timer;
					//TimerA.cancel();
				}
			}
		};
		timerA.schedule(taskA, 0, 1000);
	}
	
	public void cancleTimer() {
		timerA.cancel();
	}

	// Zählt die Punkte
	public void zaehleScore() {
		System.out.println(s.getText());

	}

	// Spielablauf
	public void play() {
		while (true) {
			System.out.println(""); // MUUUUSSS HIER BLEIBEN AMK
			if (s.left) {
				if (rakete.getxPos() >= 3) {
					rakete.setxPos(rakete.getxPos() - 10);

					while (true) {
						System.out.println(""); // MUSSS HIER BLEIBEN AMK
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
		}
	}
	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}
}