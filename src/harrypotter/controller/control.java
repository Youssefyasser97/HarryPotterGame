package harrypotter.controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import harrypotter.exceptions.InCooldownException;
import harrypotter.exceptions.InvalidTargetCellException;
import harrypotter.exceptions.NotEnoughIPException;
import harrypotter.exceptions.OutOfBordersException;
import harrypotter.exceptions.OutOfRangeException;
import harrypotter.model.character.GryffindorWizard;
import harrypotter.model.character.HufflepuffWizard;
import harrypotter.model.character.RavenclawWizard;
import harrypotter.model.character.SlytherinWizard;
import harrypotter.model.character.Wizard;
import harrypotter.model.magic.Collectible;
import harrypotter.model.magic.DamagingSpell;
import harrypotter.model.magic.HealingSpell;
import harrypotter.model.magic.Potion;
import harrypotter.model.magic.RelocatingSpell;
import harrypotter.model.magic.Spell;
import harrypotter.model.tournament.Tournament;
import harrypotter.model.world.Cell;
import harrypotter.model.world.ChampionCell;
import harrypotter.model.world.CollectibleCell;
import harrypotter.model.world.Direction;
import harrypotter.model.world.EmptyCell;
import harrypotter.model.world.Merperson;
import harrypotter.model.world.Obstacle;
import harrypotter.model.world.ObstacleCell;
import harrypotter.model.world.TreasureCell;
import harrypotter.model.world.WallCell;
import harrypotter.view.Map1;
import harrypotter.view.NameWindow;
import harrypotter.view.StartGame;
import harrypotter.view.chooseSpells;
import harrypotter.view.java;
import harrypotter.view.map2;
import harrypotter.view.map3;
import harrypotter.view.myFrame;
import harrypotter.view.myFrame1;
import harrypotter.view.myFrame2;
import harrypotter.view.myFrame3;

public class control implements ActionListener, KeyListener {

	// // public JComboBox<String> spells ;
	// //public JComboBox<String> combo ;
	// public JComboBox<String> combo2;
	// public JComboBox<String> combo3 ;
	// public JComboBox<String> combo4 ;
	// public JComboBox<String> combo5 ;
	// public JComboBox<String> combo6 ;
	// public JComboBox<String> combo7 ;
	// public JComboBox<String> combo8 ;
	// public JComboBox<String> combo9 ;
	// public JComboBox<String> combo10 ;
	// public JComboBox<String> combo11 ;
	// public JComboBox<String> combo12 ;

	NameWindow x;
	Tournament tournament = new Tournament();
	myFrame f;
	myFrame1 f1;
	myFrame2 f2;
	myFrame3 f3;
	chooseSpells c;
	Map1 m;
	StartGame s;
	java j;
	map2 m2;
	map3 m3;

	public control() throws IOException {

		Timer t = new Timer(1500, this); // Timer in 10 seconds
		t.start();
		t.setRepeats(false);

		// spells= new JComboBox<String>();
		// combo = new JComboBox<String>();
		// combo2=new JComboBox<String>();
		// combo3=new JComboBox<String>();
		// combo4=new JComboBox<String>();
		// combo5=new JComboBox<String>();
		// combo6=new JComboBox<String>();
		// combo7=new JComboBox<String>();
		// combo8=new JComboBox<String>();
		// combo9=new JComboBox<String>();
		// combo10=new JComboBox<String>();
		// combo11=new JComboBox<String>();
		// combo12=new JComboBox<String>();
		//
		s = new StartGame();
		j = new java();
		f = new myFrame();
		f1 = new myFrame1();
		f2 = new myFrame2();
		f3 = new myFrame3();
		m = new Map1();
		x = new NameWindow();
		m.addKeyListener(this);
		c = new chooseSpells();
m2 = new map2();
m3 = new map3();
m2.addKeyListener(this);
		s.btn1.addActionListener(this);
		
		m.activate.addActionListener(this);
		m2.activate.addActionListener(this);
		m3.activate.addActionListener(this);

		// s.addKeyListener(this);
		// s.setFocusable(true);
		// s.setFocusTraversalKeysEnabled(false);
		// j.addKeyListener(this);
		// j.setFocusable(true);
		// j.setFocusTraversalKeysEnabled(false);

		// x.txt.addActionListener(this);
		// x.txt2.addActionListener(this);
		// x.txt3.addActionListener(this);
		// x.txt4.addActionListener(this);

		// m.label6.setText("" + ((Wizard)
		// tournament.getFirstTask().getCurrentChamp()).getName());
		// m.label6.setText(""+ x.txt.getText());
		c.getExit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		c.btn2.addActionListener(this);

		m.setFocusable(true);
		m.setFocusTraversalKeysEnabled(false);
		
		m2.setFocusable(true);
		m2.setFocusTraversalKeysEnabled(false);
		
		m3.setFocusable(true);
		m3.setFocusTraversalKeysEnabled(false);
		
		// m.p.setEnabled(true);
		// m.p.setIgnoreRepaint(true);
		 m.trait.addActionListener(this);
		 m.cast.addActionListener(this);
		 m2.trait.addActionListener(this);
		 m2.cast.addActionListener(this);
		 m3.trait.addActionListener(this);
		 m3.cast.addActionListener(this);
//		 m.spells.addActionListener(this);

		x.btn1.addActionListener(this);
		x.btn2.addActionListener(this);
		f.btn1.addActionListener(this);
		f.btn2.addActionListener(this);
		f.btn3.addActionListener(this);
		f.btn4.addActionListener(this);
		f.btn5.addActionListener(this);

		f1.btn1.addActionListener(this);
		f1.btn2.addActionListener(this);
		f1.btn3.addActionListener(this);
		f1.btn4.addActionListener(this);
		f1.btn5.addActionListener(this);

		f2.btn1.addActionListener(this);
		f2.btn2.addActionListener(this);
		f2.btn3.addActionListener(this);
		f2.btn4.addActionListener(this);
		f2.btn5.addActionListener(this);

		f3.btn1.addActionListener(this);
		f3.btn2.addActionListener(this);
		f3.btn3.addActionListener(this);
		f3.btn4.addActionListener(this);
		f3.btn5.addActionListener(this);

		
		 m.up.addActionListener(this);
		 m.down.addActionListener(this);
		 m.left.addActionListener(this);
		 m.right.addActionListener(this);
		 m2.up.addActionListener(this);
		 m2.down.addActionListener(this);
		 m2.left.addActionListener(this);
		 m2.right.addActionListener(this);
		 m3.up.addActionListener(this);
		 m3.down.addActionListener(this);
		 m3.left.addActionListener(this);
		 m3.right.addActionListener(this);

		j.setVisible(true);

		m.exit.addActionListener(this);
		m2.exit.addActionListener(this);
		m3.exit.addActionListener(this);

		for (int i = 0; i < tournament.getSpells().size(); i++) {

			String k = tournament.getSpells().get(i).getName();
		//	System.out.println(k);
			c.combo.addItem(k);
			c.combo2.addItem(k);
			c.combo3.addItem(k);
			c.combo4.addItem(k);
			c.combo5.addItem(k);
			c.combo6.addItem(k);
			c.combo7.addItem(k);
			c.combo8.addItem(k);
			c.combo9.addItem(k);
			c.combo10.addItem(k);
			c.combo11.addItem(k);
			c.combo12.addItem(k);

		}

	}

	public void update() {

		
	

		
		
		
		
		int c =0;
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				
				
				
				
				
				
				if (tournament.getFirstTask().getMap()[i][j] instanceof ChampionCell) {
					c++;
			if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof HufflepuffWizard){
					
					m.b[i][j].setIcon(new ImageIcon("champ2.jpg"));
					}
			
			if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof RavenclawWizard){
				m.b[i][j].setIcon(new ImageIcon("champ3.jpg"));
			}
				if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof SlytherinWizard){
					m.b[i][j].setIcon(new ImageIcon("champ4.png"));
				}
		if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof GryffindorWizard){
			m.b[i][j].setIcon(new ImageIcon("champ5.png"));
		}

					m.b[i][j].setToolTipText("HP = "
							+ ((Wizard) ((ChampionCell) tournament
									.getFirstTask().getMap()[i][j]).getChamp())
									.getHp());
					
				}
				
				
				if (tournament.getFirstTask().getMap()[i][j] instanceof EmptyCell)
					m.b[i][j].setIcon(new ImageIcon("egg.jpg"));

				if (tournament.getFirstTask().getMap()[i][j] instanceof WallCell)
					m.b[i][j].setIcon(new ImageIcon("wall2.png"));

				if (tournament.getFirstTask().getMap()[i][j] instanceof ObstacleCell) {
                // if(((Obstacle)(ObstacleCell) tournament.getFirstTask().getMap()[i][j])).getObstacle().getHp()) > 0){
					m.b[i][j].setToolTipText("HP = "	+ ((ObstacleCell) tournament.getFirstTask().getMap()[i][j]).getObstacle().getHp());
					m.b[i][j].setIcon(new ImageIcon("obs2.png"));
				}
				if (tournament.getFirstTask().getMap()[i][j] instanceof CollectibleCell){
					m.b[i][j].setIcon(new ImageIcon("egg.jpg"));
				}
				
				Point p=((Wizard)tournament.getFirstTask().getCurrentChamp()).getLocation()	;
				Wizard w =(Wizard)tournament.getFirstTask().getCurrentChamp();
				
				if(tournament.getFirstTask().getMap()[p.x][p.y] instanceof CollectibleCell)
					JOptionPane.showConfirmDialog(null, ((Potion)((CollectibleCell)tournament.getFirstTask().getMap()[p.x][p.y]).getCollectible()).getAmount());
					
				
				
				
				if (i == 4 && j == 4)
					m.b[i][j].setIcon(new ImageIcon("egg1.jpg"));
		

		
		
	
		m.cwinners.setText("");
			for(int k =0 ; k<tournament.getFirstTask().getWinners().size();k++){
				m.cwinners.setText(m.cwinners.getText()+((Wizard)tournament.getFirstTask().getWinners().get(k)).getName());
				break;
			}
			
			
			
			m.cwinners2.setText("");
			for(int k =1 ; k<tournament.getFirstTask().getWinners().size();k++){
				m.cwinners2.setText(m.cwinners2.getText()+((Wizard)tournament.getFirstTask().getWinners().get(k)).getName());
				break;
			}
			
			
			m.cwinners3.setText("");
			for(int k =2 ; k<tournament.getFirstTask().getWinners().size();k++){
				m.cwinners3.setText(m.cwinners3.getText()+((Wizard)tournament.getFirstTask().getWinners().get(k)).getName());
				break;
			}
			
			
				m.label6.setText(""
						+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
								.getName());
				m.label7.setText(""
						+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
								.getHp());
				
				
			}
		if(c==0 && tournament.getFirstTask().getWinners().size() > 0){
			
			x.dispose();
			m.setVisible(false);
			m2.setVisible(true);
			try {
				tournament.onFinishingFirstTask(tournament.getFirstTask().getWinners());
				update2();
				//tournament.getSecondTask().getMap();
//				update2();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		m.spells.removeAllItems();
		for (int i = 0; i < ((Wizard) tournament.getFirstTask()
				.getCurrentChamp()).getSpells().size(); i++) {
			String k = ((Wizard) tournament.getFirstTask().getCurrentChamp())
					.getSpells().get(i).getName();
			m.spells.addItem(k);
		}
		
		
		
		
	//	Point p1 = tournament.getFirstTask().getMarkedCells().get(0);
		//Point p2 = tournament.getFirstTask().getMarkedCells().get(1);

		Point p1 = tournament.getFirstTask().getMarkedCells().get(0);
		Point p2 = tournament.getFirstTask().getMarkedCells().get(1);
		m.b[p1.x][p1.y].setIcon(new ImageIcon("fire1.png"));
		m.b[p2.x][p2.y].setIcon(new ImageIcon("fire1.png"));    
		
		
		m.label6.setText(""
				+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
						.getName());
		m.label7.setText(""
				+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
						.getHp());
		
		m.cn1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1)) //corner
						.getName());
		
		m.cn2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
				.getName());
		
		m.cn3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2)) // corner
				.getName());
		
		m.cn4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
				.getName());
		
		
		m.chp1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2))
				.getHp());
		
		m.chp2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
				.getHp());
		
		m.chp3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
				.getHp());
		
		m.chp4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1))
				.getHp());
		
//		for(int i =0 ; i< tournament.getFirstTask().getWinners().size() ; i++)
//		{		
		

		
		m.cip1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2))
				.getIp());
		
		m.cip2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
				.getIp());
		
		m.cip3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
				.getIp());
		
		m.cip4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1))
				.getIp());
		
		m.cinfotrait1.setText("NO");
		m.cinfotrait2.setText("NO");
		m.cinfotrait3.setText("NO");
		m.cinfotrait4.setText("NO");

	
		
		
		
	}

	
	
	
	public void update2() {

		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				
				if (tournament.getSecondTask().getMap()[i][j] instanceof ChampionCell) {
					
			if(((Wizard)((ChampionCell)tournament.getSecondTask().getMap()[i][j]).getChamp()) instanceof HufflepuffWizard){
					
					m2.b[i][j].setIcon(new ImageIcon("champ2.jpg"));
					}
			
			if(((Wizard)((ChampionCell)tournament.getSecondTask().getMap()[i][j]).getChamp()) instanceof RavenclawWizard){
				m2.b[i][j].setIcon(new ImageIcon("champ3.jpg"));
			}
				if(((Wizard)((ChampionCell)tournament.getSecondTask().getMap()[i][j]).getChamp()) instanceof SlytherinWizard){
					m2.b[i][j].setIcon(new ImageIcon("champ4.png"));
				}
		if(((Wizard)((ChampionCell)tournament.getSecondTask().getMap()[i][j]).getChamp()) instanceof GryffindorWizard){
			m2.b[i][j].setIcon(new ImageIcon("champ5.png"));
		}
					m2.b[i][j].setToolTipText("HP = "
							+ ((Wizard) ((ChampionCell) tournament
									.getSecondTask().getMap()[i][j]).getChamp())
									.getHp());	
				}			
				if (tournament.getSecondTask().getMap()[i][j] instanceof EmptyCell)
					m2.b[i][j].setIcon(new ImageIcon("egg.jpg"));

				if (tournament.getSecondTask().getMap()[i][j] instanceof TreasureCell)
					m2.b[i][j].setIcon(new ImageIcon("egg.jpg"));
				
				
				if (tournament.getSecondTask().getMap()[i][j] instanceof ObstacleCell  )
				{
					m2.b[i][j].setToolTipText("HP = "	+ ((ObstacleCell) tournament.getSecondTask().getMap()[i][j]).getObstacle().getHp());
					m2.b[i][j].setIcon(new ImageIcon("mer1.png"));
					
						
					
				}
				if (tournament.getSecondTask().getMap()[i][j] instanceof WallCell)
					m2.b[i][j].setIcon(new ImageIcon("wall2.png"));

				
				if (tournament.getSecondTask().getMap()[i][j] instanceof CollectibleCell)
					m2.b[i][j].setIcon(new ImageIcon("egg.jpg"));
			
			
				m2.label6.setText(""
						+ ((Wizard) tournament.getSecondTask().getCurrentChamp())
								.getName());
				m2.label7.setText(""
						+ ((Wizard) tournament.getSecondTask().getCurrentChamp())
								.getHp());
			}	
		m2.spells.removeAllItems();
		for (int i = 0; i < ((Wizard) tournament.getSecondTask()
				.getCurrentChamp()).getSpells().size(); i++) {
			String k = ((Wizard) tournament.getSecondTask().getCurrentChamp())
					.getSpells().get(i).getName();
			m2.spells.addItem(k);
		}	
	//	Point p1 = tournament.getFirstTask().getMarkedCells().get(0);
		//Point p2 = tournament.getFirstTask().getMarkedCells().get(1);

		m2.label6.setText(""
				+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
						.getName());
		m2.label7.setText(""
				+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
						.getHp());
		
		m2.cn1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1)) //corner
						.getName());
		
		m2.cn2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
				.getName());
		
		m2.cn3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2)) // corner
				.getName());
		
		m2.cn4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
				.getName());
		
		
		m2.chp1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2))
				.getHp());
		
		m2.chp2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
				.getHp());
		
		m2.chp3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
				.getHp());
		
		m2.chp4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1))
				.getHp());
		
		
		
		
		m2.cip1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2))
				.getIp());
		
		m2.cip2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
				.getIp());
		
		m2.cip3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
				.getIp());
		
		m2.cip4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1))
				.getIp());
		
		if(tournament.getSecondTask().getChampions()==null){
			try {
				tournament.onFinishingSecondTask(tournament.getSecondTask().getWinners());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void update3() {
//		tournament.getFirstTask().fire();
		
//		Point p1 = tournament.getFirstTask().getMarkedCells().get(0);
//		Point p2 = tournament.getFirstTask().getMarkedCells().get(1);
//		m.b[p1.x][p1.y].setIcon(new ImageIcon("obs3.png"));
//		m.b[p2.x][p2.y].setIcon(new ImageIcon("obs3.png"));
		

//		m.p.removeAll();
		//tournament.getFirstTask().getMap();
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				
				
				
				
				
				
				if (tournament.getFirstTask().getMap()[i][j] instanceof ChampionCell) {
					
			if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof HufflepuffWizard){
					
					m3.b[i][j].setIcon(new ImageIcon("champ2.jpg"));
					}
			
			if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof RavenclawWizard){
				m3.b[i][j].setIcon(new ImageIcon("champ3.jpg"));
			}
				if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof SlytherinWizard){
					m3.b[i][j].setIcon(new ImageIcon("champ4.png"));
				}
		if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof GryffindorWizard){
			m3.b[i][j].setIcon(new ImageIcon("champ5.png"));
		}

					m3.b[i][j].setToolTipText("HP = "
							+ ((Wizard) ((ChampionCell) tournament
									.getFirstTask().getMap()[i][j]).getChamp())
									.getHp());
					
				}
				
				
				if (tournament.getFirstTask().getMap()[i][j] instanceof EmptyCell)
					m3.b[i][j].setIcon(new ImageIcon("egg.jpg"));

				if (tournament.getFirstTask().getMap()[i][j] instanceof WallCell)
					m3.b[i][j].setIcon(new ImageIcon("wall2.png"));

				if (tournament.getFirstTask().getMap()[i][j] instanceof ObstacleCell) {
                // if(((Obstacle)(ObstacleCell) tournament.getFirstTask().getMap()[i][j])).getObstacle().getHp()) > 0){
					m3.b[i][j].setToolTipText("HP = "	+ ((ObstacleCell) tournament.getFirstTask().getMap()[i][j]).getObstacle().getHp());
					m3.b[i][j].setIcon(new ImageIcon("obs2.png"));
				}
				if (tournament.getFirstTask().getMap()[i][j] instanceof CollectibleCell)
					m3.b[i][j].setIcon(new ImageIcon("egg.jpg"));
				if (i == 4 && j == 4)
					m3.b[i][j].setIcon(new ImageIcon("egg1.jpg"));
			
			
				m3.label6.setText(""
						+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
								.getName());
				m3.label7.setText(""
						+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
								.getHp());
				
				
			}
		
		
		m3.spells.removeAllItems();
		for (int i = 0; i < ((Wizard) tournament.getFirstTask()
				.getCurrentChamp()).getSpells().size(); i++) {
			String k = ((Wizard) tournament.getFirstTask().getCurrentChamp())
					.getSpells().get(i).getName();
			m3.spells.addItem(k);
		}
		
		
		
		
	//	Point p1 = tournament.getFirstTask().getMarkedCells().get(0);
		//Point p2 = tournament.getFirstTask().getMarkedCells().get(1);

if(tournament.getChampions().isEmpty())
	JOptionPane.showInputDialog("game over");
	}
	public void actionPerformed(ActionEvent e) {
		

		j.dispose();
		s.setVisible(true);

		if (e.getSource() == s.btn1){
			s.setVisible(false);
		   x.setVisible(true);}
		// NameWindow x = null;
		// try {
		// x = new NameWindow();
		// } catch (IOException e2) {
		// // TODO Auto-generated catch block
		// e2.printStackTrace();
		// }
		//if (e.getSource() == s.btn1)

		// if(e.getSource()==x.btn2)
		// System.exit(0);

		if (e.getSource() == x.btn2 || e.getSource() == f.btn5
				|| e.getSource() == f1.btn5 || e.getSource() == f2.btn5
				|| e.getSource() == f3.btn5)
			System.exit(0);
		if (e.getSource() == x.btn1) {
			if (x.txt.getText().equals("") || x.txt2.getText().equals("")
					|| x.txt3.getText().equals("")
					|| x.txt4.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "kaka");

			} else {
				x.dispose();
				f.setVisible(true);
			}
		}

		if (e.getSource() == c.btn1)
			System.exit(0);
		if (e.getSource() == c.btn2) {

			try {
				tournament.beginTournament();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			// }

			//
			// if(e.getSource()==c.btn1){
			int i1 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo.getSelectedItem())) {
					i1 = i;
					break;
				}
			}

			int i2 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo2.getSelectedItem())) {
					i2 = i;
					break;
				}
			}

			int i3 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo3.getSelectedItem())) {
					i3 = i;
					break;
				}
			}

			int i4 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo4.getSelectedItem())) {
					i4 = i;
					break;
				}
			}

			int i5 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo5.getSelectedItem())) {
					i5 = i;
					break;
				}
			}

			int i6 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo6.getSelectedItem())) {
					i6 = i;
					break;
				}
			}

			int i7 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo7.getSelectedItem())) {
					i7 = i;
					break;
				}
			}

			int i8 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo8.getSelectedItem())) {
					i8 = i;
					break;
				}
			}

			int i9 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo9.getSelectedItem())) {
					i9 = i;
					break;
				}
			}

			int i10 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo10.getSelectedItem())) {
					i10 = i;
					break;
				}
			}

			int i11 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo11.getSelectedItem())) {
					i11 = i;
					break;
				}
			}

			int i12 = 0;
			for (int i = 0; i < tournament.getSpells().size(); i++) {
				if (tournament.getSpells().get(i).getName()
						.equals(c.combo12.getSelectedItem())) {
					i12 = i;
					break;
				}
			}

			try {
				((Wizard) tournament.getChampions().get(0)).getSpells().add(
						tournament.getSpells().get(i1).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				((Wizard) tournament.getChampions().get(0)).getSpells().add(
						tournament.getSpells().get(i2).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				((Wizard) tournament.getChampions().get(0)).getSpells().add(
						tournament.getSpells().get(i3).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				((Wizard) tournament.getChampions().get(1)).getSpells().add(
						tournament.getSpells().get(i4).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				((Wizard) tournament.getChampions().get(1)).getSpells().add(
						tournament.getSpells().get(i5).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				((Wizard) tournament.getChampions().get(1)).getSpells().add(
						tournament.getSpells().get(i6).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				((Wizard) tournament.getChampions().get(2)).getSpells().add(
						tournament.getSpells().get(i7).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				((Wizard) tournament.getChampions().get(2)).getSpells().add(
						tournament.getSpells().get(i8).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				((Wizard) tournament.getChampions().get(2)).getSpells().add(
						tournament.getSpells().get(i9).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				((Wizard) tournament.getChampions().get(3)).getSpells().add(
						tournament.getSpells().get(i10).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				((Wizard) tournament.getChampions().get(3)).getSpells().add(
						tournament.getSpells().get(i11).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				((Wizard) tournament.getChampions().get(3)).getSpells().add(
						tournament.getSpells().get(i12).clone());
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			c.setVisible(false);
			m.setVisible(true);

			tournament.getFirstTask().getMap();
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++) {
					m.b[i][j].setFocusable(true);
					
					if (tournament.getFirstTask().getMap()[i][j] instanceof ChampionCell) {

						
						if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof HufflepuffWizard){
								
								m.b[i][j].setIcon(new ImageIcon("champ2.jpg"));
								}
						
						if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof RavenclawWizard){
							m.b[i][j].setIcon(new ImageIcon("champ3.jpg"));
						}
							if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof SlytherinWizard){
								m.b[i][j].setIcon(new ImageIcon("champ4.png"));
							}
					if(((Wizard)((ChampionCell)tournament.getFirstTask().getMap()[i][j]).getChamp()) instanceof GryffindorWizard){
						m.b[i][j].setIcon(new ImageIcon("champ5.png"));
					}

								m.b[i][j].setToolTipText("HP = "
										+ ((Wizard) ((ChampionCell) tournament
												.getFirstTask().getMap()[i][j]).getChamp())
												.getHp());
								
							}
					if (tournament.getFirstTask().getMap()[i][j] instanceof EmptyCell)
						m.b[i][j].setIcon(new ImageIcon("egg.jpg"));

					if (tournament.getFirstTask().getMap()[i][j] instanceof WallCell)
						m.b[i][j].setIcon(new ImageIcon("wall2.png"));

					if (tournament.getFirstTask().getMap()[i][j] instanceof ObstacleCell) {

						m.b[i][j].setToolTipText("HP = "
								+ ((ObstacleCell) tournament.getFirstTask()
										.getMap()[i][j]).getObstacle().getHp());
						m.b[i][j].setIcon(new ImageIcon("obs2.png"));
					}
					if (tournament.getFirstTask().getMap()[i][j] instanceof CollectibleCell)
						m.b[i][j].setIcon(new ImageIcon("egg.jpg"));
					if (i == 4 && j == 4)
						m.b[i][j].setIcon(new ImageIcon("egg1.jpg"));
				}

			// m.label6.setText(""+ x.txt.getText());

		}
		
		


		
		
		
		if(e.getSource()==m.activate){
			m.setVisible(true);
			
		m.cinfotrait1.setText("YES");
			
			
			
			if(((Wizard)tournament.getFirstTask().getCurrentChamp()) instanceof SlytherinWizard){

				String inputValue1 = JOptionPane.showInputDialog("Please input the 1st direction");
			
				
				
				Direction f = Direction.FORWARD;
				Direction b = Direction.BACKWARD;
				Direction l = Direction.LEFT;
				Direction r = Direction.RIGHT;
				
				Direction result = null;
				if(inputValue1.equals("up"))
					result = f;
				if(inputValue1.equals("down"))
					result = b;
				if(inputValue1.equals("left"))
					result = l;
				if(inputValue1.equals("right"))
					result = r;
				
				
				try {
					tournament.getFirstTask().onSlytherinTrait(result);
				} catch (InCooldownException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (OutOfBordersException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (InvalidTargetCellException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				}
				if(((Wizard)tournament.getSecondTask().getCurrentChamp()) instanceof SlytherinWizard){

					
					if(inputValue1.equals("up"))
						result = f;
					if(inputValue1.equals("down"))
						result = b;
					if(inputValue1.equals("left"))
						result = l;
					if(inputValue1.equals("right"))
						result = r;

				try {
					tournament.getSecondTask().onSlytherinTrait(result);
				} catch (InCooldownException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (OutOfBordersException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidTargetCellException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}if(((Wizard)tournament.getThirdTask().getCurrentChamp()) instanceof SlytherinWizard){
				try {
					tournament.getThirdTask().onSlytherinTrait(result);
				} catch (InCooldownException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (OutOfBordersException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidTargetCellException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}}
			
			
			if(((Wizard)tournament.getFirstTask().getCurrentChamp()) instanceof GryffindorWizard){
				try {
					tournament.getFirstTask().onGryffindorTrait();
				} catch (InCooldownException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
					if(((Wizard)tournament.getSecondTask().getCurrentChamp()) instanceof GryffindorWizard){
					try {
						tournament.getSecondTask().onGryffindorTrait();
					} catch (InCooldownException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}}
					if(((Wizard)tournament.getThirdTask().getCurrentChamp()) instanceof GryffindorWizard){
					try {
						tournament.getThirdTask().onGryffindorTrait();
					} catch (InCooldownException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
				}		
		}if(((Wizard)tournament.getFirstTask().getCurrentChamp()) instanceof HufflepuffWizard){
			try {
				tournament.getFirstTask().onHufflepuffTrait();
			} catch (InCooldownException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			if(((Wizard)tournament.getSecondTask().getCurrentChamp()) instanceof HufflepuffWizard){
			try {
				tournament.getSecondTask().onHufflepuffTrait();
			} catch (InCooldownException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}}
			if(((Wizard)tournament.getThirdTask().getCurrentChamp()) instanceof HufflepuffWizard){
			try{
				tournament.getThirdTask().onHufflepuffTrait();
			} catch (InCooldownException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}}
		if(((Wizard)tournament.getThirdTask().getCurrentChamp()) instanceof RavenclawWizard){
//			if(tournament.getFirstTask().onRavenclawTrait().equals("kaka")){
//				
//			}
			try {
				
			
				JOptionPane.showMessageDialog(null, tournament.getFirstTask().onRavenclawTrait());
				
			} catch (HeadlessException e2) {
				JOptionPane.showMessageDialog(null, e2.getMessage());
				e2.printStackTrace();
			} catch (InCooldownException e2) {
				JOptionPane.showMessageDialog(null, e2.getMessage());
				e2.printStackTrace();
			}
			try {
				tournament.getFirstTask().onRavenclawTrait();
			} catch (InCooldownException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			
		}
		update();
		
		}
		

		if (e.getSource() == m.exit)
			System.exit(0);
		
		

		

		// m.label5.setText(((Wizard)tournament.getChampions().get(0)).getName());
		if (e.getSource() == f.btn1) {// System.exit(0);
			tournament.addChampion(new GryffindorWizard(x.txt.getText()));
		} else if (e.getSource() == f.btn2)
			tournament.addChampion(new SlytherinWizard(x.txt.getText()));
		else if (e.getSource() == f.btn3)
			tournament.addChampion(new RavenclawWizard(x.txt.getText()));
		else if (e.getSource() == f.btn4)
			tournament.addChampion(new HufflepuffWizard(x.txt.getText()));
		if (e.getSource() == f.btn1 || e.getSource() == f.btn2
				|| e.getSource() == f.btn3 || e.getSource() == f.btn4) {
			f.dispose();
			f1.setVisible(true);
		}
		if (e.getSource() == f1.btn1)
			tournament.addChampion(new GryffindorWizard(x.txt2.getText()));
		else if (e.getSource() == f1.btn2)
			tournament.addChampion(new SlytherinWizard(x.txt2.getText()));
		else if (e.getSource() == f1.btn3)
			tournament.addChampion(new RavenclawWizard(x.txt2.getText()));
		else if (e.getSource() == f1.btn4)
			tournament.addChampion(new HufflepuffWizard(x.txt2.getText()));

		if (e.getSource() == f1.btn1 || e.getSource() == f1.btn2
				|| e.getSource() == f1.btn3 || e.getSource() == f1.btn4) {
			f1.setVisible(false);
			f2.setVisible(true);
		}

		if (e.getSource() == f2.btn1)
			tournament.addChampion(new GryffindorWizard(x.txt3.getText()));

		if (e.getSource() == f2.btn2)
			tournament.addChampion(new SlytherinWizard(x.txt3.getText()));
		if (e.getSource() == f2.btn3)
			tournament.addChampion(new RavenclawWizard(x.txt3.getText()));
		if (e.getSource() == f2.btn4)
			tournament.addChampion(new HufflepuffWizard(x.txt3.getText()));

		if (e.getSource() == f2.btn1 || e.getSource() == f2.btn2
				|| e.getSource() == f2.btn3 || e.getSource() == f2.btn4) {
			f2.setVisible(false);
			f3.setVisible(true);
		}

		if (e.getSource() == f3.btn1)
			tournament.addChampion(new GryffindorWizard(x.txt4.getText()));

		if (e.getSource() == f3.btn2)
			tournament.addChampion(new SlytherinWizard(x.txt4.getText()));
		if (e.getSource() == f3.btn3)
			tournament.addChampion(new RavenclawWizard(x.txt4.getText()));
		if (e.getSource() == f3.btn4)
			tournament.addChampion(new HufflepuffWizard(x.txt4.getText()));

		if (e.getSource() == f3.btn1 || e.getSource() == f3.btn2
				|| e.getSource() == f3.btn3 || e.getSource() == f3.btn4) {
			f3.setVisible(false);
			// c = null;
			c.setVisible(true);
		}
		// if(e.getSource()==m.trait)
		// tournament.getFirstTask().isTraitActivated();
//		if (e.getSource() == m2.up) {
//			m2.setVisible(true);
//			for (int i = 0; i < ((Wizard) tournament.getSecondTask()
//					.getCurrentChamp()).getSpells().size(); i++) {
//				if (((Wizard) tournament.getSecondTask().getCurrentChamp())
//						.getSpells().get(i).getName()
//						.equals(m.spells.getSelectedItem())
//						&& ((Wizard) tournament.getSecondTask()
//								.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell)
//					
//				
//					try {
//						tournament.getSecondTask().castDamagingSpell(
//								(DamagingSpell) ((Wizard) tournament
//										.getSecondTask().getCurrentChamp())
//										.getSpells().get(i), Direction.FORWARD);
//						update2();
//						break;
//					} catch (InCooldownException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (NotEnoughIPException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (OutOfBordersException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (InvalidTargetCellException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (IOException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}}
//			if(e.getSource()==m2.down){
//				for (int i = 0; i < ((Wizard) tournament.getSecondTask()
//						.getCurrentChamp()).getSpells().size(); i++) {
//					if (((Wizard) tournament.getSecondTask().getCurrentChamp()).getSpells().get(i).getName().equals(m.spells.getSelectedItem())&& ((Wizard) tournament.getSecondTask().getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell)
//						try {
//							tournament.getSecondTask().castDamagingSpell(
//												(DamagingSpell) ((Wizard) tournament
//														.getSecondTask()
//														.getCurrentChamp()).getSpells()
//														.get(i), Direction.BACKWARD);
//						} catch (InCooldownException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						} catch (NotEnoughIPException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						} catch (OutOfBordersException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						} catch (InvalidTargetCellException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						} catch (IOException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//					update2();
//					break;
//			}
//				if(e.getSource()==m2.right){
//					for(int
//							 i=0;i<((Wizard)tournament.getSecondTask().getCurrentChamp()).getSpells().size();i++){
//							 if(
//							 ((Wizard)tournament.getSecondTask().getCurrentChamp()).getSpells().get(i).getName().equals(m.spells.getSelectedItem())
//							 &&
//							 ((Wizard)tournament.getSecondTask().getCurrentChamp()).getSpells().get(i)
//							 instanceof DamagingSpell )
//							 tournament.getSecondTask().castDamagingSpell((DamagingSpell)
//							 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i),
//							 Direction.RIGHT);
//							
//							// update();
//							 break;
//					
//				}
		
		
				
		
		if (e.getSource() == m.up) {
			m.setVisible(true);
			try {
				for (int i = 0; i < ((Wizard) tournament.getFirstTask()
						.getCurrentChamp()).getSpells().size(); i++) {
					if (((Wizard) tournament.getFirstTask().getCurrentChamp())
							.getSpells().get(i).getName()
							.equals(m.spells.getSelectedItem())
							&& ((Wizard) tournament.getFirstTask()
									.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell)
						tournament.getFirstTask().castDamagingSpell(
								(DamagingSpell) ((Wizard) tournament
										.getFirstTask().getCurrentChamp())
										.getSpells().get(i), Direction.FORWARD);
				//	update();
					break;
				}
			} catch (InCooldownException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (NotEnoughIPException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showConfirmDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			// Point p1 =new Point();
			// p1=tournament.getFirstTask().getTargetPoint(Direction.FORWARD);
			 update();
				m.setVisible(true);

		}
		
	
		 if(e.getSource()==m.right)
		 {

				m.setVisible(true);

			 try {
			 for(int
			 i=0;i<((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().size();i++){
			 if(
			 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i).getName().equals(m.spells.getSelectedItem())
			 &&
			 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i)
			 instanceof DamagingSpell )
			 tournament.getFirstTask().castDamagingSpell((DamagingSpell)
			 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i),
			 Direction.RIGHT);
			
			// update();
			 break;
			 }
			 } catch (InCooldownException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 } catch (NotEnoughIPException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 } catch (OutOfBordersException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 } catch (InvalidTargetCellException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 } catch (IOException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 }
//			 Point p1 =new Point();
//			 p1=tournament.getFirstTask().getTargetPoint(Direction.LEFT);
			 update();
				m.setVisible(true);

		 }
		
		 if(e.getSource()==m.left){
			 s.setVisible(false);
				m.setVisible(true);

			 try {
			 for(int
			 i=0;i<((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().size();i++){
			 if(
			 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i).getName().equals(m.spells.getSelectedItem())
			 &&
			 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i)
			 instanceof DamagingSpell )
			 tournament.getFirstTask().castDamagingSpell((DamagingSpell)
			 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i),
			 Direction.LEFT);
			
			// update();
			 break;
			 }
			 } catch (InCooldownException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 } catch (NotEnoughIPException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 } catch (OutOfBordersException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 } catch (InvalidTargetCellException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 } catch (IOException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			 e1.printStackTrace();
			 }
//			 Point p1 =new Point();
//			 p1=tournament.getFirstTask().getTargetPoint(Direction.LEFT);
			 update();
				m.setVisible(true);

			 }
		
		if (e.getSource() == m.down) {
			m.setVisible(true);
			try {
				for (int i = 0; i < ((Wizard) tournament.getFirstTask()
						.getCurrentChamp()).getSpells().size(); i++) {
					if (((Wizard) tournament.getFirstTask().getCurrentChamp()).getSpells().get(i).getName().equals(m.spells.getSelectedItem())&& ((Wizard) tournament.getFirstTask().getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell)tournament.getFirstTask().castDamagingSpell(
										(DamagingSpell) ((Wizard) tournament
												.getFirstTask()
												.getCurrentChamp()).getSpells()
												.get(i), Direction.BACKWARD);
					//update();
					break;
				}
			} catch (InCooldownException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (NotEnoughIPException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			// Point p1 =new Point();
			// p1=tournament.getFirstTask().getTargetPoint(Direction.BACKWARD);
			 update();
				m.setVisible(true);


		}
		
		if (e.getSource() == m2.up) {
			m2.setVisible(true);
			try {
				for (int i = 0; i < ((Wizard) tournament.getSecondTask()
						.getCurrentChamp()).getSpells().size(); i++) {
					if (((Wizard) tournament.getSecondTask().getCurrentChamp())
							.getSpells().get(i).getName()
							.equals(m2.spells.getSelectedItem())
							&& ((Wizard) tournament.getSecondTask()
									.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell)
						tournament.getSecondTask().castDamagingSpell(
								(DamagingSpell) ((Wizard) tournament
										.getSecondTask().getCurrentChamp())
										.getSpells().get(i), Direction.FORWARD);
				//	update();
					break;
				}
			} catch (InCooldownException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (NotEnoughIPException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showConfirmDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			// Point p1 =new Point();
			// p1=tournament.getFirstTask().getTargetPoint(Direction.FORWARD);
			 update2();
				m2.setVisible(true);

		}

		if (e.getSource() == m2.down) {
			m2.setVisible(true);
			try {
				for (int i = 0; i < ((Wizard) tournament.getSecondTask()
						.getCurrentChamp()).getSpells().size(); i++) {
					if (((Wizard) tournament.getSecondTask().getCurrentChamp())
							.getSpells().get(i).getName()
							.equals(m2.spells.getSelectedItem())
							&& ((Wizard) tournament.getSecondTask()
									.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell)
						tournament.getSecondTask().castDamagingSpell(
								(DamagingSpell) ((Wizard) tournament
										.getSecondTask().getCurrentChamp())
										.getSpells().get(i), Direction.BACKWARD);
				//	update();
					break;
				}
			} catch (InCooldownException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (NotEnoughIPException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showConfirmDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			// Point p1 =new Point();
			// p1=tournament.getFirstTask().getTargetPoint(Direction.FORWARD);
			 update2();
				m2.setVisible(true);

		}
	
		
		

			if (e.getSource() == m2.right) {
				m2.setVisible(true);
				try {
					for (int i = 0; i < ((Wizard) tournament.getSecondTask()
							.getCurrentChamp()).getSpells().size(); i++) {
						if (((Wizard) tournament.getSecondTask().getCurrentChamp())
								.getSpells().get(i).getName()
								.equals(m2.spells.getSelectedItem())
								&& ((Wizard) tournament.getSecondTask()
										.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell)
							tournament.getSecondTask().castDamagingSpell(
									(DamagingSpell) ((Wizard) tournament
											.getSecondTask().getCurrentChamp())
											.getSpells().get(i), Direction.RIGHT);
					//	update();
						break;
					}
				} catch (InCooldownException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (NotEnoughIPException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (OutOfBordersException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (InvalidTargetCellException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (IOException e1) {
					JOptionPane.showConfirmDialog(null, e1.getMessage());
					e1.printStackTrace();
				}
				// Point p1 =new Point();
				// p1=tournament.getFirstTask().getTargetPoint(Direction.FORWARD);
				 update2();
					m2.setVisible(true);

			}
		
		
		

			if (e.getSource() == m2.left) {
				m2.setVisible(true);
				try {
					for (int i = 0; i < ((Wizard) tournament.getSecondTask()
							.getCurrentChamp()).getSpells().size(); i++) {
						if (((Wizard) tournament.getSecondTask().getCurrentChamp())
								.getSpells().get(i).getName()
								.equals(m2.spells.getSelectedItem())
								&& ((Wizard) tournament.getSecondTask()
										.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell)
							tournament.getSecondTask().castDamagingSpell(
									(DamagingSpell) ((Wizard) tournament
											.getSecondTask().getCurrentChamp())
											.getSpells().get(i), Direction.LEFT);
					//	update();
						break;
					}
				} catch (InCooldownException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (NotEnoughIPException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (OutOfBordersException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (InvalidTargetCellException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					e1.printStackTrace();
				} catch (IOException e1) {
					JOptionPane.showConfirmDialog(null, e1.getMessage());
					e1.printStackTrace();
				}
				// Point p1 =new Point();
				// p1=tournament.getFirstTask().getTargetPoint(Direction.FORWARD);
				 update2();
					m2.setVisible(true);

			}
		
		
		
		
		 
			m.label6.setText(""
					+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
							.getName());
			m.label7.setText(""
					+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
							.getHp());
			
			m.cn1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1)) //corner
							.getName());
			
			m.cn2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
					.getName());
			
			m.cn3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2)) // corner
					.getName());
			
			m.cn4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
					.getName());
			
			
			m.chp1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2))
					.getHp());
			
			m.chp2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
					.getHp());
			
			m.chp3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
					.getHp());
			
			m.chp4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1))
					.getHp());
			
			
			
			
			m.cip1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2))
					.getIp());
			
			m.cip2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
					.getIp());
			
			m.cip3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
					.getIp());
			
			m.cip4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1))
					.getIp());
			
	

			m2.label6.setText(""
					+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
							.getName());
			m2.label7.setText(""
					+ ((Wizard) tournament.getFirstTask().getCurrentChamp())
							.getHp());
			
			m2.cn1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1)) //corner
							.getName());
			
			m2.cn2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
					.getName());
			
			m2.cn3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2)) // corner
					.getName());
			
			m2.cn4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
					.getName());
			
			
			m2.chp1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2))
					.getHp());
			
			m2.chp2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
					.getHp());
			
			m2.chp3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
					.getHp());
			
			m2.chp4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1))
					.getHp());
			
			
			
			
			m2.cip1.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(2))
					.getIp());
			
			m2.cip2.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(3))
					.getIp());
			
			m2.cip3.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(0))
					.getIp());
			
			m2.cip4.setText("" + ((Wizard) tournament.getFirstTask().getChampions().get(1))
					.getIp());
			
			
			m.cinfospell1.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(0)).getSpells().get(0).getName());
			m.cinfospell5.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(0)).getSpells().get(1).getName());
			m.cinfospell9.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(0)).getSpells().get(2).getName());
			
			
			m.cinfospell2.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(1)).getSpells().get(0).getName());
			m.cinfospell6.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(1)).getSpells().get(1).getName());
			m.cinfospell10.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(1)).getSpells().get(2).getName());

			m.cinfospell3.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(2)).getSpells().get(0).getName());
			m.cinfospell7.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(2)).getSpells().get(1).getName());
			m.cinfospell11.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(2)).getSpells().get(2).getName());

			m.cinfospell4.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(3)).getSpells().get(0).getName());
			m.cinfospell8.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(3)).getSpells().get(1).getName());
			m.cinfospell12.setText("" + ((Wizard)tournament.getFirstTask().getChampions().get(3)).getSpells().get(2).getName());

			
			
//			if(((Wizard)tournament.getFirstTask().getChampions().get(0). != null)
//			m.cinfotrait1.setText("Yes");
//			else{
//				m.cinfotrait1.setText("Yes");

			
			
				
				
//		 try {
//		 for(int
//		 i=0;i<((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().size();i++){
//		 if(
//		 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i).getName().equals(m.spells.getSelectedItem())
//		 &&
//		 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i)
//		 instanceof DamagingSpell )
//		 tournament.getFirstTask().castDamagingSpell((DamagingSpell)
//		 ((Wizard)tournament.getFirstTask().getCurrentChamp()).getSpells().get(i),
//		 Direction.RIGHT);
//		 update();
//		 break;
//		 }
//		
//		 //
//		 tournament.getFirstTask().castDamagingSpell((DamagingSpell) m.spells.getSelectedItem(),
//		 Direction.RIGHT);
//		 } catch (InCooldownException e1) {
//		 // TODO Auto-generated catch block
//		 e1.printStackTrace();
//		 } catch (NotEnoughIPException e1) {
//		 // TODO Auto-generated catch block
//		 e1.printStackTrace();
//		 } catch (OutOfBordersException e1) {
//		 // TODO Auto-generated catch block
//		 e1.printStackTrace();
//		 } catch (InvalidTargetCellException e1) {
//		 // TODO Auto-generated catch block
//		 e1.printStackTrace();
//		 } catch (IOException e1) {
//		 // TODO Auto-generated catch block
//		 e1.printStackTrace();
//		 }
//		 // Point p1 =new Point();
//		 // p1=tournament.getFirstTask().getTargetPoint(Direction.RIGHT);
//		  update();
//		
//		 }
		


//		if (e.getSource() == m.cast){
//		try {
//			for (int i = 0; i < ((Wizard) tournament.getFirstTask()
//					.getCurrentChamp()).getSpells().size(); i++) {
//				if (((Wizard) tournament.getFirstTask().getCurrentChamp()).getSpells().get(i).getName().equals(m.spells.getSelectedItem())
//				&& ((Wizard) tournament.getFirstTask().getCurrentChamp()).getSpells().get(i) instanceof HealingSpell) {
//					tournament.getFirstTask().castHealingSpell((HealingSpell) ((Wizard) tournament
//									.getFirstTask().getCurrentChamp()).getSpells().get(i));
//			update();
//			}}
//			} catch (InCooldownException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (NotEnoughIPException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		}
		
		if(e.getSource()==m.trait)
		{
			m.setVisible(true);
			String inputValue = JOptionPane.showInputDialog("Please input the range");
			int x = Integer.parseInt(inputValue);
			
			
			String inputValue1 = JOptionPane.showInputDialog("Please input the 1st direction");
			String inputValue2 = JOptionPane.showInputDialog("Please input the 2nd direction");
		
			String d1 = inputValue1;
			
			Direction f = Direction.FORWARD;
			Direction b = Direction.BACKWARD;
			Direction l = Direction.LEFT;
			Direction r = Direction.RIGHT;
			
			Direction result = null;
			if(inputValue1.equals("up"))
				result = f;
			if(inputValue1.equals("down"))
				result = b;
			if(inputValue1.equals("left"))
				result = l;
			if(inputValue1.equals("right"))
				result = r;
			
			Direction result2 = null;
			
			if(inputValue2.equals("up"))
				result2 = f;
			if(inputValue2.equals("down"))
				result2 = b;
			if(inputValue2.equals("left"))
				result2 = l;
			if(inputValue2.equals("right"))
				result2 = r;
			
			
			
			
			
			
			
			
			
					
			
			
			
			
			
			
			for (int i = 0; i < ((Wizard) tournament.getFirstTask()
					.getCurrentChamp()).getSpells().size(); i++) {
				if (((Wizard) tournament.getFirstTask().getCurrentChamp())
						.getSpells().get(i).getName()
						.equals(m.spells.getSelectedItem())
						&& ((Wizard) tournament.getFirstTask()
								.getCurrentChamp()).getSpells().get(i) instanceof RelocatingSpell) {
					try {
						try {
							tournament.getFirstTask().castRelocatingSpell(
									(RelocatingSpell) ((Wizard) tournament
											.getFirstTask().getCurrentChamp())
											.getSpells().get(i), result, result2 ,x);
						} catch (OutOfRangeException e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
							e1.printStackTrace();
						}
					} catch (InCooldownException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					} catch (NotEnoughIPException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					} catch (OutOfBordersException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					} catch (InvalidTargetCellException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					}
					update();
//			m.p.setFocusable(true);
				break; }}}
			
			
			
			
			//m.dispose();
			
			
		
		
		
		
		
		
		
		for (int i = 0; i < ((Wizard) tournament.getFirstTask()
				.getCurrentChamp()).getSpells().size(); i++) {
			String k = ((Wizard) tournament.getFirstTask().getCurrentChamp())
					.getSpells().get(i).getName();
			m.spells.addItem(k);
		}
		
		
	
		
	
		
	
//end of task1 --------------------------------------------------------------------------------------------------------
		
		if(e.getSource()==m2.exit)
			System.exit(0);
		
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				m2.b[i][j].setFocusable(true);
				
				if (tournament.getSecondTask().getMap()[i][j] instanceof ChampionCell) {

					
					if(((Wizard)((ChampionCell)tournament.getSecondTask().getMap()[i][j]).getChamp()) instanceof HufflepuffWizard){
							
							m2.b[i][j].setIcon(new ImageIcon("champ2.jpg"));
							}
					
					if(((Wizard)((ChampionCell)tournament.getSecondTask().getMap()[i][j]).getChamp()) instanceof RavenclawWizard){
						m2.b[i][j].setIcon(new ImageIcon("champ3.jpg"));
					}
						if(((Wizard)((ChampionCell)tournament.getSecondTask().getMap()[i][j]).getChamp()) instanceof SlytherinWizard){
							m2.b[i][j].setIcon(new ImageIcon("champ4.png"));
						}
				if(((Wizard)((ChampionCell)tournament.getSecondTask().getMap()[i][j]).getChamp()) instanceof GryffindorWizard){
					m2.b[i][j].setIcon(new ImageIcon("champ5.png"));
				}

							m2.b[i][j].setToolTipText("HP = "
									+ ((Wizard) ((ChampionCell) tournament
											.getSecondTask().getMap()[i][j]).getChamp())
											.getHp());
							
						}
				if (tournament.getSecondTask().getMap()[i][j] instanceof EmptyCell)
					m2.b[i][j].setIcon(new ImageIcon("egg.jpg"));

				if (tournament.getSecondTask().getMap()[i][j] instanceof WallCell)
					m2.b[i][j].setIcon(new ImageIcon("wall2.png"));

				if (tournament.getSecondTask().getMap()[i][j] instanceof ObstacleCell) {

					m2.b[i][j].setToolTipText("HP = "
							+ ((ObstacleCell) tournament.getSecondTask()
									.getMap()[i][j]).getObstacle().getHp());
					m2.b[i][j].setIcon(new ImageIcon("obs2.png"));
				}
				if (tournament.getSecondTask().getMap()[i][j] instanceof CollectibleCell)
					m2.b[i][j].setIcon(new ImageIcon("egg.jpg"));
				if (i == 4 && j == 4)
					m2.b[i][j].setIcon(new ImageIcon("egg1.jpg"));
			}
		
		
		m2.label6.setText(""
				+ ((Wizard) tournament.getSecondTask().getCurrentChamp())
						.getName());
		m2.label7.setText(""
				+ ((Wizard) tournament.getSecondTask().getCurrentChamp())
						.getHp());
		
		m2.cn1.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(1)) //corner
						.getName());
		
		m2.cn2.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(0))
				.getName());
		
		m2.cn3.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(2)) // corner
				.getName());
		
		m2.cn4.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(3))
				.getName());
		
		
		m2.chp1.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(2))
				.getHp());
		
		m2.chp2.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(3))
				.getHp());
		
		m2.chp3.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(0))
				.getHp());
		
		m2.chp4.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(1))
				.getHp());
		
		
		
		
		m2.cip1.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(2))
				.getIp());
		
		m2.cip2.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(3))
				.getIp());
		
		m2.cip3.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(0))
				.getIp());
		
		m2.cip4.setText("" + ((Wizard) tournament.getSecondTask().getChampions().get(1))
				.getIp());
		}
			
		
//end of task 2---------------------------------------------------------------------------------------------------------------		
	

	
	

	public static void main(String[] args) throws IOException {
		new control();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int x = e.getKeyCode();
		Point p = new Point();

//		if (x == KeyEvent.VK_W) {
//
//			try {
//				for (int i = 0; i < ((Wizard) tournament.getFirstTask()
//						.getCurrentChamp()).getSpells().size(); i++) {
//					if (((Wizard) tournament.getFirstTask().getCurrentChamp())
//							.getSpells().get(i).getName()
//							.equals(m.spells.getSelectedItem())
//							&& ((Wizard) tournament.getFirstTask()
//									.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell) {
//						tournament.getFirstTask()
//								.castDamagingSpell(
//										(DamagingSpell) ((Wizard) tournament
//												.getFirstTask()
//												.getCurrentChamp()).getSpells()
//												.get(i), Direction.FORWARD);
//						update();
////						m.p.setFocusable(true);
//						break;
//					}
//					
//				}
//			} catch (InCooldownException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (NotEnoughIPException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (OutOfBordersException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (InvalidTargetCellException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (IOException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			}
//		}
//		// e1.printStackTrace();
//		// } catch (NotEnoughIPException e1) {
//		// // TODO Auto-generated catch block
//		// e1.printStackTrace();
//		// } catch (OutOfBordersException e1) {
//		// // TODO Auto-generated catch block
//		// e1.printStackTrace();
//		// } catch (InvalidTargetCellException e1) {
//		// // TODO Auto-generated catch block
//		// e1.printStackTrace();
//		// } catch (IOException e1) {
//		// // TODO Auto-generated catch block
//		// e1.printStackTrace();
//		// }
//		//
//		// }
//		//
//		if (x == KeyEvent.VK_A) {
//			try {
//				for (int i = 0; i < ((Wizard) tournament.getFirstTask()
//						.getCurrentChamp()).getSpells().size(); i++) {
//					if (((Wizard) tournament.getFirstTask().getCurrentChamp())
//							.getSpells().get(i).getName()
//							.equals(m.spells.getSelectedItem())
//							&& ((Wizard) tournament.getFirstTask()
//									.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell) {
//						tournament.getFirstTask()
//								.castDamagingSpell(
//										(DamagingSpell) ((Wizard) tournament
//												.getFirstTask()
//												.getCurrentChamp()).getSpells()
//												.get(i), Direction.LEFT);
//						update();
////						m.p.setFocusable(true);
//						break;
//					}
//					
//				}
//			} catch (InCooldownException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (NotEnoughIPException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (OutOfBordersException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (InvalidTargetCellException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (IOException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			}
//		}
//		if (x == KeyEvent.VK_D) {
//			try {
//				for (int i = 0; i < ((Wizard) tournament.getFirstTask()
//						.getCurrentChamp()).getSpells().size(); i++) {
//					if (((Wizard) tournament.getFirstTask().getCurrentChamp())
//							.getSpells().get(i).getName()
//							.equals(m.spells.getSelectedItem())
//							&& ((Wizard) tournament.getFirstTask()
//									.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell) {
//						tournament.getFirstTask()
//								.castDamagingSpell(
//										(DamagingSpell) ((Wizard) tournament
//												.getFirstTask()
//												.getCurrentChamp()).getSpells()
//												.get(i), Direction.RIGHT);
//						update();
////						m.p.setFocusable(true);
//						break;
//					}
//					
//				}
//			} catch (InCooldownException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (NotEnoughIPException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (OutOfBordersException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (InvalidTargetCellException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (IOException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			}
//		}
//		//
//		//
//		//
//		//
//		//
//		// }
//		if (x == KeyEvent.VK_S) {
//
//			try {
//				for (int i = 0; i < ((Wizard) tournament.getFirstTask()
//						.getCurrentChamp()).getSpells().size(); i++) {
//					if (((Wizard) tournament.getFirstTask().getCurrentChamp())
//							.getSpells().get(i).getName()
//							.equals(m.spells.getSelectedItem())
//							&& ((Wizard) tournament.getFirstTask()
//									.getCurrentChamp()).getSpells().get(i) instanceof DamagingSpell) {
//						tournament.getFirstTask()
//								.castDamagingSpell(
//										(DamagingSpell) ((Wizard) tournament
//												.getFirstTask()
//												.getCurrentChamp()).getSpells()
//												.get(i), Direction.BACKWARD);
//						update();
////						m.p.setFocusable(true);
//						break;
//					}
//					
//				}
//			} catch (InCooldownException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (NotEnoughIPException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (OutOfBordersException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (InvalidTargetCellException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			} catch (IOException e3) {
//				// TODO Auto-generated catch block
//				e3.printStackTrace();
//			}
//		}

		//
		// if(x==m.cast && m.spells.getSelectedItem() instanceof DamagingSpell)
		// p=((Wizard)tournament.getFirstTask().getCurrentChamp()).getLocation();
		// tournament.getFirstTask().castDamagingSpell(m.spells.getSelectedItem(),tournament.getFirstTask().getTargetPoint(Direction.BACKWARD));
		//
		// }

		// if(e.getSource()==m.cast && m.spells.getSelectedItem() instanceof
		// RelocatingSpell){
		//
		// }

		// }

		if (x == KeyEvent.VK_RIGHT) {
		//	p = ((Wizard) tournament.getFirstTask().getCurrentChamp())
			//		.getLocation();

			try {
				tournament.getFirstTask().moveRight();
				
//				m.b[p.x][p.y].setIcon(new ImageIcon("egg.jpg"));
//				m.b[p.x][p.y + 1].setIcon(new ImageIcon("champ2.jpg"));
				update();
			
				//tournament.getFirstTask().fire();
//				update();
				
			}
			catch (OutOfBordersException e2) {
				JOptionPane.showMessageDialog(null, e2.getMessage());
				e2.printStackTrace();
			} catch (InvalidTargetCellException e2) {
				JOptionPane.showMessageDialog(null, e2.getMessage());
				e2.printStackTrace();
			} catch (IOException e2) {
				JOptionPane.showMessageDialog(null, e2.getMessage());
				e2.printStackTrace();
			}
			
			

			p = ((Wizard) tournament.getFirstTask().getCurrentChamp())
					.getLocation();
			try {
				tournament.getSecondTask().moveRight();
				update2();
			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			
			
			}

		if (x == KeyEvent.VK_LEFT) {

			p = ((Wizard) tournament.getFirstTask().getCurrentChamp())
					.getLocation();

			
			try {				
				tournament.getFirstTask().moveLeft();
				
//				m.b[p.x][p.y].setIcon(new ImageIcon("egg.jpg"));
//				m.b[p.x][p.y - 1].setIcon(new ImageIcon("champ2.jpg"));
				update();
				
		//		tournament.getFirstTask().fire();
//				update();

			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			p = ((Wizard) tournament.getSecondTask().getCurrentChamp())
					.getLocation();
			try {
				tournament.getSecondTask().moveLeft();
				update2();
			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
		}
		if (x == KeyEvent.VK_DOWN) {

			p = ((Wizard) tournament.getFirstTask().getCurrentChamp())
					.getLocation();
			try {			

				tournament.getFirstTask().moveBackward();
				
				update();
//				m.b[p.x][p.y].setIcon(new ImageIcon("egg.jpg"));
//				m.b[p.x + 1][p.y].setIcon(new ImageIcon("champ2.jpg"));
			
			//	tournament.getFirstTask().fire();
//				update();

			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}

			p = ((Wizard) tournament.getSecondTask().getCurrentChamp())
					.getLocation();
			try {
				tournament.getSecondTask().moveBackward();
				update2();
			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			
			
		}
		if (x == KeyEvent.VK_UP) {

			p = ((Wizard) tournament.getFirstTask().getCurrentChamp())
					.getLocation();
			try {		

				tournament.getFirstTask().moveForward();
				
				update();
//				m.b[p.x][p.y].setIcon(new ImageIcon("egg.jpg"));
//				m.b[p.x - 1][p.y].setIcon(new ImageIcon("champ2.jpg"));
				
				//tournament.getFirstTask().fire();
				//update();

			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}

			p = ((Wizard) tournament.getSecondTask().getCurrentChamp())
					.getLocation();
			try {
				tournament.getSecondTask().moveForward();
				update2();
			} catch (OutOfBordersException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (InvalidTargetCellException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
			
		}
		if(x==KeyEvent.VK_H){
			for (int i = 0; i < ((Wizard) tournament.getFirstTask()
					.getCurrentChamp()).getSpells().size(); i++) {
				if (((Wizard) tournament.getFirstTask().getCurrentChamp()).getSpells().get(i).getName().equals(m.spells.getSelectedItem())
				&& ((Wizard) tournament.getFirstTask().getCurrentChamp()).getSpells().get(i) instanceof HealingSpell) {
					try {
						tournament.getFirstTask().castHealingSpell((HealingSpell) ((Wizard) tournament
										.getFirstTask().getCurrentChamp()).getSpells().get(i));
					} catch (InCooldownException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					} catch (NotEnoughIPException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					}
			update();
			break;
			
		}
			}
			for (int i = 0; i < ((Wizard) tournament.getSecondTask()
					.getCurrentChamp()).getSpells().size(); i++) {
				if (((Wizard) tournament.getSecondTask().getCurrentChamp()).getSpells().get(i).getName().equals(m.spells.getSelectedItem())
				&& ((Wizard) tournament.getSecondTask().getCurrentChamp()).getSpells().get(i) instanceof HealingSpell) {
					try {
						tournament.getFirstTask().castHealingSpell((HealingSpell) ((Wizard) tournament
										.getFirstTask().getCurrentChamp()).getSpells().get(i));
					} catch (InCooldownException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					} catch (NotEnoughIPException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						e1.printStackTrace();
					}
			update2();
			break;
			
		}
		}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
