package harrypotter.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class java extends JFrame {
	JLabel label;
	JTextField txt;
	JLabel background;
	JButton btn1;

	public java(){
	
//		Timer t = new Timer(1500,this);    // Timer in 1.5 seconds
//		t.start();
//		t.setRepeats(false);
		
		
		
		
		
		

		
		
		setBounds(0, 0, 1390, 778);
		setUndecorated(true);
		setTitle("Harry Potter Game");
		//setLayout(null);
		background = new JLabel();
		btn1=new JButton();
		btn1.setBounds(0,0,1390,781);
//		btn1.addActionListener(this);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.setEnabled(true);
		
		background.setIcon(new ImageIcon("java.png"));
		background.setBounds(0, 0, 1390,778);
		
		getContentPane().add(btn1);
		getContentPane().add(background);
		
		
	}
	public static void main(String[] args) throws IOException {
		java s = new java();
		s.setVisible(true);
		
   	   }
	
	
	
	
	
	
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==btn1){
//			StartGame w=	new StartGame();
//			w.setVisible(true);
//			dispose();
//		}
//		
//		
//		
//		StartGame w = new StartGame();
//		w.setVisible(true);
//		this.dispose();
//	
//		//System.exit(0);
//	
//	}


	
	
	
}
