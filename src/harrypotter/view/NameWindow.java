package harrypotter.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import harrypotter.model.character.Wizard;
import harrypotter.model.magic.Spell;
import harrypotter.model.tournament.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.media.jfxmedia.AudioClip;

public class NameWindow extends JFrame {

	
	
	JPanel panel;
	JLabel label;
	JLabel label1;
	JLabel label2;
	JLabel label3;
public JTextField txt;
public static JTextField txt2;
public 	JTextField txt3;
public	JTextField txt4;
	
	JLabel background;
	public JButton btn1;
	public JButton btn2;
	
	JComboBox<String>combo;
//JPanel panel1 =new JPanel();
//	JPanel panel2 =new JPanel();
//	JPanel panel3 =new JPanel();
//	JPanel panel4 =new JPanel();
//	JPanel panel5 =new JPanel();
//	JPanel panel6 =new JPanel();
//	JPanel panel7 =new JPanel();
//	JPanel panel8 =new JPanel();
//	JPanel panel9 =new JPanel();
//	JPanel panel10 =new JPanel();
//	JPanel panel11 =new JPanel();
//	JPanel panel12 =new JPanel();
	//Tournament tournament = new Tournament();
	
	public NameWindow() throws IOException{
		
		
		
		//code for spells
//		combo = new JComboBox<String>();
//		this.tournament= new  Tournament();
//		for(int i=0;i<(tournament.getSpells().size());i++){
//			
//			String k= tournament.getSpells().get(i).getName();
//			combo.addItem(k);
//		}
//		combo.setVisible(true);
//		panel1.add(combo);
//		getContentPane().add(panel1);
//		panel1.setBounds(1000,350,200,28);
//code for spells
		
		
	

//		this.addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		
	
		//panel1.add(combo);
		//getContentPane().add(panel1);
//		panel1.setBounds(1000,350,200,28);
//		panel2.setBounds(1000,350,200,28);
//		panel3.setBounds(1000,350,200,28);
//		panel4.setBounds(1000,350,200,28);
//		panel5.setBounds(1000,350,200,28);
//		panel6.setBounds(1000,350,200,28);
//		panel7.setBounds(1000,350,200,28);
//		panel8.setBounds(1000,350,200,28);
//		panel9.setBounds(1000,350,200,28);
//		panel10.setBounds(1000,350,200,28);
//		panel11.setBounds(1000,350,200,28);
//		panel12.setBounds(1000,350,200,28);
//	
		
		
		
	txt= new JTextField();
	
	
	
	txt2= new JTextField();
	txt3= new JTextField();
	txt4= new JTextField();
	setBounds(0, 0, 1390, 781);
	setUndecorated(true);
	setTitle("Harry Potter Game");
	setLayout(null);
	background = new JLabel();
	label = new JLabel("PLAYER 1 ENTER YOUR NAME");
	
	label.setFont(new Font("Harry P",Font.PLAIN,40));
	
	label1 = new JLabel("PLAYER 2 ENTER YOUR NAME");
	label1.setBounds(80,220,490,180);
	label1.setForeground(Color.white);
	label1.setFont(new Font("Harry P",Font.PLAIN,40));
	
	label2 = new JLabel("PLAYER 3 ENTER YOUR NAME");
	label2.setBounds(80,370,490,180);
	label2.setForeground(Color.white);
	label2.setFont(new Font("Harry P",Font.PLAIN,40));
	
	label3 = new JLabel("PLAYER 4 ENTER YOUR NAME");
	label3.setBounds(80,520,490,180);
	label3.setForeground(Color.white);
	label3.setFont(new Font("Harry P",Font.PLAIN,40));
	
	btn1=new JButton();
	btn1.setIcon(new ImageIcon("next.png"));
	btn1.setBounds(1210, 550, 120, 129);

	btn1.setContentAreaFilled(false);
	btn1.setBorderPainted(false);
	btn1.setEnabled(true);
	
	btn2=new JButton();
	btn2.setBounds(100,650,200,50);
	btn2.setText("EXIT");
	btn2.setFont(new Font("Harry P",Font.PLAIN,40));
	btn2.setBackground(Color.black);
	//btn2.setActionCommand("e5rog");

	
	txt.setToolTipText("Name 1");
	txt2.setToolTipText("Name 2");
	txt3.setToolTipText("Name 3");
	txt4.setToolTipText("Name 4");

	
	label.setBounds(80,70,490,180);
	label.setForeground(Color.white);
	txt.setBounds(550,150,200,20);
	txt2.setBounds(550,300,200,20);
	txt3.setBounds(550,450,200,20);
	txt4.setBounds(550,600,200,20);
//	txt4.setEditable(false);
	
	
	
	background.setIcon(new ImageIcon("pa.gif"));
	background.setBounds(0, -10, 1390,781);
	setBackground(Color.BLACK);
	
	getContentPane().add(btn1);
	getContentPane().add(btn2);
	getContentPane().add(label);
	getContentPane().add(label1);
	getContentPane().add(label2);
	getContentPane().add(label3);
	getContentPane().add(txt);
	getContentPane().add(txt2);
	getContentPane().add(txt3);
	getContentPane().add(txt4);
	getContentPane().add(background);
	
	}
	
	public JTextField getTxt() {
		return txt;
	}

	public static void main(String[] args) throws IOException {
		NameWindow w = new NameWindow();
		w.setVisible(true);
		String fonts[] = 
			      GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

			    for ( int i = 0; i < fonts.length; i++ )
			    {
			      System.out.println(fonts[i]);
			    }
			  }
	

	public JPanel getPanel() {
		return panel;
	}

	public JLabel getLabel() {
		return label;
	}

	public JLabel getLabel1() {
		return label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public JLabel getLabel3() {
		return label3;
	}

	public JTextField getTxt2() {
		return txt2;
	}

	public JTextField getTxt3() {
		return txt3;
	}

	public JTextField getTxt4() {
		return txt4;
	}

	

	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}
	

	public JComboBox<String> getCombo() {
		return combo;
	}

	

//	public void keyPressed(KeyEvent e) {
//		int x = e.getKeyCode();
//		if(x==KeyEvent.VK_ENTER && (txt4.getText().equals(""))){
////			txt4.setEditable(false);
////			txt4.setEnabled(false);
//			myFrame f = new myFrame();
//			f.setVisible(true);
//			}		
//		
//	
//			if(x==KeyEvent.VK_ESCAPE){
//				
//				StartGame w=	new StartGame();
//				w.setVisible(true);
//			
//			}
//
//	}
//
//	@Override
//	public void keyReleased(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyTyped(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//
//	
	
	
}
