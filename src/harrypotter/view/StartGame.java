package harrypotter.view;

import java.awt.Color;
import java.io.*;

import sun.audio.*;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.sun.media.jfxmedia.AudioClip;

public class StartGame extends JFrame {
	public JLabel label;
	public JTextField txt;
	public JLabel background;
	public JButton btn1;
	File wavFile = new File("harry1.wav");
	AudioClip sound;
	
	public StartGame(){
		
		playSound();
//		this.addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		setBounds(0, 0, 1390, 781);
		setUndecorated(true);
		setTitle("Harry Potter Game");
		setLayout(null);
		background = new JLabel();
		btn1=new JButton();
		
		btn1.setIcon(new ImageIcon("start1.gif"));
		//btn1.setVisible(false);
		
		btn1.setBounds(1050, 300, 200, 200);
		btn1.setFont(new Font("Harry P",Font.PLAIN,50));
//		btn1.addActionListener(this);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.setEnabled(true);
	
	background.setIcon(new ImageIcon("ana.jpg"));
		background.setBounds(0, 0, 1390,781);
		//setBackground(Color.BLACK);
		
		

		getContentPane().add(btn1);
		getContentPane().add(background);
		
	}
	public static void main(String[] args) throws IOException {
		StartGame s = new StartGame();
		s.setVisible(true);
		String fonts[] = 
			      GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

			    for ( int i = 0; i < fonts.length; i++ )
			    {
			      System.out.println(fonts[i]);
			    }
			    
			
	}
			  
	
			
//
//	public void actionPerformed(ActionEvent e) {
//		
//		
//		if(e.getSource()==btn1){
//			NameWindow w = null;
//			try {
//				w = new NameWindow();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			w.setVisible(true);
//			dispose();
//		}
//		
//	}
//	@Override
//	public void keyPressed(KeyEvent e) {
//		int x = e.getKeyCode();
//
//		if(x==KeyEvent.VK_ESCAPE){
//			
//			int z = JOptionPane.showConfirmDialog(this, "Eda 3ayez t2felny? :(");
//			
//			if(z==0)
//				System.exit(0);
//		}
//		if(x==KeyEvent.VK_ENTER){
//		NameWindow w = null;
//		try {
//			w = new NameWindow();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		w.setVisible(true);
//			//dispose();
//		}
//		
//		
//	}
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	

	public void playSound() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("harry1.wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch(Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}
}

