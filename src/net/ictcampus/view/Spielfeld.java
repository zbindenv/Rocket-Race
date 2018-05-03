package net.ictcampus.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.imageio.*;

import net.ictcampus.control.Game;
import net.ictcampus.model.Hindernis;
import net.ictcampus.control.Steuerung;
import net.ictcampus.model.Rakete;

public class Spielfeld extends JFrame {

	private Flugfeld ff;
	private JFrame Spielfeld = new JFrame();
	private JPanel navigation = new JPanel();
	private JButton starteSpiel = new JButton("Start");
	private JLabel text = new JLabel("100");
	private JLabel text2 = new JLabel("Rocket Race");
	private Rakete r1=new Rakete(1,50,50);
	
	public boolean left = false;
	public boolean right = false;
	public Hindernis s1 = new Hindernis(23, 300 , 0);
	
	public Spielfeld() {
		super("Rocket Race");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		starteSpiel.setSize(200,50);
		text.setSize(200,50);
		text2.setSize(200, 50);
       	navigation.setLayout(new GridLayout(1,2));
		navigation.add(text2);
		navigation.add(starteSpiel);
		navigation.add(text);

		add(navigation, BorderLayout.SOUTH);

		r1.setxPos(230);
		r1.setyPos(300);
		ff =  new Flugfeld(r1,s1);
		ff.setLayout(new GridLayout());
		Steuerung ki = new Steuerung(this,r1);
        addKeyListener(ki);
        setFocusable(true);

		
		add(ff, BorderLayout.CENTER);
		
		
		
	}
	
	
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


	public static void main(String[]args) {
		Spielfeld feld = new Spielfeld();
		Game g = new Game(feld.r1,feld.ff,feld);
		feld.setSize(600, 800);
		feld.setVisible(true);
		g.play();	
	}
		
		
}
