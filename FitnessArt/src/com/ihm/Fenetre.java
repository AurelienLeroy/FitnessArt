package com.ihm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class Fenetre extends JFrame implements Runnable,ActionListener {
	private Registration registration;
	private MainPage mainpage;
	private Jogging jogging;
	private Apnee apnee;
	private Progres progres;
	private Activity activity;
	
	public Fenetre(){
	    this.setTitle("FitnessArt");
	    this.setSize(1900, 1000);
	    this.setLocationRelativeTo(null);
	    
	    registration = new Registration();
	    registration.getRegis().addActionListener(new ActivityFunction());
	    registration.getBack().addActionListener(new MainpageFunction());
	    
	    mainpage = new MainPage();
	    mainpage.getRegisButton().addActionListener(new RegistrationFunction());
	    mainpage.getConnectButton().addActionListener(new ActivityFunction());
	    
	    
	    apnee = new Apnee();
	    jogging = new Jogging();
	    progres = new Progres();
	    
	    activity = new Activity();
	    activity.getBtnBack().addActionListener(new MainpageFunction());
	    activity.getBtnApnee().addActionListener(new ApneeFunction());
	    activity.getBtnJogging().addActionListener(new JoggingFunction());
	    
	    this.setContentPane(mainpage);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	  }
	
	
	
public Registration getRegistration() {
		return registration;
	}



	public void setRegistration(Registration registration) {
		this.registration = registration;
	}



	public MainPage getMainpage() {
		return mainpage;
	}



	public void setMainpage(MainPage mainpage) {
		this.mainpage = mainpage;
	}



	public Jogging getJogging() {
		return jogging;
	}



	public void setJogging(Jogging jogging) {
		this.jogging = jogging;
	}



	public Apnee getApnee() {
		return apnee;
	}



	public void setApnee(Apnee apnee) {
		this.apnee = apnee;
	}



	public Progres getProgres() {
		return progres;
	}



	public void setProgres(Progres progres) {
		this.progres = progres;
	}



	public Activity getActivity() {
		return activity;
	}



	public void setActivity(Activity activity) {
		this.activity = activity;
	}



	// Registration Page	
	public void registration() {
		this.setContentPane(registration);
		this.revalidate();
	}
	
	public void activity() {
		this.setContentPane(activity);
		this.revalidate();
	}
	
	public void progres() {
		this.setContentPane(progres);
		this.revalidate();
	}
	
	public void apnee() {
		this.setContentPane(apnee);
		this.revalidate();
	}
	
	public void jogging() {
		this.setContentPane(jogging.getPanel());
		this.revalidate();
	}
	
	public void mainpage() {
		this.setContentPane(mainpage);
		this.revalidate();
	}
	
	
	public class RegistrationFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.registration();			
		}		
	}
	
	public class MainpageFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.mainpage();			
		}		
	}
	
	public class ActivityFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.activity();			
		}		
	}
	
	public class ProgresFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.progres();			
		}		
	}
	
	public class ApneeFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.apnee();			
		}		
	}
	
	public class JoggingFunction implements ActionListener{

		/**
		 * Wait an action to be performed, react to the action
		 * @see MainWindow#acceuil()
		 */
		public void actionPerformed(ActionEvent e) {
			
			Fenetre.this.jogging();			
		}		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
