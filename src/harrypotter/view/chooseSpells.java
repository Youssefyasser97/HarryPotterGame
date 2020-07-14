package harrypotter.view;

import harrypotter.controller.control;
import harrypotter.model.character.Wizard;
import harrypotter.model.magic.Spell;
import harrypotter.model.tournament.Tournament;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import harrypotter.model.tournament.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class chooseSpells extends JFrame  {
	
	public	JComboBox<String> combo ;
	public JComboBox<String> combo2;
	public  JComboBox<String> combo3 ;
	public JComboBox<String> combo4 ;
	public JComboBox<String> combo5 ;
	public JComboBox<String> combo6 ;
	public JComboBox<String> combo7 ;
	public JComboBox<String> combo8 ;
	public JComboBox<String> combo9 ;
	public JComboBox<String> combo10 ;
	public JComboBox<String> combo11 ;
	public JComboBox<String> combo12 ;
	private JButton exit;
	//control c;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel background;
	public JButton btn1;   //exit
	public JButton btn2;
    // public  JPanel panel1;
	//JPanel panel2;
//	JPanel panel3;
//	JPanel panel4 =new JPanel();
//	JPanel panel5 =new JPanel();
//	JPanel panel6 =new JPanel();
//	JPanel panel7 =new JPanel();
//	JPanel panel8 =new JPanel();
//	JPanel panel9 =new JPanel();
//	JPanel panel10 =new JPanel();
	//JPanel panel11 =new JPanel();
//	JPanel panel12 =new JPanel();

	public chooseSpells() throws IOException{
	//panel1 =new JPanel();
	// panel2 =new JPanel();
//		this.addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		//c= new control();
		setBounds(0, 0, 1390, 781);
		setTitle("Harry Potter Game");
		setUndecorated(true);
		
		setLayout(null);
		label1 = new JLabel("PLAYER 1 CHOOSE YOUR SPELLS!");
		label1.setBounds(100,100,400,50);
		label1.setFont(new Font("Harry P",Font.PLAIN,30));
		label1.setForeground(Color.WHITE);
		label2 = new JLabel("PLAYER 2 CHOOSE YOUR SPELLS!");
		label2.setFont(new Font("Harry P",Font.PLAIN,30));
		label2.setForeground(Color.WHITE);
		label2.setBounds(100,250,400,50);
		label3 = new JLabel("PLAYER 3 CHOOSE YOUR SPELLS!");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Harry P",Font.PLAIN,30));
		label3.setBounds(100,400,400,50);
		label4 = new JLabel("PLAYER 4 CHOOSE YOUR SPELLS!");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Harry P",Font.PLAIN,30));
		label4.setBounds(100,550,400,50);
		background = new JLabel();
		background.setIcon(new ImageIcon("dobby3.png"));
		background.setBounds(0, 0, 1390,781);
		//btn1=new JButton();
		btn2=new JButton();

//		btn1.setBounds(100,700,200,50);
//		btn1.setText("EXIT");
//		btn1.setEnabled(true);
//		//btn1.addActionListener(this);
//		btn1.setFont(new Font("Harry P",Font.PLAIN,40));
//		btn1.setBackground(Color.BLACK);
//		
		exit = new JButton();
		exit.setBounds(100, 700, 200, 50);
		exit.setText("EXIT");
		btn2.setIcon(new ImageIcon("next.png"));
		btn2.setBounds(1239, 625, 110, 119);
		//btn2.addActionListener(this);
		//btn2.setContentAreaFilled(false);
		//btn2.setBorderPainted(false);
		//btn2.setEnabled(true);
		
		
		combo = new JComboBox<String>();
		 combo2=new JComboBox<String>();
		 combo3=new JComboBox<String>();
		 combo4=new JComboBox<String>();
		 combo5=new JComboBox<String>();
		 combo6=new JComboBox<String>();
		 combo7=new JComboBox<String>();
		 combo8=new JComboBox<String>();
		 combo9=new JComboBox<String>();
		 combo10=new JComboBox<String>();
		 combo11=new JComboBox<String>();
		 combo12=new JComboBox<String>();
	//	Tournament x= new Tournament() ;
		//combo.addItem("select");
		
		
		
		combo.setVisible(true);
		combo.setBounds(110,160,150,27);
		combo2.setBounds(400, 160, 150, 27);
		combo3.setBounds(700, 160, 150, 27);
		combo4.setBounds(110, 300, 150, 27);
		combo5.setBounds(400, 300, 150, 27);
		combo6.setBounds(700, 300, 150, 27);
		combo7.setBounds(110, 450, 150, 27);
		combo8.setBounds(400, 450, 150, 27);
		combo9.setBounds(700, 450, 150, 27);
		combo10.setBounds(110, 600, 150, 27);
		combo11.setBounds(400, 600, 150, 27);
		combo12.setBounds(700, 600, 150, 27);
		//panel1.setBounds(0, 0, 1390,781);
       //panel1.setOpaque(false);		    	
     
//       
//      
//        panel2.setBounds(1170,250,150,27);
//        panel2.setOpaque(false);
//	
//		
		
   //  getContentPane().add(panel1);
		
		
		
      getContentPane().add(combo);
      getContentPane().add(combo2);
      getContentPane().add(combo3);
      getContentPane().add(combo4);
      getContentPane().add(combo5);
      getContentPane().add(combo6);
      getContentPane().add(combo7);
      getContentPane().add(combo8);
      getContentPane().add(combo9);
      getContentPane().add(combo10);
      getContentPane().add(combo11);
      getContentPane().add(combo12);
      
      
     getContentPane().add(label1);
     getContentPane().add(label2);
     getContentPane().add(label3);
     getContentPane().add(label4);
     getContentPane().add(exit);
     getContentPane().add(btn2);
     getContentPane().add(background);

		

		
		
	}
	
	
	
	
	public JButton getBtn1() {
		return btn1;
	}




	public JButton getBtn2() {
		return btn2;
	}

	


	public JButton getExit() {
		return exit;
	}




	public void setExit(JButton exit) {
		this.exit = exit;
	}




	public static void main(String[] args) throws IOException {
chooseSpells s = new chooseSpells();
s.setVisible(true);
	}




	
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==btn1)
//			System.exit(0);
//		if(e.getSource()==btn2)
//		this.dispose();
//		Map1 m = new Map1();
//		m.setVisible(true);
//	}

//	public void keyPressed(KeyEvent e) {
//		int x = e.getKeyCode();
//
//		if(x==KeyEvent.VK_ESCAPE){
//			
//			myFrame3 w=	new myFrame3();
//			w.setVisible(true);
//			dispose();
//		}		
//	}

//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
	
//	public void actionPerformed(ActionEvent e) {
//if(e.getSource()==btn1)
//	System.exit(0);
//
//	
//	else
//		if(e.getSource()==btn2){
//		Tournament x= null;
//((Wizard)x.getChampions().get(0)).getSpells().add((Spell) combo.getSelectedItem());
//((Wizard)x.getChampions().get(0)).getSpells().add((Spell) combo2.getSelectedItem());
//((Wizard)x.getChampions().get(0)).getSpells().add((Spell)combo3.getSelectedItem());
//
//((Wizard)x.getChampions().get(1)).getSpells().add((Spell)combo2.getSelectedItem());
//((Wizard)x.getChampions().get(1)).getSpells().add((Spell)combo2.getSelectedItem());
//((Wizard)x.getChampions().get(1)).getSpells().add((Spell)combo2.getSelectedItem());
//
//
//((Wizard)x.getChampions().get(2)).getSpells().add( (Spell)combo3.getSelectedItem());
//((Wizard)x.getChampions().get(2)).getSpells().add( (Spell)combo3.getSelectedItem());
//((Wizard)x.getChampions().get(2)).getSpells().add((Spell)combo3.getSelectedItem());
//
//
//((Wizard)x.getChampions().get(3)).getSpells().add((Spell)combo4.getSelectedItem());
//((Wizard)x.getChampions().get(3)).getSpells().add( (Spell)combo4.getSelectedItem());
//((Wizard)x.getChampions().get(3)).getSpells().add( (Spell)combo4.getSelectedItem());
//
//
//	}
//}




//
//	@Override
//	public void actionPerformed(ActionEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//
//	@Override
//	public void keyReleased(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//
//	@Override
//	public void keyTyped(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
}
