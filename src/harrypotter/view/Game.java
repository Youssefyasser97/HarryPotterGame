package harrypotter.view;

import harrypotter.model.tournament.Tournament;
import harrypotter.model.world.Cell;
import harrypotter.model.world.ChampionCell;
import harrypotter.model.world.EmptyCell;
import harrypotter.model.world.ObstacleCell;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javafx.scene.layout.Background;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.prism.paint.Color;

public class Game extends JFrame implements ActionListener{

JButton btn;
JPanel p ;
private Tournament t;
//JButton e;
//JButton [][] cells = new JButton[10][10];
	public Game () throws IOException{
		Tournament t= new Tournament();
		t.beginTournament();
		Cell [][] c=t.getFirstTask().getMap();
		
		for(int i = 0;i<10;i++)
			for(int j = 0 ;j<10;j++){
				
				if(c[i][j] instanceof EmptyCell){
					JButton e =new JButton();
					getContentPane().add(e);
				}
				else  
					if(c[i][j] instanceof ObstacleCell)
					{
						JButton e =new JButton();
						getContentPane().add(e);
					}
					else
						if(i==4&& j==4){
							JButton e =new JButton();
							getContentPane().add(e);
						}
						else
							if(c[i][j] instanceof ChampionCell ){
								JButton e =new JButton();	
								getContentPane().add(e);
								
							}
		btn = new JButton();
		btn.setBounds(100,100,1000,500);
		getContentPane().add(btn);
			
		
		setFocusable(true);
	setFocusTraversalKeysEnabled(false);
		JPanel p = new JPanel();
		setBounds(0, 0, 1390, 781);
		setLayout(new GridLayout(10, 100));
	}
	
	}	
	
	
	
public void actionPerformed(ActionEvent e) {
	
	
}
public static void main(String[] args) throws IOException {

	
	Game m = new Game();
	m.setVisible(true);
}
}