package harrypotter.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;

import harrypotter.model.tournament.Tournament;
import harrypotter.model.world.Cell;
import harrypotter.model.world.ChampionCell;
import harrypotter.model.world.CollectibleCell;
import harrypotter.model.world.EmptyCell;
import harrypotter.model.world.ObstacleCell;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class map2 extends JFrame {
	private Tournament x;
	JLabel background;
	JLabel background2;
	public	JComboBox<String> spells ;
	public  JButton[][] b = new JButton[10][10];
	public JPanel p;
	public JLabel label1;
	public JLabel label2;
	public 	JLabel label3;
	public 	JLabel label4;
	public JLabel label5;
	public JLabel label7;
	
	
	public JLabel label8;
	public JLabel label9;
	public JLabel label10;
	public JLabel label11;
	public JLabel label12;
	public JLabel label13;

	
	public JLabel hp1;
	public JLabel ip1;
	public JLabel hp2;
	public JLabel ip2;
	public JLabel hp3;
	public JLabel ip3;
	public JLabel hp4;
	public JLabel ip4;
	
	
	public JLabel chp1;
	public JLabel cip1;
	public JLabel chp2;
	public JLabel cip2;
	public JLabel chp3;
	public JLabel cip3;
	public JLabel chp4;
	public JLabel cip4;
	
	public JLabel n1;
	public JLabel n2;
	public JLabel n3;
	public JLabel n4;
	
	public JLabel cn1; 
	public JLabel cn2; 
	public JLabel cn3; 
	public JLabel cn4; 

	
	public JLabel label14;

	
	
	
	public	JLabel label6;
	public JButton cast;
	public JButton trait;
	public JButton exit;
	public JButton up;
	public JButton down;
	public JButton left;
	public JButton right;
	public JButton activate;
	
	
	
	public map2()  {
		activate = new JButton();
		exit = new JButton();
		exit.setBounds(30,705,160,50);
		exit.setText("EXIT");
		exit.setBackground(Color.black);
		exit.setFont(new Font("Harry P",Font.PLAIN,40));
		
		
		
	up = new JButton();
	down = new JButton();
	left = new JButton();
	right = new JButton();
	
	
	up.setFocusable(false);
	down.setFocusable(false);
	left.setFocusable(false);
	right.setFocusable(false);
	
	
	
	
	up.setBounds(600,650,70,50);
	down.setBounds(600,710,70,50);
	left.setBounds(550,680,70,50);
	right.setBounds(650,680,70,50);
	
	up.setText("up");
	down.setText("down");
	left.setText("left");
	right.setText("right");
	
	getContentPane().add(up);
	getContentPane().add(down);
	getContentPane().add(left);
	getContentPane().add(right);

		
		
		setUndecorated(true);
		 cast = new JButton();
//		cast.setVisible(true);
	//	trait.setVisible(true);
//		spells.setVisible(true);
	
		spells = new JComboBox<String>();
		
		 trait = new JButton();
		cast.setText("cast");
		trait.setText("relocate");
		cast.setBounds(0, 0, 200, 50);
		trait.setBounds(300, 0, 200,50);
		cast.setFocusable(false);
		 p = new JPanel();
		background = new JLabel();
			background.setIcon(new ImageIcon("woody1.jpg"));
		//background.setBackground(Color.white);
	//	background.setOpaque(true);
		background.setBounds(1180,30, 300,650);
//  	setBackground(Color.BLACK);
		
		background2 = new JLabel();
		background2.setIcon(new ImageIcon("sky1.jpg"));
		background2.setBounds(0,0, 1390,781);
		background2.setBackground(Color.BLACK);
		
		JLabel label1 = new JLabel("Player's name:");
		label1.setBounds(1180, 100, 400,40);
		label1.setForeground(Color.BLACK);
		label1.setFont(new Font("Harry P",Font.PLAIN,40));
		
		label5 = new JLabel();
		label5.setBounds(1180, 150, 400,40);
		label5.setForeground(Color.BLACK);
		label5.setFont(new Font("Harry P",Font.PLAIN,40));
		
	
		label2 = new JLabel("Health:");
		label2.setBounds(1180, 200, 400,40);
		label2.setForeground(Color.BLACK);
		label2.setFont(new Font("Harry P",Font.PLAIN,40));
		
		label3 = new JLabel("Intelligence:");
		label3.setBounds(1180, 300, 400,40);
		label3.setForeground(Color.BLACK);
		label3.setFont(new Font("Harry P",Font.PLAIN,40));
		
		label4 = new JLabel("Traits:");
		label4.setBounds(1180, 400, 400,40);
		label4.setForeground(Color.BLACK);
		label4.setFont(new Font("Harry P",Font.PLAIN,40));
		
		
		
		label6 = new JLabel();
		label6.setBounds(1180, 150, 400,40);
		label6.setForeground(Color.BLACK);
		label6.setFont(new Font("Harry P",Font.PLAIN,40));
		
		label7 = new JLabel();
		label7.setBounds(1180, 250, 400,40);
		label7.setForeground(Color.BLACK);
		label7.setFont(new Font("Harry P",Font.PLAIN,40));
			
			
			label8 = new JLabel("Spells:");
			label8.setBounds(1180, 600, 400,40);
			label8.setForeground(Color.BLACK);
			label8.setFont(new Font("Harry P",Font.PLAIN,40));
			
			
			label9 = new JLabel("Potions:");
			label9.setBounds(1180, 500, 400,40);
			label9.setForeground(Color.BLACK);
			label9.setFont(new Font("Harry P",Font.PLAIN,40));
			
			//godad
			
			label10 = new JLabel();
			label10.setBounds(10, 120, 200,200);
			label10.setForeground(Color.BLACK);
//			label10.setBackground(Color.white);
			label10.setFont(new Font("Harry P",Font.PLAIN,40));
			label10.setOpaque(true);
			
			hp1 = new JLabel("Health:");
			hp1.setBounds(11,110, 200,200);
			hp1.setForeground(Color.BLACK);
			hp1.setFont(new Font("Harry P",Font.PLAIN,30));
			
			
			ip1 = new JLabel("Intelligence:");
			ip1.setBounds(11,75, 200,200);
			ip1.setForeground(Color.BLACK);
			ip1.setFont(new Font("Harry P",Font.PLAIN,30));
			
			
			chp1 = new JLabel();
			chp1.setBounds(120,110, 200,200);
			chp1.setForeground(Color.BLACK);
			chp1.setFont(new Font("Harry P",Font.PLAIN,30));
			
			
			cip1 = new JLabel();
			cip1.setBounds(120,75, 200,200);
			cip1.setForeground(Color.BLACK);
			cip1.setFont(new Font("Harry P",Font.PLAIN,30));

			n1 = new JLabel("Name:");
			n1.setBounds(11,40, 200,200);
			n1.setForeground(Color.BLACK);
			n1.setFont(new Font("Harry P",Font.PLAIN,30));
			
			cn1 = new JLabel();
			cn1.setBounds(90,40, 200,200);
			cn1.setForeground(Color.BLACK);
			cn1.setFont(new Font("Harry P",Font.PLAIN,30));
			
			
			
			
			label11 = new JLabel();
			label11.setBounds(10, 400, 200,200);
			label11.setForeground(Color.BLACK);
			label11.setFont(new Font("Harry P",Font.PLAIN,40));
			label11.setOpaque(true);

			hp2 = new JLabel("Health:");
			hp2.setBounds(10,380, 200,200);
			hp2.setForeground(Color.BLACK);
			hp2.setFont(new Font("Harry P",Font.PLAIN,30));
			
			ip2 = new JLabel("Intelligence:");
			ip2.setBounds(10,350, 200,200);
			ip2.setForeground(Color.BLACK);
			ip2.setFont(new Font("Harry P",Font.PLAIN,30));
			
			chp2 = new JLabel();
			chp2.setBounds(120,380, 200,200);
			chp2.setForeground(Color.BLACK);
			chp2.setFont(new Font("Harry P",Font.PLAIN,30));
			
			cip2 = new JLabel();
			cip2.setBounds(120,350, 200,200);
			cip2.setForeground(Color.BLACK);
			cip2.setFont(new Font("Harry P",Font.PLAIN,30));
			
			n2 = new JLabel("Name:");
			n2.setBounds(10,320, 200,200);
			n2.setForeground(Color.BLACK);
			n2.setFont(new Font("Harry P",Font.PLAIN,30));
			
			
			cn2 = new JLabel();
			cn2.setBounds(90,320, 200,200);
			cn2.setForeground(Color.BLACK);
			cn2.setFont(new Font("Harry P",Font.PLAIN,30));
			
			label12 = new JLabel();
			label12.setBounds(950, 400, 200,200);
			label12.setForeground(Color.BLACK);
			label12.setFont(new Font("Harry P",Font.PLAIN,40));
			label12.setOpaque(true);
			
			hp3 = new JLabel("Health:");
			hp3.setBounds(950,375, 200,200);
			hp3.setForeground(Color.BLACK);
			hp3.setFont(new Font("Harry P",Font.PLAIN,30));
			
			ip3 = new JLabel("Intelligence:");
			ip3.setBounds(950,345, 200,200);
			ip3.setForeground(Color.BLACK);
			ip3.setFont(new Font("Harry P",Font.PLAIN,30));
			
			chp3 = new JLabel();
			chp3.setBounds(1060,375, 200,200);
			chp3.setForeground(Color.BLACK);
			chp3.setFont(new Font("Harry P",Font.PLAIN,30));
			
			cip3 = new JLabel();
			cip3.setBounds(1060,345, 200,200);
			cip3.setForeground(Color.BLACK);
			cip3.setFont(new Font("Harry P",Font.PLAIN,30));
			
			n3 = new JLabel("Name:");
			n3.setBounds(950,315, 200,200);
			n3.setForeground(Color.BLACK);
			n3.setFont(new Font("Harry P",Font.PLAIN,30));
			

			cn3 = new JLabel();
			cn3.setBounds(1040,315, 200,200);
			cn3.setForeground(Color.BLACK);
			cn3.setFont(new Font("Harry P",Font.PLAIN,30));
			
			
			label13 = new JLabel();
			label13.setBounds(950,120, 200,200);
			label13.setForeground(Color.BLACK);
			label13.setFont(new Font("Harry P",Font.PLAIN,30));
			label13.setOpaque(true);	
			
			
			hp4 = new JLabel("Health:");
			hp4.setBounds(950,95, 200,200);
			hp4.setForeground(Color.BLACK);
			hp4.setFont(new Font("Harry P",Font.PLAIN,30));
			
			ip4 = new JLabel("Intelligence:");
			ip4.setBounds(950,65, 200,200);
			ip4.setForeground(Color.BLACK);
			ip4.setFont(new Font("Harry P",Font.PLAIN,30));
			
			chp4 = new JLabel();
			chp4.setBounds(1070,95, 200,200);
			chp4.setForeground(Color.BLACK);
			chp4.setFont(new Font("Harry P",Font.PLAIN,30));
			
			cip4 = new JLabel();
			cip4.setBounds(1070,65, 200,200);
			cip4.setForeground(Color.BLACK);
			cip4.setFont(new Font("Harry P",Font.PLAIN,30));
			
			n4 = new JLabel("Name:");
			n4.setBounds(950,35, 200,200);
			n4.setForeground(Color.BLACK);
			n4.setFont(new Font("Harry P",Font.PLAIN,30));
			
			
			cn4 = new JLabel();
			cn4.setBounds(1040,35, 200,200);
			cn4.setForeground(Color.BLACK);
			cn4.setFont(new Font("Harry P",Font.PLAIN,30));
			
			
			
			
		
			
			
			
			
			
		
			
			
			
			
			
			
		
//			String inputValue = JOptionPane.showInputDialog("Please input a value");
//		int x = Integer.parseInt(inputValue);
			
			activate.setBounds(600, 0, 200, 50);
			activate.setText("activate trait");
			activate.setFocusable(false);
		
		setBounds(0, 0, 1390, 781);
		setLayout(null);
		p.setLayout(new GridLayout(10, 10));
		p.setBounds(230, 120, 700, 480);	
		add(p);
		
		spells.setBounds(900, 0, 180, 20);
		spells.setFocusable(false);
		trait.setFocusable(false);
		//Tournament x= new Tournament();
		//x.beginTournament();
		//Cell [][] c=x.getFirstTask().getMap();
		
		
		
		for(int i = 0;i<10;i++){
			for(int j = 0 ;j<10;j++){
				
					  JButton e =new JButton();
					b[i][j]=e;
					p.add(e);
					
			
			}
		}
		getContentPane().add(exit);
		getContentPane().add(label1);
		getContentPane().add(hp1);
		getContentPane().add(hp2);
		getContentPane().add(hp3);
		getContentPane().add(hp4);
		getContentPane().add(ip1);
		getContentPane().add(ip2);
		getContentPane().add(ip3);
		getContentPane().add(ip4);
		getContentPane().add(chp1);
		getContentPane().add(chp2);
		getContentPane().add(chp3);
		getContentPane().add(chp4);
		getContentPane().add(cip1);
		getContentPane().add(cip2);
		getContentPane().add(cip3);
		getContentPane().add(cip4);
		
		getContentPane().add(n1);
		getContentPane().add(n2);
		getContentPane().add(n3);
		getContentPane().add(n4);
		
		getContentPane().add(cn1);
		getContentPane().add(cn2);
		getContentPane().add(cn3);
		getContentPane().add(cn4);

		getContentPane().add(label2);
		getContentPane().add(label3);
		getContentPane().add(label4);
		getContentPane().add(label5);	
		getContentPane().add(label6);
		getContentPane().add(label7);
		getContentPane().add(label8);
		getContentPane().add(label9);
		getContentPane().add(label10);
		getContentPane().add(label11);
		getContentPane().add(label12);
		getContentPane().add(label13);
		getContentPane().add(activate);
		getContentPane().add(cast);		
		getContentPane().add(trait);
		getContentPane().add(spells);
		getContentPane().add(background);
		getContentPane().add(background2);
		
}
	public static void main(String[] args)  {

		map2 m2 = new map2();
		m2.setVisible(true);
	}
}


