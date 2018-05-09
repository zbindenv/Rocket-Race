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

	//Rakete wird kreiert mit Speed, Position, und grösse
	private Rakete r1=new Rakete(15,50,50,48,176);
	public boolean left = false;
	public boolean right = false;
	
	//neue Hindernisse mit Startpositionen werden erstellt
	public Hindernis s1 = new Hindernis(23, 30 , -135,0,0);
	public Hindernis s2 = new Hindernis(3, 140 , -785,0,0);
	public Hindernis s3 = new Hindernis(3, 300 , -185,0,0);
	public Hindernis s4 = new Hindernis(3, 500 , -385,0,0);
	public Hindernis s5 = new Hindernis(23, 390, -485,0,0);
	public ArrayList<Hindernis> hindernisse = new ArrayList<>();	//Das HindernisArray wird erstellt
	public boolean gestartet = false;								//gestartet wird auf false initialisiert

	
	

	//Konstruktor
	public Spielfeld() {
		super("Rocket Race");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		starteSpiel.addActionListener(new ButtonListener(this));
		
		starteSpiel.setSize(200,50);				//der Button bekommt eine grösse
		text.setSize(200,50);						//text bekommt grösse
		text2.setSize(200, 50);						//text 2 bekommt grösse
       	navigation.setLayout(new GridLayout(1,2));	//Die Navigation bekommt ein Layout und die Buttons und Labels werden hinzugefügt
		navigation.add(text2);
		navigation.add(starteSpiel);
		navigation.add(text);

		add(navigation, BorderLayout.SOUTH);		//Die Navigation wird auf das Spielfeld gesetzt(im süden)

		r1.setxPos(270);							//Rakete bekommt Startkoordinaten
		r1.setyPos(560);	
		hindernisse.add(s1);						//neue Hindernisse werden ins Array gespeichert
		hindernisse.add(s2);
		hindernisse.add(s3);
		hindernisse.add(s4);
		hindernisse.add(s5);
		ff =  new Flugfeld(r1,hindernisse);			//ein neues Flugfeld mit einem Hindernis und einer Rakete werden erstellt
		ff.setLayout(new GridLayout());				//Das Flugfeld bekommt ein Layout
		Steuerung ki = new Steuerung(this,r1);		//Steuerung
        addKeyListener(ki);
        setFocusable(true);
		
		add(ff, BorderLayout.CENTER);				//Das Flugfeld ins Center gesetzt
		
		
		
	}
	//Spiel wird zusammengesetzt und gestartet wenn der Button geklickt weird.
	public static void main(String[]args) {
		Spielfeld feld = new Spielfeld();
		feld.g = new Game(feld.r1,feld.ff,feld);
		feld.setSize(600, 800);
		feld.setVisible(true);

		while(!feld.gestartet) {
			System.out.print("");
		}
		
		HindernisseFallen f = new HindernisseFallen(feld.g,feld.gestartet,feld.r1,feld.ff,feld);	//Das Spiel wird mit einem kreiert
		f.start();																					//Das Spiel wird gestartet
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
