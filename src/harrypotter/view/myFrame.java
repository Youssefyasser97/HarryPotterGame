package harrypotter.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Timer;

import harrypotter.model.tournament.Tournament;
import harrypotter.model.character.*;
import harrypotter.view.NameWindow;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class myFrame extends JFrame {
JLabel label;
JLabel background;
public JButton btn1;
public JButton btn2;
public JButton btn3;
 public JButton btn4;
 public JButton btn5; //exit
private ActionListener listener;



public myFrame(){
	
	
	setBounds(0, 0, 1390, 781);
	setTitle("Harry Potter Game");
	setUndecorated(true);
	
	
	//this.addKeyListener(this);
	setFocusable(true);
	setFocusTraversalKeysEnabled(false);
	setLayout(null);
	background = new JLabel();
	label = new JLabel(	"PLAYER 1 CHOOSE YOUR HOUSE!");
	label.setFont(new Font("Harry P",Font.PLAIN,50));
	background.setIcon(new ImageIcon("houses1.jpg"));
	background.setBounds(0, 0, 1390,781);
	btn1=new JButton();
	
	//btn1.setIcon(new ImageIcon("F:\\gryflast.jpg"));
	btn2=new JButton();
	//btn2.setIcon(new ImageIcon("F:\\huffle.jpg"));
	btn3=new JButton();
	//btn3.setIcon(new ImageIcon("F:\\yoh.jpg"));
	btn4=new JButton();
	//btn4.setIcon(new ImageIcon("F:\\ahe.jpg"));

	
	btn5=new JButton();
	btn5.setBounds(100,717,200,50);
	btn5.setText("EXIT");
	btn5.setFont(new Font("Harry P",Font.PLAIN,40));
	btn5.setBackground(Color.black);
	
	
	
	
btn1.setContentAreaFilled(false);
	btn1.setBorderPainted(false);
	btn1.setEnabled(true);
	btn2.setContentAreaFilled(false);
	btn2.setBorderPainted(false);
	btn2.setEnabled(true);
	btn3.setContentAreaFilled(false);
	btn3.setBorderPainted(false);
	btn3.setEnabled(true);
	btn4.setContentAreaFilled(false);
	btn4.setBorderPainted(false);
	btn4.setEnabled(true);

//	btn1.addActionListener(this);
//	btn2.addActionListener(this);
//	btn3.addActionListener(this);
//	btn4.addActionListener(this);
//	btn5.addActionListener(this);
		
		
	btn1.setBounds(77, 500, 220, 220);
	btn2.setBounds(420, 505, 225, 225);
	btn3.setBounds(770, 515, 220, 220);
	btn4.setBounds(1100, 520, 220, 220);
	label.setBounds(150, 100, 630, 50);
	//label.setFont(font);
	//label.setBackground(Color.BLACK);
	label.setOpaque(true);
	
	
	getContentPane().add(label);
	getContentPane().add(btn1);
	getContentPane().add(btn2);
	getContentPane().add(btn3);
	getContentPane().add(btn4);
	getContentPane().add(btn5);
	getContentPane().add(background);
	//background.setIcon(arg0);
}
	public static void main(String[] args) {
myFrame m = new myFrame();
m.setVisible(true);

String fonts[] = 
GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

//for ( int i = 0; i < fonts.length; i++ )
//{
//System.out.println(fonts[i]);
//}



	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		if(e.getSource()==btn1 || e.getSource()==btn2 || e.getSource()==btn3 || e.getSource()==btn4  ){
//		myFrame1 w=	new myFrame1();
//		w.setVisible(true);
//		
//			//w.repaint();
//			//w.validate();
//	
//		}
//		String first;
//		GryffindorWizard w;
//		SlytherinWizard s;
//		
//		Tournament x = null;
//		if(e.getSource()==btn1)
//		 w =(GryffindorWizard) ((Wizard)x.getChampions().get(0));
//			if(e.getSource()==btn1)
//				
//				if(e.getSource()==btn1)
//					
//					
//					
//					if(e.getSource()==btn1)
//
//		
//		
//		
//		
//		if(e.getSource()==btn5)
//			System.exit(0);
//		dispose();
//	}
//	public void keyPressed(KeyEvent e) {
//		//System.out.println("ygvbhunji");
//int x = e.getKeyCode();
//
//if(x==KeyEvent.VK_ESCAPE){
//	
//	NameWindow w = null;
//	try {
//		w = new NameWindow();
//	} catch (IOException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//	w.setVisible(true);
//	dispose();
//}
//		
//		
//	}
//	@Override
//	public void keyReleased(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void keyTyped(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void actionPerformed(ActionEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	
	
	
	
	
	
	
	
	
	
	

}
