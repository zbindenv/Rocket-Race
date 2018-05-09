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

	// Zählt die Sekunden, wie lange schon geflogen wird
	public void counter(int zaehler) {


		timerA = new Timer();							
		TimerTask taskA = new TimerTask() {

			public void run() {
				if (timer >= 0) {
					punkte=timer;
					timer +=1;
				}
				if (timer == 20) {
					System.out.println("Aktion");
					punkte=timer;
				}
			}
		};
		timerA.schedule(taskA, 0, 1000);
	}
	
	public void cancleTimer() {
		timerA.cancel();
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}
}