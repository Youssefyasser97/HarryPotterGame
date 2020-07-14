package harrypotter.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class myFrame2 extends JFrame{
	
	JLabel label;
	JTextField txt;
	JLabel background;
	public JButton btn1;
	public JButton btn2;
	 public JButton btn3;
	 public JButton btn4;
	public JButton btn5;

	
	public myFrame2(){
		
//		this.addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		setBounds(0, 0, 1390, 781);
		setTitle("Harry Potter Game");
		setUndecorated(true);
		
		setLayout(null);
		background = new JLabel();
		label = new JLabel("PLAYER 3 CHOOSE YOUR HOUSE!");
		label.setFont(new Font("Harry P",Font.PLAIN,50));
		background.setIcon(new ImageIcon("houses1.jpg"));
		background.setBounds(0, 0, 1390,781);
		btn1=new JButton();
		btn2=new JButton();
		btn3=new JButton();
		btn4=new JButton();

		
		
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
			
			btn1.setBounds(77, 500, 220, 220);
			btn2.setBounds(420, 505, 225, 225);
			btn3.setBounds(770, 515, 220, 220);
			btn4.setBounds(1100, 520, 220, 220);
		
		
		
		
		
		btn5=new JButton();
		btn5.setBounds(100,717,200,50);
		btn5.setText("EXIT");
	//	btn5.addActionListener(this);
		btn5.setFont(new Font("Harry P",Font.PLAIN,40));
		btn5.setBackground(Color.black);
		
		

//
//		btn1.addActionListener(this);
//		btn2.addActionListener(this);
//		btn3.addActionListener(this);
//		btn4.addActionListener(this);
//			
			
	
		label.setBounds(300, 100, 630, 50);
		//label.setFont(font);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		
		
		
		getContentPane().add(label);
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		getContentPane().add(btn3);
		getContentPane().add(btn4);
		getContentPane().add(btn5);
		getContentPane().add(background);
		
		
	}

	public static void main(String[] args) {

		myFrame m = new myFrame();
		m.setVisible(true);

		String fonts[] = 
		GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for ( int i = 0; i < fonts.length; i++ )
		{
		System.out.println(fonts[i]);
		}
		
	}}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==btn1 || e.getSource()==btn2 || e.getSource()==btn3 || e.getSource()==btn4  ){
//			myFrame3 w=	new myFrame3();
//			w.setVisible(true);		
//	}
//		if(e.getSource()==btn5)
//			System.exit(0);
//
//		dispose();
//}

//	@Override
//	public void keyPressed(KeyEvent e) {
//		int x = e.getKeyCode();
//
//		if(x==KeyEvent.VK_ESCAPE){
//	
//	myFrame1 w=	new myFrame1();
//	w.setVisible(true);
//	dispose();
//}
//	}}

//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void actionPerformed(ActionEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}}
