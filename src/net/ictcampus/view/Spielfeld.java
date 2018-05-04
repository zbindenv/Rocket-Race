package net.ictcampus.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.ictcampus.control.ButtonListener;
import net.ictcampus.control.Game;
import net.ictcampus.control.HindernisseFallen;
import net.ictcampus.control.Steuerung;
import net.ictcampus.model.Hindernis;
import net.ictcampus.model.Rakete;

public class Spielfeld extends JFrame {
	
	//Instanzvariabeln
	private Flugfeld ff;
    private JFrame Spielfeld = new JFrame();
	private JPanel navigation = new JPanel();
	private JButton starteSpiel = new JButton("Start");
	private JLabel text = new JLabel();
	private JLabel text2 = new JLabel("Rocket Race");
	private Game g;
	public Game getG() {
		return g;
	}

	public void setG(Game g) {
		this.g = g;
	}


	private Rakete r1=new Rakete(1,50,50,48,251);
	public boolean left = false;
	public boolean right = false;

	public Hindernis s1 = new Hindernis(23, 100 , -220,0,0);
	public Hindernis s2 = new Hindernis(3, 400 , -100,0,0);
	public Hindernis s3 = new Hindernis(3, 600 , -400,0,0);
	public Hindernis s4 = new Hindernis(3, 200 , -0,0,0);
	public ArrayList<Hindernis> hindernisse = new ArrayList<>();
	public boolean gestartet = false;

	
	

	//Konstruktor
	public Spielfeld() {
		super("Rocket Race");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		starteSpiel.addActionListener(new ButtonListener(this));
		
		starteSpiel.setSize(200,50);				//der Button bekommt eine gr�sse
		text.setSize(200,50);						//text bekommt gr�sse
		text2.setSize(200, 50);						//text 2 bekommt gr�sse
       	navigation.setLayout(new GridLayout(1,2));	//Die Navigation bekommt ein Layout und die Buttons und Labels werden hinzugef�gt
		navigation.add(text2);
		navigation.add(starteSpiel);
		navigation.add(text);

		add(navigation, BorderLayout.SOUTH);		//Die Navigation wird auf das Spielfeld gesetzt(im s�den)

		r1.setxPos(270);							//Rakete bekommt Startkoordinaten
		r1.setyPos(480);	
		hindernisse.add(s1);
		hindernisse.add(s2);
		hindernisse.add(s3);
		hindernisse.add(s4);
		ff =  new Flugfeld(r1,hindernisse);			//ein neues Flugfeld mit einem Hindernis und einer Rakete werden erstellt
		ff.setLayout(new GridLayout());				//Das Flugfeld bekommt ein Layout
		Steuerung ki = new Steuerung(this,r1);		//Steuerung
        addKeyListener(ki);
        setFocusable(true);
        System.out.println("sdadsad");

		
		add(ff, BorderLayout.CENTER);				//Das Flugfeld ins Center gesetzt
		
		
		
	}

	public static void main(String[]args) {
		Spielfeld feld = new Spielfeld();
		feld.g = new Game(feld.r1,feld.ff,feld);
		feld.setSize(600, 800);
		feld.setVisible(true);
		feld.g.counter(1);
		feld.setSize(600, 800);
		feld.setVisible(true);
//<<<<<<< HEAD
		while(!feld.gestartet) {
			System.out.print("");
		}
		
		HindernisseFallen f = new HindernisseFallen(feld.g,feld.gestartet,feld.r1,feld.ff,feld);
//=======
//		HindernisseFallen f = new HindernisseFallen(feld.g,feld.gestartet,feld.r1,feld.ff,feld, feld.s1);
//>>>>>>> 54b980aa1b5839541877c8da9b3df6d67b5f5c15
		f.start();
	}
	
	//Getters und Setters
	public Rakete getR1() {
		return r1;
	}


	public boolean isLeft() {
		return left;
	}


	public void setLeft(boolean left) {
		this.left = left;
	}


	public boolean isRight() {
		return right;
	}


	public void setRight(boolean right) {
		this.right = right;
	}


	public void setR1(Rakete r1) {
		this.r1 = r1;
	}

	public JLabel getText() {
		return text;
	}
	
	
	public void setText(String text) {
		this.text.setText(text);
	}

	public JButton getStarteSpiel() {
		return starteSpiel;
	}
	
	
	public void setStarteSpiel(JButton starteSpiel) {
		this.starteSpiel = starteSpiel;
	}
	
	public void setGestartet(boolean gestartet) {
		this.gestartet = gestartet;
	}

		
		
}
